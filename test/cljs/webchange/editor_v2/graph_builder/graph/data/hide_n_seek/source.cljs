(ns webchange.editor-v2.graph-builder.graph.data.hide-n-seek.source)

(def data {:assets        [{:url    "/raw/img/park/hide-n-seek/background.jpg",
                            :type   "image",
                            :size   14,
                            :width  1920,
                            :height 1080,
                            :alias  nil}
                           {:url    "/raw/img/park/hide-n-seek/front-objects.png",
                            :type   "image",
                            :size   37,
                            :width  1920,
                            :height 1080,
                            :alias  nil}
                           {:url "/raw/audio/l1/assessment1/Mari_Level1_Assessment1.m4a", :size 5, :type "audio" :alias "mari voice" :target "mari"}
                           {:url "/raw/audio/l1/assessment1/Assessment1_GameVoice_Set1.m4a", :size 5, :type "audio" :alias "words" :target "game-voice"}
                           {:url "/raw/audio/l1/a5/Mari_Coaching_statements.m4a", :size 2, :type "audio" :alias "statements" :target "mari"}],
           :objects       {:background       {:type        "background",
                                              :scene-name  "background",
                                              :scene-layer 0,
                                              :src         "/raw/img/park/hide-n-seek/background.jpg"},
                           :front-objects    {:y           0,
                                              :rotation    0,
                                              :scene-layer 2,
                                              :width       1920,
                                              :type        "image",
                                              :src         "/raw/img/park/hide-n-seek/front-objects.png",
                                              :scale-y     1,
                                              :x           0,
                                              :scale-x     1,
                                              :scene-name  "front-objects",
                                              :height      1080},
                           :mari             {:y           300,
                                              :rotation    0,
                                              :scene-layer 1,
                                              :speed       0.35,
                                              :name        "mari",
                                              :width       473,
                                              :type        "animation",
                                              :anim        "idle",
                                              :scale-y     0.5,
                                              :x           700,
                                              :scale-x     0.5,
                                              :scene-name  "mari",
                                              :skin        "default",
                                              :start       true
                                              :height      511}
                           :box1             {:scene-name "box1"
                                              :name       "boxes"
                                              :skin       "qwestion"
                                              :x          200
                                              :y          180
                                              :width      771
                                              :height     1033
                                              :scale-x    0.25
                                              :scale-y    0.25
                                              :rotation   0
                                              :speed      0.2
                                              :type       "transparent"
                                              :states     {:hidden  {:type "transparent"}
                                                           :visible {:type "animation"}}
                                              :anim       "idle2"
                                              :loop       true
                                              :start      true}
                           :box1-click-area  {:type       "transparent"
                                              :x          200
                                              :y          180
                                              :width      771
                                              :height     1033
                                              :scale-x    0.25
                                              :scale-y    0.25
                                              :rotation   0
                                              :origin     {:type "center-center"}
                                              :scene-name "box1-click-area"
                                              :actions    {:click {:type   "action"
                                                                   :id     "check-concept"
                                                                   :params {:box "box1"}
                                                                   :on     "click"}}}
                           :box2             {:scene-name "box2"
                                              :name       "boxes"
                                              :skin       "qwestion"
                                              :x          290
                                              :y          610
                                              :width      771
                                              :height     1033
                                              :scale-x    0.25
                                              :scale-y    0.25
                                              :rotation   0
                                              :speed      0.2
                                              :type       "transparent"
                                              :states     {:hidden  {:type "transparent"}
                                                           :visible {:type "animation"}}
                                              :anim       "idle2"
                                              :loop       true
                                              :start      true}
                           :box2-click-area  {:type       "transparent"
                                              :x          290
                                              :y          610
                                              :width      771
                                              :height     1033
                                              :scale-x    0.25
                                              :scale-y    0.25
                                              :rotation   0
                                              :origin     {:type "center-center"}
                                              :scene-name "box2-click-area"
                                              :actions    {:click {:type   "action"
                                                                   :id     "check-concept"
                                                                   :params {:box "box2"}
                                                                   :on     "click"}}}
                           :box3             {:scene-name "box3"
                                              :name       "boxes"
                                              :skin       "qwestion"
                                              :x          310
                                              :y          840
                                              :width      771
                                              :height     1033
                                              :scale-x    0.25
                                              :scale-y    0.25
                                              :rotation   0
                                              :speed      0.2
                                              :type       "transparent"
                                              :states     {:hidden  {:type "transparent"}
                                                           :visible {:type "animation"}}
                                              :anim       "idle2"
                                              :loop       true
                                              :start      true}
                           :box3-click-area  {:type       "transparent"
                                              :x          310
                                              :y          840
                                              :width      771
                                              :height     1033
                                              :scale-x    0.25
                                              :scale-y    0.25
                                              :rotation   0
                                              :origin     {:type "center-center"}
                                              :scene-name "box3-click-area"
                                              :actions    {:click {:type   "action"
                                                                   :id     "check-concept"
                                                                   :params {:box "box3"}
                                                                   :on     "click"}}}
                           :box4             {:scene-name "box4"
                                              :name       "boxes"
                                              :skin       "qwestion"
                                              :x          780
                                              :y          560
                                              :width      771
                                              :height     1033
                                              :scale-x    0.25
                                              :scale-y    0.25
                                              :rotation   0
                                              :speed      0.2
                                              :type       "transparent"
                                              :states     {:hidden  {:type "transparent"}
                                                           :visible {:type "animation"}}
                                              :anim       "idle2"
                                              :loop       true
                                              :start      true}
                           :box4-click-area  {:type       "transparent"
                                              :x          780
                                              :y          560
                                              :width      771
                                              :height     1033
                                              :scale-x    0.25
                                              :scale-y    0.25
                                              :rotation   0
                                              :origin     {:type "center-center"}
                                              :scene-name "box4-click-area"
                                              :actions    {:click {:type   "action"
                                                                   :id     "check-concept"
                                                                   :params {:box "box4"}
                                                                   :on     "click"}}}
                           :box5             {:scene-name "box5"
                                              :name       "boxes"
                                              :skin       "qwestion"
                                              :x          720
                                              :y          800
                                              :width      771
                                              :height     1033
                                              :scale-x    0.25
                                              :scale-y    0.25
                                              :rotation   0
                                              :speed      0.2
                                              :type       "transparent"
                                              :states     {:hidden  {:type "transparent"}
                                                           :visible {:type "animation"}}
                                              :anim       "idle2"
                                              :loop       true
                                              :start      true}
                           :box5-click-area  {:type       "transparent"
                                              :x          720
                                              :y          800
                                              :width      771
                                              :height     1033
                                              :scale-x    0.25
                                              :scale-y    0.25
                                              :rotation   0
                                              :origin     {:type "center-center"}
                                              :scene-name "box5-click-area"
                                              :actions    {:click {:type   "action"
                                                                   :id     "check-concept"
                                                                   :params {:box "box5"}
                                                                   :on     "click"}}}
                           :box6             {:scene-name "box6"
                                              :name       "boxes"
                                              :skin       "qwestion"
                                              :x          1080
                                              :y          170
                                              :width      771
                                              :height     1033
                                              :scale-x    0.25
                                              :scale-y    0.25
                                              :rotation   0
                                              :speed      0.2
                                              :type       "transparent"
                                              :states     {:hidden  {:type "transparent"}
                                                           :visible {:type "animation"}}
                                              :anim       "idle2"
                                              :loop       true
                                              :start      true}
                           :box6-click-area  {:type       "transparent"
                                              :x          1080
                                              :y          170
                                              :width      771
                                              :height     1033
                                              :scale-x    0.25
                                              :scale-y    0.25
                                              :rotation   0
                                              :origin     {:type "center-center"}
                                              :scene-name "box6-click-area"
                                              :actions    {:click {:type   "action"
                                                                   :id     "check-concept"
                                                                   :params {:box "box6"}
                                                                   :on     "click"}}}
                           :box7             {:scene-name "box7"
                                              :name       "boxes"
                                              :skin       "qwestion"
                                              :x          1240
                                              :y          760
                                              :width      771
                                              :height     1033
                                              :scale-x    0.25
                                              :scale-y    0.25
                                              :rotation   0,
                                              :speed      0.2
                                              :type       "transparent"
                                              :states     {:hidden  {:type "transparent"}
                                                           :visible {:type "animation"}}
                                              :anim       "idle2"
                                              :loop       true
                                              :start      true},
                           :box7-click-area  {:type       "transparent"
                                              :x          1240
                                              :y          760
                                              :width      771
                                              :height     1033
                                              :scale-x    0.25
                                              :scale-y    0.25
                                              :rotation   0
                                              :origin     {:type "center-center"}
                                              :scene-name "box7-click-area"
                                              :actions    {:click {:type   "action"
                                                                   :id     "check-concept"
                                                                   :params {:box "box7"}
                                                                   :on     "click"}}}
                           :box8             {:scene-name "box8"
                                              :name       "boxes"
                                              :skin       "qwestion"
                                              :x          1450
                                              :y          470
                                              :width      771
                                              :height     1033
                                              :scale-x    0.25
                                              :scale-y    0.25
                                              :rotation   0
                                              :speed      0.2
                                              :type       "transparent"
                                              :states     {:hidden  {:type "transparent"}
                                                           :visible {:type "animation"}}
                                              :anim       "idle2"
                                              :loop       true
                                              :start      true}
                           :box8-click-area  {:type       "transparent"
                                              :x          1450
                                              :y          470
                                              :width      771
                                              :height     1033
                                              :scale-x    0.25
                                              :scale-y    0.25
                                              :rotation   0
                                              :origin     {:type "center-center"}
                                              :scene-name "box8-click-area"
                                              :actions    {:click {:type   "action"
                                                                   :id     "check-concept"
                                                                   :params {:box "box8"}
                                                                   :on     "click"}}}
                           :box9             {:scene-name "box9"
                                              :name       "boxes"
                                              :skin       "qwestion"
                                              :x          1660
                                              :y          260
                                              :width      771
                                              :height     1033
                                              :scale-x    0.25
                                              :scale-y    0.25
                                              :rotation   0
                                              :speed      0.2
                                              :type       "transparent"
                                              :states     {:hidden  {:type "transparent"}
                                                           :visible {:type "animation"}}
                                              :anim       "idle2"
                                              :loop       true
                                              :start      true}
                           :box9-click-area  {:type       "transparent"
                                              :x          1660
                                              :y          260
                                              :width      771
                                              :height     1033
                                              :scale-x    0.25
                                              :scale-y    0.25
                                              :rotation   0
                                              :origin     {:type "center-center"}
                                              :scene-name "box9-click-area"
                                              :actions    {:click {:type   "action"
                                                                   :id     "check-concept"
                                                                   :params {:box "box9"}
                                                                   :on     "click"}}}
                           :box10            {:scene-name "box10"
                                              :name       "boxes"
                                              :skin       "qwestion"
                                              :x          1560
                                              :y          910
                                              :width      771
                                              :height     1033
                                              :scale-x    0.25
                                              :scale-y    0.25
                                              :rotation   0
                                              :speed      0.2
                                              :type       "transparent"
                                              :states     {:hidden  {:type "transparent"}
                                                           :visible {:type "animation"}}
                                              :anim       "idle2"
                                              :loop       true
                                              :start      true}
                           :box10-click-area {:type       "transparent"
                                              :x          1560
                                              :y          910
                                              :width      771
                                              :height     1033
                                              :scale-x    0.25
                                              :scale-y    0.25
                                              :rotation   0
                                              :origin     {:type "center-center"}
                                              :scene-name "box10-click-area"
                                              :actions    {:click {:type   "action"
                                                                   :id     "check-concept"
                                                                   :params {:box "box10"}
                                                                   :on     "click"}}}
                           :box11            {:scene-name "box11"
                                              :name       "boxes"
                                              :skin       "qwestion"
                                              :x          1775
                                              :y          700
                                              :width      771
                                              :height     1033
                                              :scale-x    0.25
                                              :scale-y    0.25
                                              :rotation   0
                                              :speed      0.2
                                              :type       "transparent"
                                              :states     {:hidden  {:type "transparent"}
                                                           :visible {:type "animation"}}
                                              :anim       "idle2"
                                              :loop       true
                                              :start      true}
                           :box11-click-area {:type       "transparent"
                                              :x          1775
                                              :y          700
                                              :width      771
                                              :height     1033
                                              :scale-x    0.25
                                              :scale-y    0.25
                                              :rotation   0
                                              :origin     {:type "center-center"}
                                              :scene-name "box11-click-area"
                                              :actions    {:click {:type   "action"
                                                                   :id     "check-concept"
                                                                   :params {:box "box11"}
                                                                   :on     "click"}}}}
           :scene-objects [["background"]
                           ["mari"]
                           ["box1" "box2" "box3" "box4" "box5" "box6" "box7" "box8" "box9" "box10" "box11"]
                           ["front-objects"]
                           ["box1-click-area" "box2-click-area" "box3-click-area"
                            "box4-click-area" "box5-click-area" "box6-click-area"
                            "box7-click-area" "box8-click-area" "box9-click-area"
                            "box10-click-area" "box11-click-area"]],
           :actions       {:clear-instruction      {:type        "remove-flows",
                                                    :description "Remove flows",
                                                    :flow-tag    "instruction"}
                           :mari-welcome-audio     {:description        "Welcome audio",
                                                    :offset             0.098
                                                    :start              0.098,
                                                    :type               "animation-sequence",
                                                    :duration           11.504,
                                                    :audio              "/raw/audio/l1/assessment1/Mari_Level1_Assessment1.m4a",
                                                    :target             "mari",
                                                    :track              1,
                                                    :data               [{:start 1.04 :end 1.944 :anim "talk"}
                                                                         {:start 2.641 :end 6.256 :anim "talk"}
                                                                         {:start 7.238 :end 11.176 :anim "talk"}]
                                                    :phrase             :welcome
                                                    :phrase-description "Welcome speech"
                                                    :phrase-text        "Hola! Let’s play a game of hide and seek! Find the pictures hiding in the park!"}
                           :mari-audio-correct     {:type               "animation-sequence",
                                                    :target             "mari",
                                                    :track              1,
                                                    :offset             0.858,
                                                    :audio              "/raw/audio/l1/a5/Mari_Coaching_statements.m4a",
                                                    :start              0.858,
                                                    :duration           1.837,
                                                    :data               [{:start 1.052, :end 2.505, :duration 1.453, :anim "talk"}]
                                                    :phrase             :correct
                                                    :phrase-description "Correct answer"
                                                    :phrase-text        "That’s correct!"}
                           :mari-audio-try-again   {:type               "animation-sequence",
                                                    :target             "mari",
                                                    :track              1,
                                                    :offset             18.915,
                                                    :audio              "/raw/audio/l1/a5/Mari_Coaching_statements.m4a",
                                                    :start              18.915,
                                                    :duration           1.493,
                                                    :data               [{:start 18.983, :end 20.242, :duration 1.259, :anim "talk"}]
                                                    :phrase             :try-again
                                                    :phrase-description "Wrong answer"
                                                    :phrase-text        "Try again!"}
                           :start-scene            {:type        "sequence",
                                                    :description "Initial action",
                                                    :data        ["start-activity"
                                                                  "clear-instruction"
                                                                  "mari-welcome-audio"
                                                                  "init-boxes"
                                                                  "renew-words"
                                                                  "renew-current-concept"]}
                           :init-boxes             {:type "parallel"
                                                    :data [{:type "set-variable" :var-name "box1" :var-value "box1"}
                                                           {:type "set-variable" :var-name "box2" :var-value "box2"}
                                                           {:type "set-variable" :var-name "box3" :var-value "box3"}
                                                           {:type "set-variable" :var-name "box4" :var-value "box4"}
                                                           {:type "set-variable" :var-name "box5" :var-value "box5"}
                                                           {:type "set-variable" :var-name "box6" :var-value "box6"}
                                                           {:type "set-variable" :var-name "box7" :var-value "box7"}
                                                           {:type "set-variable" :var-name "box8" :var-value "box8"}
                                                           {:type "set-variable" :var-name "box9" :var-value "box9"}
                                                           {:type "set-variable" :var-name "box10" :var-value "box10"}
                                                           {:type "set-variable" :var-name "box11" :var-value "box11"}]}
                           :renew-words            {:type        "lesson-var-provider"
                                                    :provider-id "words-set"
                                                    :variables   ["word-1" "word-2" "word-3"
                                                                  "word-4" "word-5" "word-6"
                                                                  "word-7" "word-8" "word-9"]
                                                    :shuffled    true
                                                    :from        "assessment-1"}
                           :renew-current-concept  {:type "sequence-data"
                                                    :data [{:type        "vars-var-provider"
                                                            :provider-id "current-concept"
                                                            :variables   ["current-concept"]
                                                            :from        ["word-1" "word-2" "word-3"
                                                                          "word-4" "word-5" "word-6"
                                                                          "word-7" "word-8" "word-9"]
                                                            :shuffled    false
                                                            :on-end      "finish-activity"}
                                                           {:type      "vars-var-provider"
                                                            :variables ["pair-concept-1" "pair-concept-2" "pair-concept-3"]
                                                            :from      ["word-1" "word-2" "word-3"
                                                                        "word-4" "word-5" "word-6"
                                                                        "word-7" "word-8" "word-9"]
                                                            :shuffled  true
                                                            :from-var  [{:var-name "current-concept" :var-property "concept-name" :var-key "concept-name" :action-property "exclude-property-values"}]}
                                                           {:type      "vars-var-provider"
                                                            :variables ["current-target" "pair-target-1" "pair-target-2" "pair-target-3"]
                                                            :from      ["box1" "box2" "box3" "box4" "box5" "box6" "box7" "box8" "box9" "box10" "box11"]
                                                            :shuffled  true}
                                                           {:type "action" :id "show-targets"}
                                                           {:type "parallel"
                                                            :data [{:type     "set-skin"
                                                                    :from-var [{:var-name "current-concept" :action-property "skin" :var-property "skin"}
                                                                               {:var-name "current-target" :action-property "target"}]}
                                                                   {:type     "set-skin"
                                                                    :from-var [{:var-name "pair-concept-1" :action-property "skin" :var-property "skin"}
                                                                               {:var-name "pair-target-1" :action-property "target"}]}
                                                                   {:type     "set-skin"
                                                                    :from-var [{:var-name "pair-concept-2" :action-property "skin" :var-property "skin"}
                                                                               {:var-name "pair-target-2" :action-property "target"}]}
                                                                   {:type     "set-skin"
                                                                    :from-var [{:var-name "pair-concept-3" :action-property "skin" :var-property "skin"}
                                                                               {:var-name "pair-target-3" :action-property "target"}]}]}
                                                           {:type     "set-current-concept"
                                                            :from-var [{:var-name "current-concept" :action-property "value" :var-property "skin"}]}
                                                           {:type "action" :id "make-riddle"}]}

                           :make-riddle            {:type               "action" :from-var [{:var-name "current-concept" :var-property "hide-n-seek-current-concept-audio"}]
                                                    :phrase             :concept-riddle
                                                    :phrase-description "Concept word"}

                           :show-targets           {:type "sequence-data"
                                                    :data [{:type "parallel"
                                                            :data [{:type "state" :id "visible" :from-var [{:var-name "current-target" :action-property "target"}]}
                                                                   {:type "state" :id "visible" :from-var [{:var-name "pair-target-1" :action-property "target"}]}
                                                                   {:type "state" :id "visible" :from-var [{:var-name "pair-target-2" :action-property "target"}]}
                                                                   {:type "state" :id "visible" :from-var [{:var-name "pair-target-3" :action-property "target"}]}]}
                                                           {:type "empty" :duration 700}]}

                           :hide-targets           {:type "sequence-data"
                                                    :data [{:type "parallel"
                                                            :data [{:type "state" :id "hidden" :from-var [{:var-name "current-target" :action-property "target"}]}
                                                                   {:type "state" :id "hidden" :from-var [{:var-name "pair-target-1" :action-property "target"}]}
                                                                   {:type "state" :id "hidden" :from-var [{:var-name "pair-target-2" :action-property "target"}]}
                                                                   {:type "state" :id "hidden" :from-var [{:var-name "pair-target-3" :action-property "target"}]}]}
                                                           {:type "empty" :duration 700}]}

                           :set-target-animation   {:type "sequence-data"
                                                    :data [{:type "animation-props" :props {:speed 0.6} :from-var [{:var-name "current-target" :action-property "target"}]}
                                                           {:type "animation" :id "idle1" :from-var [{:var-name "current-target" :action-property "target"}]}]}

                           :reset-target-animation {:type "sequence-data"
                                                    :data [{:type "animation-props" :props {:speed 0.2} :from-var [{:var-name "current-target" :action-property "target"}]}
                                                           {:type "animation" :id "idle2" :from-var [{:var-name "current-target" :action-property "target"}]}]}

                           :check-concept          {:type        "test-var-scalar"
                                                    :var-name    "current-target"
                                                    :success     "pick-correct"
                                                    :fail        "pick-wrong"
                                                    :from-params [{:action-property "value" :param-property "box"}]}

                           :pick-correct           {:type "sequence"
                                                    :data ["inc-correct"
                                                           "set-target-animation"
                                                           "mari-audio-correct"
                                                           "reset-target-animation"
                                                           "hide-targets"
                                                           "renew-current-concept"]}

                           :inc-correct            {:type     "pick-correct" :activity "hide-n-seek"
                                                    :from-var [{:var-name "current-concept" :action-property "concept-name" :var-property "concept-name"}]}

                           :pick-wrong             {:type "sequence"
                                                    :data ["inc-wrong"
                                                           "mari-audio-try-again"]}

                           :inc-wrong              {:type        "pick-wrong" :activity "hide-n-seek"
                                                    :from-var    [{:var-name "current-concept" :action-property "concept-name" :var-property "concept-name"}]
                                                    :from-params [{:action-property "option" :param-property "box"}]}

                           :start-activity         {:type "start-activity" :id "hide-n-seek"}
                           :finish-activity        {:type        "sequence-data"
                                                    :description "Finishing action",
                                                    :data        [{:type "finish-activity" :id "hide-n-seek"}
                                                                  {:type "scene" :scene-id "map"}]}},
           :triggers      {:start {:on "start" :action "start-scene"}}
           :metadata      {:autostart true
                           :prev      "park"}})
