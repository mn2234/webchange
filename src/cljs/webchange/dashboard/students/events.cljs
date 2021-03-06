(ns webchange.dashboard.students.events
  (:require
    [re-frame.core :as re-frame]
    [day8.re-frame.http-fx]
    [ajax.core :refer [json-request-format json-response-format]]
    [webchange.dashboard.events-utils :refer [when-valid clear-errors]]
    [webchange.validation.specs.student :as spec]))

(re-frame/reg-event-fx
  ::load-students
  (fn [{:keys [db]} [_ class-id]]
    {:db (-> db
             (assoc-in [:loading :students] true))
     :http-xhrio {:method          :get
                  :uri             (str "/api/classes/" class-id "/students")
                  :format          (json-request-format)
                  :response-format (json-response-format {:keywords? true})
                  :on-success      [::load-students-success]
                  :on-failure      [:api-request-error :students]}}))

(re-frame/reg-event-fx
  ::load-students-success
  (fn [{:keys [db]} [_ result]]
    {:db (assoc-in db [:dashboard :students (:class-id result)] (:students result))
     :dispatch-n (list [:complete-request :students])}))

(re-frame/reg-event-fx
  ::load-unassigned-students
  (fn [{:keys [db]} _]
    {:db (-> db
             (assoc-in [:loading :unassigned-students] true))
     :http-xhrio {:method          :get
                  :uri             (str "/api/unassigned-students")
                  :format          (json-request-format)
                  :response-format (json-response-format {:keywords? true})
                  :on-success      [::load-unassigned-students-success]
                  :on-failure      [:api-request-error :unassigned-students]}}))

(re-frame/reg-event-fx
  ::load-unassigned-students-success
  (fn [{:keys [db]} [_ result]]
    {:db (assoc-in db [:dashboard :unassigned-students] (:students result))
     :dispatch-n (list [:complete-request :unassigned-students])}))

(re-frame/reg-event-fx
  ::load-student
  (fn [{:keys [db]} [_ id]]
    {:db (-> db
             (assoc-in [:loading :student] true))
     :http-xhrio {:method          :get
                  :uri             (str "/api/students/" id)
                  :format          (json-request-format)
                  :response-format (json-response-format {:keywords? true})
                  :on-success      [::load-student-success]
                  :on-failure      [:api-request-error :student]}}))

(re-frame/reg-event-fx
  ::load-student-success
  (fn [{:keys [db]} [_ result]]
    {:db (assoc-in db [:dashboard :current-student] (:student result))
     :dispatch-n (list [:complete-request :student])}))

(re-frame/reg-event-fx
  ::add-student
  [(re-frame/inject-cofx :validate ::spec/student)]
  (fn [{:keys [db] :as co-effects} [_ class-id data]]
    (when-valid :student co-effects
                {:db         (assoc-in db [:loading :add-student] true)
                 :http-xhrio {:method          :post
                              :uri             (str "/api/students")
                              :params          data
                              :format          (json-request-format)
                              :response-format (json-response-format {:keywords? true})
                              :on-success      [::add-student-success class-id]
                              :on-failure      [:api-request-error :student]}})))

(re-frame/reg-event-fx
  ::add-student-success
  (fn [{:keys [db]} [_ class-id]]
    {:dispatch-n (list [:complete-request :add-student]
                       [::load-students class-id]
                       [::close-student-modal])}))

(re-frame/reg-event-fx
  ::edit-student
  [(re-frame/inject-cofx :validate ::spec/student)]
  (fn [{:keys [db] :as co-effects} [_ class-id student-id data]]
    (when-valid :student co-effects
                {:db (assoc-in db [:loading :edit-student] true)
                 :http-xhrio {:method          :put
                              :uri             (str "/api/students/" student-id)
                              :params          data
                              :format          (json-request-format)
                              :response-format (json-response-format {:keywords? true})
                              :on-success      [::edit-student-success class-id student-id]
                              :on-failure      [:api-request-error :student]}})))

