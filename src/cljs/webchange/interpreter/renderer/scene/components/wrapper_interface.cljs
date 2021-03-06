(ns webchange.interpreter.renderer.scene.components.wrapper-interface
  (:require
    [webchange.logger :as logger]))

(defn- execute
  [wrapper method-name params]
  (if-not (nil? wrapper)
    (try
      (let [method (get wrapper method-name)]
        (if-not (nil? method)
          (apply method params)
          (logger/warn (str "Method " method-name " is not implemented for " (:type wrapper)))))
      (catch js/Error e
        (logger/error (str "[Wrapper Interface] Failed to execute <" method-name ">"))
        (logger/error e)))
    (logger/error (str "[Wrapper Interface] Failed to execute <" method-name "> method: wrapper is nil"))))

(defn add-animation [wrapper & params] (execute wrapper :add-animation params))
(defn add-filter [wrapper & params] (execute wrapper :add-filter params))
(defn get-data [wrapper & params] (execute wrapper :get-data params))
(defn get-filter-value [wrapper & params] (execute wrapper :get-filter-value params))
(defn get-opacity [wrapper & params] (execute wrapper :get-opacity params))
(defn get-position [wrapper & params] (execute wrapper :get-position params))
(defn get-rotation [wrapper & params] (execute wrapper :get-rotation params))
(defn play [wrapper & params] (execute wrapper :play-video params))
(defn remove-animation [wrapper & params] (execute wrapper :remove-animation params))
(defn set-animation [wrapper & params] (execute wrapper :set-animation params))
(defn set-data [wrapper & params] (execute wrapper :set-data params))
(defn set-filter-value [wrapper & params] (execute wrapper :set-filter-value params))
(defn set-opacity [wrapper & params] (execute wrapper :set-opacity params))
(defn set-position [wrapper & params] (execute wrapper :set-position params))
(defn set-rotation [wrapper & params] (execute wrapper :set-rotation params))
(defn set-scale [wrapper & params] (execute wrapper :set-scale params))
(defn set-skin [wrapper & params] (execute wrapper :set-skin params))
(defn set-slot [wrapper & params] (execute wrapper :set-slot params))
(defn set-src [wrapper & params] (execute wrapper :set-src params))
(defn set-text [wrapper & params] (execute wrapper :set-text params))
(defn set-font-size [wrapper & params] (execute wrapper :set-font-size params))
(defn set-value [wrapper & params] (execute wrapper :set-value params))
(defn set-visibility [wrapper & params] (execute wrapper :set-visibility params))
(defn start-animation [wrapper & params] (execute wrapper :start-animation params))
(defn set-filter [wrapper & params] (execute wrapper :set-filter params))
(defn stop [wrapper & params] (execute wrapper :stop-video params))
(defn set-tool [wrapper & params] (execute wrapper :set-tool params))
(defn set-color [wrapper & params] (execute wrapper :set-color params))
(defn set-interactive [wrapper & params] (execute wrapper :set-interactive params))

(defn set-path [wrapper & params] (execute wrapper :set-path params))
(defn set-stroke [wrapper & params] (execute wrapper :set-stroke params))
(defn animated-svg-path-start [wrapper & params] (execute wrapper :animated-svg-path-start params))
(defn animated-svg-path-stop [wrapper & params] (execute wrapper :animated-svg-path-stop params))
(defn animated-svg-path-reset [wrapper & params] (execute wrapper :animated-svg-path-reset params))
(defn set-traffic-light [wrapper & params] (execute wrapper :set-traffic-light params))
