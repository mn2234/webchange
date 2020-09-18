(ns webchange.interpreter.renderer.stage
  (:require
    [reagent.core :as r]
    [webchange.interpreter.pixi :refer [Loader]]
    [webchange.interpreter.renderer.loader-screen :refer [loader-screen]]
    [webchange.interpreter.renderer.scene.scene :refer [scene]]
    [webchange.resources.manager :as resources]
    [webchange.interpreter.renderer.stage-utils :refer [get-stage-params]]))

(defn- init-scene
  [new-scene-data current-scene-data loading]
  (when (and (not (nil? new-scene-data))
             (not= new-scene-data @current-scene-data))
    (reset! current-scene-data new-scene-data)
    (reset! loading {:done false :progress 0})
    (resources/load-resources (:resources @current-scene-data)
                              {:on-complete #(swap! loading assoc :done true)
                               :on-progress #(swap! loading assoc :progress %)})))

(defn- element->viewport
  [el]
  (if-not (nil? el)
    (let [bound-rect (.getBoundingClientRect el)]
      {:width  (.-width bound-rect)
       :height (.-height bound-rect)})
    {:width  100
     :height 100}))

(defn stage
  []
  (let [container (r/atom nil)
        loading (r/atom {:done     false
                         :progress 0})
        current-scene-data (r/atom nil)]
    (r/create-class
      {:display-name "web-gl-scene"
       :component-did-mount
                     (fn [this]
                       (resources/init (Loader.))
                       (let [{:keys [scene-data]} (r/props this)]
                         (init-scene scene-data current-scene-data loading)))
       :component-did-update
                     (fn [this]
                       (let [{:keys [scene-data]} (r/props this)]
                         (init-scene scene-data current-scene-data loading)))
       :reagent-render
                     (fn [{:keys [mode on-ready on-start-click]}]
                       (let [viewport (-> (element->viewport @container)
                                          (get-stage-params))]
                         [:div {:ref   #(when % (reset! container (.-parentNode %)))
                                :style {:width  "100%"
                                        :height "100%"}}
                          (when (and (:done @loading)
                                     (or (= mode "editor")
                                         (:started? @current-scene-data)))
                            [scene {:mode     mode
                                    :objects  (:objects @current-scene-data)
                                    :viewport viewport
                                    :on-ready on-ready
                                    :started? (:started? @current-scene-data)}])
                          (when (or (not (:done @loading))
                                    (and (not (:started? @current-scene-data))
                                         (not= mode "editor")))
                            (let [scale-x (:scale-x viewport)
                                  scale-y (:scale-y viewport)
                                  translate-x (* -100 (- (/ 1 (* 2 scale-x)) 0.5))
                                  translate-y (* -100 (- (/ 1 (* 2 scale-y)) 0.5))]
                              [:div {:style {:position  "absolute"
                                             :transform (str "scale(" scale-x ", " scale-y ")"
                                                             "translate(" translate-x "%, " translate-y "%)")
                                             :width     (:display-width viewport)
                                             :height    (:display-height viewport)}}
                               [loader-screen {:on-start-click on-start-click
                                               :loading        @loading}]]))]))})))