(re-frame/reg-event-fx
  ::edit-student-success
  (fn [_ [_ class-id student-id]]
    {:dispatch-n (list [:complete-request :edit-student]
                       [::load-unassigned-students]
                       [::load-student student-id]
                       [::load-students class-id]
                       [::close-student-modal])}))

(re-frame/reg-event-fx
  ::remove-student-from-class
  (fn [{:keys [db]} [_ class-id student-id]]
    {:db (assoc-in db [:loading :remove-student-from-class] true)
     :http-xhrio {:method          :delete
                  :uri             (str "/api/students/" student-id "/class")
                  :format          (json-request-format)
                  :response-format (json-response-format {:keywords? true})
                  :on-success      [::remove-student-from-class-success class-id]
                  :on-failure      [:api-request-error :remove-student-from-class]}}))

(re-frame/reg-event-fx
  ::remove-student-from-class-success
  (fn [{:keys [db]} [_ class-id]]
    {:db (assoc-in db [:dashboard :current-student] nil)
     :dispatch-n (list [:complete-request :remove-student-from-class]
                       [::load-unassigned-students]
                       [::load-students class-id])}))

(re-frame/reg-event-fx
  ::delete-student
  (fn [{:keys [db]} [_ student-id]]
    {:db (assoc-in db [:loading :delete-student] true)
     :http-xhrio {:method          :delete
                  :uri             (str "/api/students/" student-id)
                  :format          (json-request-format)
                  :response-format (json-response-format {:keywords? true})
                  :on-success      [::delete-student-success]
                  :on-failure      [:api-request-error :delete-student]}}))

(re-frame/reg-event-fx
  ::delete-student-success
  (fn [{:keys [db]} _]
    {:db (assoc-in db [:dashboard :current-student] nil)
     :dispatch-n (list [:complete-request :delete-student]
                       [::load-unassigned-students])}))

(re-frame/reg-event-fx
  ::complete-student-progress
  (fn [{:keys [db]} [_ student-id course-name data]]
    {:db (assoc-in db [:loading :complete-student-progress] true)
     :http-xhrio {:method          :put
                  :uri             (str "/api/individual-profile/" student-id "/course/" course-name "/complete")
                  :params          data
                  :format          (json-request-format)
                  :response-format (json-response-format {:keywords? true})
                  :on-success      [::complete-student-success]
                  :on-failure      [:api-request-error :complete-student-progress]}}))

(re-frame/reg-event-fx
  ::complete-student-success
  (fn [{:keys [db]} _]
    {:dispatch-n (list [:complete-request :complete-student-progress])}))

(re-frame/reg-event-fx
  ::show-add-student-form
  (fn [{:keys [db]} _]
    {:db (-> db
             (clear-errors :student)
             (assoc-in [:dashboard :current-student] nil))
     :dispatch-n (list [::generate-access-code]
                       [::open-student-modal :add])}))

(re-frame/reg-event-fx
  ::show-edit-student-form
  (fn [{:keys [db]} [_ id]]
    {:db (-> db
             (clear-errors :student)
             (assoc-in [:dashboard :current-student-id] id))
     :dispatch-n (list [::load-student id]
                       [::reset-access-code]
                       [::open-student-modal :edit])}))

(re-frame/reg-event-fx
  ::set-current-student
  (fn [{:keys [db]} [_ student-id]]
    {:db (assoc-in db [:dashboard :current-student-id] student-id)}))

(re-frame/reg-event-fx
  ::generate-access-code
  (fn [{:keys [db]} _]
    (let []
      {:db (assoc-in db [:loading :generate-access-code] true)
       :http-xhrio {:method          :post
                    :uri             (str "/api/next-access-code")
                    :format          (json-request-format)
                    :response-format (json-response-format {:keywords? true})
                    :on-success      [::generate-access-code-success]
                    :on-failure      [:api-request-error :generate-access-code]}})))


(re-frame/reg-event-fx
  ::generate-access-code-success
  (fn [{:keys [db]} [_ {:keys [access-code]}]]
    {:db (assoc-in db [:dashboard :access-code] access-code)
     :dispatch [:complete-request :generate-access-code]}))

