(ns webchange.editor-v2.wizard.views-activity
  (:require
    [cljs-react-material-ui.reagent :as ui]
    [re-frame.core :as re-frame]
    [reagent.core :as r]
    [webchange.editor-v2.layout.views :refer [layout]]
    [webchange.editor-v2.wizard.state.activity :as state-activity]
    [webchange.editor-v2.wizard.views-activity-characters :refer [characters-option]]
    [webchange.editor-v2.wizard.views-activity-lookup :refer [lookup-option]]
    [webchange.editor-v2.wizard.views-activity-pages :refer [pages-option]]
    [webchange.editor-v2.wizard.views-activity-string :refer [string-option]]
    [webchange.ui.theme :refer [get-in-theme]]))

(defn- get-styles
  []
  {:card                 {:margin      "12px"
                          :flex-shrink "0"}
   :control-container    {:margin-top "-8px"}
   :control              {:min-width "500px"}
   :template-description {:border           "solid 1px"
                          :border-color     "rgba(0,0,0,0)"
                          :background-color (get-in-theme [:palette :background :darken])
                          :color            (get-in-theme [:palette :text :secondary])
                          :padding          "12px 18px"
                          :border-radius    "10px"}
   :actions              {:padding "24px"}})

(defn- render-selected
  [selected]
  (let [skills (->> @(re-frame/subscribe [::state-activity/skills])
                    :skills
                    (map (juxt :id identity))
                    (into {}))
        values (->> selected
                    vals
                    (map #(get skills %)))]
    [ui/list {:style {:padding 0}}
     (for [value values]
       [ui/list-item {:key   (:id value)
                      :style {:padding-left 0
                              :white-space  "normal"}}
        (:name value)])]))

(def react-render-selected (r/reactify-component render-selected))

(defn- option-info
  [key option data]
  (case (:type option)
    "characters" [characters-option key option data]
    "lookup" [lookup-option key option data]
    "pages" [pages-option key option data]
    "string" [string-option key option data]
    nil))

(defn template-info
  [template data]
  [ui/grid {:container   true
            :justify     "space-between"
            :spacing     24
            :align-items "center"}
   (for [[key option] (:options template)]
     ^{:key key}
     [ui/grid {:item true :xs 12}
      [option-info key option data]])])

(defn activity-skill-info
  [data]
  (let [skills (-> @(re-frame/subscribe [::state-activity/skills]) :skills)
        styles (get-styles)]
    [ui/form-control {:style (:control-container styles)}
     [ui/input-label "Skills"]
     [ui/select {:multiple     true
                 :render-value #(r/create-element react-render-selected %)
                 :value        (:skills @data)
                 :on-change    #(swap! data assoc :skills (->> % .-target .-value))
                 :style        (:control styles)}
      (for [skill skills]
        ^{:key (:id skill)}
        [ui/menu-item {:value (:id skill)} (:name skill)])]]))

(defn- activity-info
  [{:keys [data]}]
  (let [templates @(re-frame/subscribe [::state-activity/templates])
        current-template (->> templates (filter #(= (:template-id @data) (:id %))) first)
        handle-change-template (fn [template-id]
                                 (when (some? current-template)
                                   (doseq [[key] (:options current-template)]
                                     (swap! data dissoc key)))
                                 (swap! data assoc :template-id template-id))
        styles (get-styles)]
    [ui/grid {:container   true
              :justify     "center"
              :spacing     16
              :align-items "center"}
     [ui/grid {:item true :xs 12}
      [ui/text-field {:label         "Name"
                      :variant       "outlined"
                      :default-value (:name @data)
                      :style         (:control styles)
                      :on-change     #(swap! data assoc :name (-> % .-target .-value))}]]
     [ui/grid {:item true :xs 12}
      [activity-skill-info data]]
     [ui/grid {:item true :xs 12}
      [ui/form-control {:style (:control-container styles)}
       [ui/input-label "Template"]
       [ui/select {:value     (or (:template-id @data) "")
                   :on-change #(handle-change-template (-> % .-target .-value))
                   :style     (:control styles)}
        (for [template templates]
          ^{:key (:id template)}
          [ui/menu-item {:value (:id template)} (:name template)])]]]
     (when (some? current-template)
       [ui/grid {:item true :xs 12} [ui/divider]])
     (when (some? current-template)
       [ui/grid {:item true :xs 12}
        [ui/typography {:variant "body1"
                        :style   (:template-description styles)}
         (:description current-template)]])
     (when (some? current-template)
       [ui/grid {:item true :xs 12}
        [template-info current-template data]])]))

(defn create-activity-panel
  [course-slug]
  (re-frame/dispatch [::state-activity/load-templates])
  (re-frame/dispatch [::state-activity/load-skills])
  (r/with-let [data (r/atom {:skills []})]
              (let [styles (get-styles)]
                [layout {:title "Activity"
                         :align "Center"}
                 [ui/card {:style (:card styles)}
                  [ui/dialog-title
                   "Create Activity"]
                  [ui/card-content
                   [ui/grid {:container   true
                             :justify     "center"
                             :spacing     24
                             :align-items "center"}
                    [ui/grid {:item true :xs 12}
                     [activity-info {:data data}]]]]
                  [ui/card-actions {:style (:actions styles)}
                   [ui/button {:color    "secondary"
                               :style    {:margin-left "auto"}
                               :on-click #(re-frame/dispatch [::state-activity/create-activity course-slug @data])}
                    "Save"]]]])))