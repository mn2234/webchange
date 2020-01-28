(ns webchange.editor-v2.translator.translator-form.utils
  (:require
    [webchange.editor-v2.graph-builder.graph :refer [get-diagram-graph]]))

(defn get-graph
  [scene-data action-name concept-data]
  (when-not (nil? action-name)
    (get-diagram-graph scene-data :translation {:start-node   action-name
                                                :concept-data concept-data})))

(defn- get-scene-asset-audios
  [scene-data]
  (->> (:assets scene-data)
       (filter (fn [{:keys [type]}] (= type "audio")))
       (map (fn [{:keys [alias url]}]
              {:alias alias
               :key   url
               :url   url}))))

(defn- get-scene-external-audios
  [scene-data]
  (->> (:audio scene-data)
       (map (fn [[key url]]
              {:alias nil
               :key   (name key)
               :url   url}))))

(defn- get-concepts-audios
  [graph]
  (reduce
    (fn [result [_ action-data]]
      (if (get-in action-data [:data :concept-action])
        (let [{:keys [id audio]} (:data action-data)
              url (or id audio)]
          (conj result {:alias nil
                        :key   url
                        :url   url}))
        result))
    []
    graph))

(defn filter-no-url
  [audios]
  (filter
    (fn [{:keys [key]}]
      (-> key nil? not))
    audios))

(defn update-alias
  [map url alias]
  (if-not (nil? alias)
    (assoc-in map [url :alias] alias)
    map))

(defn update-key
  [map url key]
  (if-not (= key url)
    (assoc-in map [url :key] key)
    map))

(defn audios-distinct
  [audios]
  (->> audios
       (reduce
         (fn [result {:keys [alias key url] :as audio}]
           (if-not (contains? result url)
             (assoc result url audio)
             (-> result
                 (update-alias url alias)
                 (update-key url key))))
         {})
       (vals)
       (vec)))

(defn get-audios
  [scene-data graph]
  (->> (concat (get-scene-asset-audios scene-data)
               (get-scene-external-audios scene-data)
               (get-concepts-audios graph))
       (filter-no-url)
       (audios-distinct)))

(defn audios->assets
  [audios]
  (map (fn [url] {:type "audio"
                  :size 1
                  :url  url}) audios))

(defn get-scene-action-data
  [selected-node-data]
  (let [action-name (-> selected-node-data :name keyword)
        action-data (:data selected-node-data)]
    [:scene nil action-name action-data]))

(defn get-concept-action-data
  [selected-node-data current-concept-data]
  (let [action-id (:id current-concept-data)
        action-name (-> selected-node-data :name keyword)
        action-data (:data selected-node-data)]
    [:concept action-id action-name action-data]))

(defn update-with-current-data
  [action-name action-data data-store]
  (let [edited-action-data (get-in data-store [action-name :data])]
    (merge action-data edited-action-data)))

(defn get-current-action-data
  [selected-node-data current-concept-data data-store]
  (let [concept-action? (get-in selected-node-data [:data :concept-action])
        [type id name data] (if concept-action?
                              (get-concept-action-data selected-node-data current-concept-data)
                              (get-scene-action-data selected-node-data))]
    {:id   id
     :name name
     :type type
     :data (update-with-current-data name data data-store)}))