(re-frame/reg-event-fx
  ::reset-access-code
  (fn [{:keys [db]} _]
    {:db (update-in db [:dashboard] dissoc :access-code)}))

(re-frame/reg-event-fx
  ::close-student-modal
  (fn [{:keys [db]} _]
    {:db (assoc-in db [:dashboard :student-modal-state] nil)}))

(re-frame/reg-event-fx
  ::open-student-modal
  (fn [{:keys [db]} [_ state]]
    {:db (assoc-in db [:dashboard :student-modal-state] state)}))

(re-frame/reg-event-fx
  ::load-student-profile
  (fn [{:keys [db]} [_ student-id course-name]]
    {:db (-> db
             (assoc-in [:loading :student-profile] true))
     :http-xhrio {:method          :get
                  :uri             (str "/api/individual-profile/" student-id "/course/" course-name)
                  :format          (json-request-format)
                  :response-format (json-response-format {:keywords? true})
                  :on-success      [::load-student-profile-success]
                  :on-failure      [:api-request-error :student-profile]}}))

(re-frame/reg-event-fx
  ::load-student-profile-success
  (fn [{:keys [db]} [_ result]]
    {:db (assoc-in db [:dashboard :student-profile] result)
     :dispatch-n (list [:complete-request :student-profile])}))

(re-frame/reg-event-fx
  ::show-remove-from-class-form
  (fn [{:keys [db]} [_ student-id]]
    {:db (assoc-in db [:dashboard :current-student-id] student-id)
     :dispatch-n (list
                   [::load-student student-id]
                   [::open-remove-from-class-modal])}))

(re-frame/reg-event-fx
  ::show-complete-form
  (fn [{:keys [db]} [_ student-id]]
    {:db (assoc-in db [:dashboard :current-student-id] student-id)
     :dispatch-n (list
                   [::load-student student-id]
                   [::open-complete-modal])}))

(re-frame/reg-event-fx
  ::open-remove-from-class-modal
  (fn [{:keys [db]} _]
    {:db (assoc-in db [:dashboard :remove-student-from-class-modal-state] true)}))

(re-frame/reg-event-fx
  ::open-complete-modal
  (fn [{:keys [db]} _]
    {:db (assoc-in db [:dashboard :complete-student-modal-state] true)}))

(re-frame/reg-event-fx
  ::close-complete-modal
  (fn [{:keys [db]} _]
    {:db (assoc-in db [:dashboard :complete-student-modal-state] nil)}))

(re-frame/reg-event-fx
  ::confirm-complete
  (fn [{:keys [db]} [_ student-id data]]
    (let [current-course (:current-course db)]
      {:db (assoc-in db [:dashboard :complete-student-modal-state] nil)
       :dispatch [::complete-student-progress student-id current-course data]})))

(re-frame/reg-event-fx
  ::close-remove-from-class-modal
  (fn [{:keys [db]} _]
    {:db (assoc-in db [:dashboard :remove-student-from-class-modal-state] nil)}))

(re-frame/reg-event-fx
  ::confirm-remove
  (fn [{:keys [db]} [_ class-id student-id]]
    {:db (assoc-in db [:dashboard :remove-student-from-class-modal-state] nil)
     :dispatch [::remove-student-from-class class-id student-id]}))

(re-frame/reg-event-fx
  ::show-delete-form
  (fn [{:keys [db]} [_ student-id]]
    {:db (assoc-in db [:dashboard :current-student-id] student-id)
     :dispatch-n (list
                   [::load-student student-id]
                   [::open-delete-modal])}))

(re-frame/reg-event-fx
  ::open-delete-modal
  (fn [{:keys [db]} _]
    {:db (assoc-in db [:dashboard :delete-student-modal-state] true)}))

(re-frame/reg-event-fx
  ::close-delete-modal
  (fn [{:keys [db]} _]
    {:db (assoc-in db [:dashboard :delete-student-modal-state] nil)}))

(re-frame/reg-event-fx
  ::confirm-delete
  (fn [{:keys [db]} [_ student-id]]
    {:db (assoc-in db [:dashboard :delete-student-modal-state] nil)
     :dispatch [::delete-student student-id]}))