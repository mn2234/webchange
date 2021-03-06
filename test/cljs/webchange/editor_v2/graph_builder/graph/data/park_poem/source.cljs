(ns webchange.editor-v2.graph-builder.graph.data.park-poem.source)

(def data {:assets
                     [{:url "/raw/img/park/sandbox/background.jpg", :size 10, :type "image"}
                      {:url "/raw/img/park/poem/i1.png", :type "image"}
                      {:url "/raw/img/park/poem/i2.png", :type "image"}
                      {:url "/raw/img/park/poem/i3.png", :type "image"}
                      {:url "/raw/img/park/poem/o1.png", :type "image"}
                      {:url "/raw/img/park/poem/o2.png", :type "image"}
                      {:url "/raw/img/park/poem/o3.png", :type "image"}
                      {:url "/raw/audio/l2/a3/poems-pro/ardilla.mp3", :type "audio", :alias "ardilla"}
                      {:url "/raw/audio/l2/a3/poems-pro/bebe.mp3", :type "audio", :alias "bebe"}
                      {:url "/raw/audio/l2/a3/poems-pro/casa.mp3", :type "audio", :alias "casa"}
                      {:url "/raw/audio/l2/a3/poems-pro/cepillo.mp3", :type "audio", :alias "cepillo"}
                      {:url "/raw/audio/l2/a3/poems-pro/chocolate.mp3", :type "audio", :alias "chocolate"}
                      {:url "/raw/audio/l2/a3/poems-pro/diamante.mp3", :type "audio", :alias "diamante"}
                      {:url "/raw/audio/l2/a3/poems-pro/elefante.mp3", :type "audio", :alias "elefante"}
                      {:url "/raw/audio/l2/a3/poems-pro/flor 2.mp3", :type "audio", :alias "flor"}
                      {:url "/raw/audio/l2/a3/poems-pro/gato.mp3", :type "audio", :alias "gato"}
                      {:url "/raw/audio/l2/a3/poems-pro/gemelos 2.mp3", :type "audio", :alias "gemelo"}
                      {:url "/raw/audio/l2/a3/poems-pro/hoja.mp3", :type "audio", :alias "hoja"}
                      {:url "/raw/audio/l2/a3/poems-pro/iman.mp3", :type "audio", :alias "iman"}
                      {:url "/raw/audio/l2/a3/poems-pro/jardin.mp3", :type "audio", :alias "jardin"}
                      {:url "/raw/audio/l2/a3/poems-pro/kimono.mp3", :type "audio", :alias "kimono"}
                      {:url "/raw/audio/l2/a3/poems-pro/leon.mp3", :type "audio", :alias "leon"}
                      {:url "/raw/audio/l2/a3/poems-pro/llave.mp3", :type "audio", :alias "llave"}
                      {:url "/raw/audio/l2/a3/poems-pro/mano.mp3", :type "audio", :alias "mano"}
                      {:url "/raw/audio/l2/a3/poems-pro/nandu.mp3", :type "audio", :alias "nandu"}
                      {:url "/raw/audio/l2/a3/poems-pro/nino.mp3", :type "audio", :alias "nino"}
                      {:url "/raw/audio/l2/a3/poems-pro/oso 2.mp3", :type "audio", :alias "oso"}
                      {:url "/raw/audio/l2/a3/poems-pro/pelota.mp3", :type "audio", :alias "pelota"}
                      {:url "/raw/audio/l2/a3/poems-pro/queso.mp3", :type "audio", :alias "queso"}
                      {:url "/raw/audio/l2/a3/poems-pro/rana.mp3", :type "audio", :alias "rana"}
                      {:url "/raw/audio/l2/a3/poems-pro/serpiente.mp3", :type "audio", :alias "serpiente"}
                      {:url "/raw/audio/l2/a3/poems-pro/web.mp3", :type "audio", :alias "sitio web"}
                      {:url "/raw/audio/l2/a3/poems-pro/tomate.mp3", :type "audio", :alias "tomate"}
                      {:url "/raw/audio/l2/a3/poems-pro/uvas.mp3", :type "audio", :alias "uvas"}
                      {:url "/raw/audio/l2/a3/poems-pro/violin.mp3", :type "audio", :alias "violin"}
                      {:url "/raw/audio/l2/a3/poems-pro/xilofono.mp3", :type "audio", :alias "xilofono"}
                      {:url "/raw/audio/l2/a3/poems-pro/yoyo.mp3", :type "audio", :alias "yoyo"}
                      {:url "/raw/audio/l2/a3/poems-pro/zapato.mp3", :type "audio", :alias "zapato"}
                      {:url "/raw/audio/l2/a3/L2_A3_Mari.m4a", :size 5, :type "audio", :alias "mari voice"}
                      {:url "/raw/audio/l2/a3/mari-instructions.mp4", :size 5, :type "audio", :alias "mari instructions"}],
           :objects
                     {:background {:type "background", :src "/raw/img/park/sandbox/background.jpg"},
                      :bubble-1
                                  {:type       "transparent",
                                   :x          470,
                                   :y          670,
                                   :width      450,
                                   :height     450,
                                   :transition "bubble-1",
                                   :scale-x    1,
                                   :scale-y    1,
                                   :src        "",
                                   :states     {:hidden {:type "transparent"}, :visible {:type "image"}}},
                      :bubble-2
                                  {:type       "transparent",
                                   :x          470,
                                   :y          670,
                                   :width      450,
                                   :height     450,
                                   :transition "bubble-2",
                                   :scale-x    1,
                                   :scale-y    1,
                                   :src        "",
                                   :states     {:hidden {:type "transparent"}, :visible {:type "image"}}},
                      :bubble-3
                                  {:type       "transparent",
                                   :x          470,
                                   :y          670,
                                   :width      450,
                                   :height     450,
                                   :transition "bubble-3",
                                   :scale-x    1,
                                   :scale-y    1,
                                   :src        "",
                                   :states     {:hidden {:type "transparent"}, :visible {:type "image"}}},
                      :concept-image
                                  {:type   "transparent",
                                   :x      1243,
                                   :y      765,
                                   :width  100,
                                   :height 100,
                                   :origin {:type "center-center"},
                                   :states {:hidden {:type "transparent"}, :visible {:type "image"}}},
                      :image-story-1
                                  {:type    "transparent",
                                   :x       426,
                                   :y       551,
                                   :width   450,
                                   :height  450,
                                   :actions {:click {:id "image-story-1-clicked", :on "click", :type "action"}},
                                   :scale-x 0.25,
                                   :scale-y 0.25,
                                   :src     "",
                                   :states  {:visible {:type "image"}, :clickable {:x 415, :y 540, :scale-x 0.3, :scale-y 0.3}}},
                      :image-story-2
                                  {:type    "transparent",
                                   :x       621,
                                   :y       546,
                                   :width   450,
                                   :height  450,
                                   :actions {:click {:id "image-story-2-clicked", :on "click", :type "action"}},
                                   :scale-x 0.25,
                                   :scale-y 0.25,
                                   :src     "",
                                   :states  {:visible {:type "image"}, :clickable {:x 610, :y 535, :scale-x 0.3, :scale-y 0.3}}},
                      :image-story-3
                                  {:type    "transparent",
                                   :x       791,
                                   :y       581,
                                   :width   450,
                                   :height  450,
                                   :actions {:click {:id "image-story-3-clicked", :on "click", :type "action"}},
                                   :scale-x 0.25,
                                   :scale-y 0.25,
                                   :src     "",
                                   :states  {:visible {:type "image"}, :clickable {:x 780, :y 570, :scale-x 0.3, :scale-y 0.3}}},
                      :letter-image
                                  {:type   "transparent",
                                   :x      1065,
                                   :y      765,
                                   :width  651,
                                   :height 651,
                                   :scale  {:x 0.3, :y 0.3},
                                   :origin {:type "center-center"},
                                   :states {:hidden {:type "transparent"}, :visible {:type "image"}}},
                      :mari
                                  {:type       "animation",
                                   :x          230,
                                   :y          825,
                                   :width      473,
                                   :height     511,
                                   :transition "mari",
                                   :anim       "idle",
                                   :name       "mari",
                                   :scale-x    -0.5,
                                   :scale-y    0.5,
                                   :speed      0.35,
                                   :start      true,
                                   :states
                                               {:listening-eva  {:speed 0.35, :scale-x -0.5, :scale-y 0.5},
                                                :listening-user {:speed 0.1, :scale-x -0.7, :scale-y 0.7}}},
                      :rock
                                  {:type       "animation",
                                   :x          1570,
                                   :y          800,
                                   :width      591,
                                   :height     681,
                                   :scene-name "rock",
                                   :anim       "idle",
                                   :name       "rock",
                                   :scale-x    0.6,
                                   :scale-y    0.6,
                                   :skin       "female",
                                   :speed      0.35,
                                   :start      true}},
           :scene-objects
                     [["background"]
                      ["image-story-1" "image-story-2" "image-story-3"]
                      ["letter-image" "concept-image"]
                      ["mari" "rock"]
                      ["bubble-1" "bubble-2" "bubble-3"]],
           :actions
                     {:enable-story-1
                                           {:type "sequence-data",
                                            :data
                                                  [{:id "clickable", :type "state", :target "image-story-1"}
                                                   {:type "set-variable", :var-name "story-1-clickable", :var-value true}]},
                      :finish-activity
                                           {:type "sequence-data", :data [{:id "park-poem", :type "finish-activity"} {:type "scene", :scene-id "park"}]},
                      :image-story-1-clicked
                                           {:type     "test-var-scalar",
                                            :var-name "story-1-clickable",
                                            :value    true,
                                            :success  "finish-story-1",
                                            :fail     {:type "empty", :duration 1}},
                      :finish-story-1
                                           {:data
                                                  [
                                                   {:type     "set-variable",
                                                    :from-var [{:var-name "concept-1", :action-property "var-value"}],
                                                    :var-name "current-concept"}
                                                   {:type "set-variable", :var-name "bubble-init-position", :var-value {:x 350, :y 470}}
                                                   {:id "run-story", :type "action"}
                                                   {:type "set-variable", :var-name "story-1-passed", :var-value true}
                                                   {:type "set-variable", :var-name "story-2-clickable", :var-value true}
                                                   {:id "clickable", :type "state", :target "image-story-2"}
                                                   {:id "test-stories-complete", :type "action"}
                                                   {:id "mari-voice-next", :type "action"}
                                                   ],
                                            :type "sequence-data"}
                      :image-story-2-clicked
                                           {:type     "test-var-scalar",
                                            :var-name "story-2-clickable",
                                            :value    true,
                                            :success  "finish-story-2",
                                            :fail     {:type "empty", :duration 1}},
                      :finish-story-2
                                           {:data
                                                  [{:type     "set-variable",
                                                    :from-var [{:var-name "concept-2", :action-property "var-value"}],
                                                    :var-name "current-concept"}
                                                   {:type "set-variable", :var-name "bubble-init-position", :var-value {:x 540, :y 465}}
                                                   {:id "run-story", :type "action"}
                                                   {:type "set-variable", :var-name "story-2-passed", :var-value true}
                                                   {:type "set-variable", :var-name "story-3-clickable", :var-value true}
                                                   {:id "clickable", :type "state", :target "image-story-3"}
                                                   {:id "test-stories-complete", :type "action"}
                                                   {:id "mari-voice-next", :type "action"}],
                                            :type "sequence-data"}
                      :image-story-3-clicked
                                           {:type     "test-var-scalar",
                                            :var-name "story-3-clickable",
                                            :value    true,
                                            :success  "finish-story-3",
                                            :fail     {:type "empty", :duration 1}},
                      :finish-story-3
                                           {:data
                                                  [{:type     "set-variable",
                                                    :from-var [{:var-name "concept-3", :action-property "var-value"}],
                                                    :var-name "current-concept"}
                                                   {:type "set-variable", :var-name "bubble-init-position", :var-value {:x 540, :y 465}}
                                                   {:id "run-story", :type "action"}
                                                   {:type "set-variable", :var-name "story-3-passed", :var-value true}
                                                   {:id "test-stories-complete", :type "action"}],
                                            :type "sequence-data"}
                      :init-concepts
                                           {:type "sequence-data",
                                            :data
                                                  [{:from        "concepts-group",
                                                    :type        "lesson-var-provider",
                                                    :shuffled    false,
                                                    :variables   ["concept-1" "concept-2" "concept-3"],
                                                    :provider-id "words-set"}
                                                   {:fail     "init-image-story-1",
                                                    :type     "test-var-scalar",
                                                    :value    nil,
                                                    :success  {:type "set-variable", :var-name "story-1-passed", :var-value true},
                                                    :var-name "concept-1"}
                                                   {:fail     "init-image-story-2",
                                                    :type     "test-var-scalar",
                                                    :value    nil,
                                                    :success  {:type "set-variable", :var-name "story-2-passed", :var-value true},
                                                    :var-name "concept-2"}
                                                   {:fail     "init-image-story-3",
                                                    :type     "test-var-scalar",
                                                    :value    nil,
                                                    :success  {:type "set-variable", :var-name "story-3-passed", :var-value true},
                                                    :var-name "concept-3"}]},
                      :init-image-story-1
                                           {:type "sequence-data",
                                            :data
                                                  [{:id "visible", :type "state", :target "image-story-1"}
                                                   {:type      "set-attribute",
                                                    :target    "image-story-1",
                                                    :from-var  [{:var-name "concept-1", :var-property "poem-image-1", :action-property "attr-value"}],
                                                    :attr-name "src"}]},
                      :init-image-story-2
                                           {:type "sequence-data",
                                            :data
                                                  [{:id "visible", :type "state", :target "image-story-2"}
                                                   {:type      "set-attribute",
                                                    :target    "image-story-2",
                                                    :from-var  [{:var-name "concept-2", :var-property "poem-image-1", :action-property "attr-value"}],
                                                    :attr-name "src"}]},
                      :init-image-story-3
                                           {:type "sequence-data",
                                            :data
                                                  [{:id "visible", :type "state", :target "image-story-3"}
                                                   {:type      "set-attribute",
                                                    :target    "image-story-3",
                                                    :from-var  [{:var-name "concept-3", :var-property "poem-image-1", :action-property "attr-value"}],
                                                    :attr-name "src"}]},
                      :init-state
                                           {:type "sequence-data",
                                            :data
                                                  [{:type "set-variable", :var-name "poem-paused", :var-value false}
                                                   {:type "set-variable", :var-name "story-1-passed", :var-value false}
                                                   {:type "set-variable", :var-name "story-2-passed", :var-value false}
                                                   {:type "set-variable", :var-name "story-3-passed", :var-value false}
                                                   {:type "set-variable", :var-name "story-1-clickable", :var-value false}
                                                   {:type "set-variable", :var-name "story-2-clickable", :var-value false}
                                                   {:type "set-variable", :var-name "story-3-clickable", :var-value false}]},
                      :mari-listening-eva  {:type "state", :id "listening-eva", :target "mari"},
                      :mari-listening-user {:type "state", :id "listening-user", :target "mari"},
                      :mari-voice-finish
                                           {:phrase                 :finish
                                            :phrase-description     "Finish"
                                            :offset                 30.397,
                                            :phrase-text            "Bravo! Do you want to listen to the story again?  Touch the picture to listen again, or touch the arrow to go to your next activity!",
                                            :phrase-text-translated "Bravo! Te gustaria escuchar la historia de nuevo? Toca la foto para escuchar de nuevo, o toca la flecha para seguir a tu proxima actividad!",
                                            :start                  30.397,
                                            :type                   "animation-sequence",
                                            :duration               12.706,
                                            :audio                  "mari",
                                            :target                 "mari",
                                            :track                  1,
                                            :data
                                                                    [{:end 31.446, :anim "talk", :start 30.559}
                                                                     {:end 34.928, :anim "talk", :start 31.792}
                                                                     {:end 38.572, :anim "talk", :start 35.988}
                                                                     {:end 42.93, :anim "talk", :start 39.016}]},
                      :mari-voice-next
                                           {:type        "animation-sequence",
                                            :data        [{:end 10.34, :anim "talk", :start 6.42}],
                                            :target      "mari",
                                            :audio       "/raw/audio/l2/a3/mari-instructions.mp4",
                                            :start       6.251,
                                            :duration    4.268,
                                            :track       1,
                                            :offset      6.251,
                                            :description "Touch the next picture to start the poem"},
                      :mari-voice-now-repeat
                                           {:phrase                 :repeat
                                            :phrase-description     "Repeat story"
                                            :phrase-text            "Did you like that?  I hope so.  We’re going to listen to the story again, but this time, I want you to say the story with me.  Repeat each phrase out loud after me."
                                            :phrase-text-translated "Te gusto eso? Espero que si. Vamos a escuchar la historia de nuevo, pero esta vez, quiero que TU cuentes la historia conmigo. Repite cada frase fuerte y en voz alta.",
                                            :type                   "animation-sequence",
                                            :duration               15.95,
                                            :start                  12.49,
                                            :offset                 12.49,
                                            :audio                  "mari",
                                            :target                 "mari",
                                            :track                  1,
                                            :data                   [{:end 13.917, :anim "talk", :start 12.598}
                                                                     {:end 15.799, :anim "talk", :start 14.544}
                                                                     {:end 19.021, :anim "talk", :start 16.469}
                                                                     {:end 21.844, :anim "talk", :start 19.411}
                                                                     {:end 24.212, :anim "talk", :start 22.244}
                                                                     {:end 28.299, :anim "talk", :start 24.666}]},
                      :mari-voice-welcome
                                           {:type               "sequence-data"
                                            :phrase             :welcome
                                            :phrase-description "Welcome"
                                            :data               [{:offset                 0.584,
                                                                  :phrase-text            "Welcome to the park little genius! Do you want to listen to a short story?",
                                                                  :phrase-text-translated "Bienvendio al parque pequeno genio! Te gustaria escuchar una corta historia?",
                                                                  :start                  0.584,
                                                                  :type                   "animation-sequence",
                                                                  :duration               6.661,
                                                                  :audio                  "mari",
                                                                  :target                 "mari",
                                                                  :track                  1,
                                                                  :data                   [{:end 3.406, :anim "talk", :start 0.757} {:end 7.083, :anim "talk", :start 3.925}]}
                                                                 {:type                   "animation-sequence",
                                                                  :data                   [{:end 4.71, :anim "talk", :start 1.5}],
                                                                  :target                 "mari",
                                                                  :audio                  "/raw/audio/l2/a3/mari-instructions.mp4",
                                                                  :start                  1.248,
                                                                  :duration               3.86,
                                                                  :track                  1,
                                                                  :offset                 1.248,
                                                                  :phrase-text            "Touch the picture and listen carefully!"
                                                                  :phrase-text-translated "Toca la imagen y escucha con atención!"}]},
                      :none                {:type "empty", :duration 10},
                      :poem-pause
                                           {:type "sequence-data",
                                            :data
                                                  [{:fail     {:type "empty", :duration 1000},
                                                    :type     "test-value",
                                                    :value1   true,
                                                    :success
                                                              {:data [{:id "mari-listening-user", :type "action"} {:type "empty", :duration 6000}], :type "sequence-data"},
                                                    :from-var [{:var-name "poem-paused", :action-property "value2"}]}
                                                   {:id "mari-listening-eva", :type "action"}]},
                      :prepare-bubbles
                                           {:type "sequence-data",
                                            :data
                                                  [{:id "hidden", :type "state", :target "bubble-1"}
                                                   {:type      "set-attribute",
                                                    :target    "bubble-1",
                                                    :from-var  [{:var-name "current-concept", :var-property "poem-image-1", :action-property "attr-value"}],
                                                    :attr-name "src"}
                                                   {:type      "set-attribute",
                                                    :target    "bubble-1",
                                                    :from-var  [{:var-name "bubble-init-position", :var-property "x", :action-property "attr-value"}],
                                                    :attr-name "x"}
                                                   {:type      "set-attribute",
                                                    :target    "bubble-1",
                                                    :from-var  [{:var-name "bubble-init-position", :var-property "y", :action-property "attr-value"}],
                                                    :attr-name "y"}
                                                   {:id "hidden", :type "state", :target "bubble-2"}
                                                   {:type      "set-attribute",
                                                    :target    "bubble-2",
                                                    :from-var  [{:var-name "current-concept", :var-property "poem-image-2", :action-property "attr-value"}],
                                                    :attr-name "src"}
                                                   {:type      "set-attribute",
                                                    :target    "bubble-2",
                                                    :from-var  [{:var-name "bubble-init-position", :var-property "x", :action-property "attr-value"}],
                                                    :attr-name "x"}
                                                   {:type      "set-attribute",
                                                    :target    "bubble-2",
                                                    :from-var  [{:var-name "bubble-init-position", :var-property "y", :action-property "attr-value"}],
                                                    :attr-name "y"}
                                                   {:id "hidden", :type "state", :target "bubble-3"}
                                                   {:type      "set-attribute",
                                                    :target    "bubble-3",
                                                    :from-var  [{:var-name "current-concept", :var-property "poem-image-3", :action-property "attr-value"}],
                                                    :attr-name "src"}
                                                   {:type      "set-attribute",
                                                    :target    "bubble-3",
                                                    :from-var  [{:var-name "bubble-init-position", :var-property "x", :action-property "attr-value"}],
                                                    :attr-name "x"}
                                                   {:type      "set-attribute",
                                                    :target    "bubble-3",
                                                    :from-var  [{:var-name "bubble-init-position", :var-property "y", :action-property "attr-value"}],
                                                    :attr-name "y"}
                                                   {:type "empty", :duration 300}]},
                      :run-bubble-1
                                           {:type "sequence-data",
                                            :data
                                                  [{:id "visible", :type "state", :target "bubble-1"}
                                                   {:type "empty", :duration 100}
                                                   {:to            {:bezier [{:x 335, :y 390} {:x 350, :y 230} {:x 175, :y 100}], :duration 2.0},
                                                    :type          "transition",
                                                    :transition-id "bubble-1"}]},
                      :run-bubble-2
                                           {:type "sequence-data",
                                            :data
                                                  [{:id "visible", :type "state", :target "bubble-2"}
                                                   {:type "empty", :duration 100}
                                                   {:to {:bezier [{:x 440, :y 215} {:x 735, :y 60}], :duration 2.0}, :type "transition", :transition-id "bubble-2"}]},
                      :run-bubble-3
                                           {:type "sequence-data",
                                            :data
                                                  [{:id "visible", :type "state", :target "bubble-3"}
                                                   {:type "empty", :duration 100}
                                                   {:to            {:bezier [{:x 740, :y 450} {:x 950, :y 160} {:x 1315, :y 125}], :duration 2.0},
                                                    :type          "transition",
                                                    :transition-id "bubble-3"}]},
                      :run-story
                                           {:type "sequence-data",
                                            :data
                                                  [{:type "set-variable", :var-name "poem-paused", :var-value false}
                                                   {:type      "set-attribute",
                                                    :target    "letter-image",
                                                    :from-var  [{:var-name "current-concept", :var-property "letter-src", :action-property "attr-value"}],
                                                    :attr-name "src"}
                                                   {:id "visible", :type "state", :target "letter-image"}
                                                   {:type      "set-attribute",
                                                    :target    "concept-image",
                                                    :from-var  [{:var-name "current-concept", :var-property "image-src", :action-property "attr-value"}],
                                                    :attr-name "src"}
                                                   {:id "visible", :type "state", :target "concept-image"}
                                                   {:id "prepare-bubbles", :type "action"}
                                                   {:id "run-concept-poem", :type "action"}
                                                   {:id "mari-voice-now-repeat", :type "action"}
                                                   {:type "set-variable", :var-name "poem-paused", :var-value true}
                                                   {:id "prepare-bubbles", :type "action"}
                                                   {:id "run-concept-poem", :type "action"}
                                                   {:id "hidden", :type "state", :target "letter-image"}
                                                   {:id "hidden", :type "state", :target "concept-image"}]},
                      :run-concept-poem
                                           {:phrase             :poem
                                            :phrase-description "Play poem"
                                            :type               "action",
                                            :from-var           [{:var-name "current-concept", :var-property "poem-story"}]}
                      :start-scene
                                           {:type        "sequence",
                                            :data        ["start-activity" "init-state" "init-concepts" "mari-voice-welcome" "enable-story-1"],
                                            :description "Initial action"},
                      :start-activity      {:type "start-activity", :id "park-poem"},
                      :stop-activity       {:type "stop-activity", :id "park-poem"},
                      :test-stories-complete
                                           {:type      "test-var-list",
                                            :success   "mari-voice-finish",
                                            :values    [true true true],
                                            :var-names ["story-1-passed" "story-2-passed" "story-3-passed"]}},
           :triggers {:back {:on "back", :action "stop-activity"}, :start {:on "start", :action "start-scene"}},
           :metadata {:prev "park", :autostart true},
           :audio    {:mari "/raw/audio/l2/a3/L2_A3_Mari.m4a"}})
