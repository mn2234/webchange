(ns webchange.interpreter.renderer.scene.components.wrapper-interface
  (:require
    [webchange.logger :as logger]))

(defn- execute
  [wrapper method-name params]
  (try
    (let [method (get wrapper method-name)]
      (if-not (nil? method)
        (apply method params)
        (logger/warn (str "Method " method-name " is not implemented for " (:type wrapper)))))
    (catch js/Error e
      (logger/error (str "[Wrapper Interface] Failed to execute <" method-name ">"))
      (logger/error e))))

(defn add-animation [wrapper & params] (execute wrapper :add-animation params))
(defn add-filter [wrapper & params] (execute wrapper :add-filter params))
(defn get-data [wrapper & params] (execute wrapper :get-data params))
(defn get-filter-value [wrapper & params] (execute wrapper :get-filter-value params))
(defn get-position [wrapper & params] (execute wrapper :get-position params))
(defn remove-animation [wrapper & params] (execute wrapper :remove-animation params))
(defn set-animation [wrapper & params] (execute wrapper :set-animation params))
(defn set-filter-value [wrapper & params] (execute wrapper :set-filter-value params))
(defn set-position [wrapper & params] (execute wrapper :set-position params))
(defn set-scale [wrapper & params] (execute wrapper :set-scale params))
(defn set-skin [wrapper & params] (execute wrapper :set-skin params))
(defn set-slot [wrapper & params] (execute wrapper :set-slot params))
(defn set-src [wrapper & params] (execute wrapper :set-src params))
(defn set-text [wrapper & params] (execute wrapper :set-text params))
(defn set-value [wrapper & params] (execute wrapper :set-value params))
(defn set-visibility [wrapper & params] (execute wrapper :set-visibility params))
(defn start-animation [wrapper & params] (execute wrapper :start-animation params))
(defn get-rotation [wrapper & params] (execute wrapper :get-rotation params))
(defn set-rotation [wrapper & params] (execute wrapper :set-rotation params))
(defn set-filter [wrapper & params] (execute wrapper :set-filter params))
(defn get-opacity [wrapper & params] (execute wrapper :get-opacity params))
(defn set-opacity [wrapper & params] (execute wrapper :set-opacity params))
