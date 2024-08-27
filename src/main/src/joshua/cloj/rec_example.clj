(ns joshua.cloj.rec-example
  (:refer-clojure :exclude [def defn fn ])
  (:require [active.data.realm :as realm]
            [schema.core :as schema]
            [active.data.realm.attach :refer :all]
            [active.data.realm.inspection :as realm-inspection]
            [active.data.realm.validation :as realm-validation]
            [active.data.raw-record :as record]
            [active.data.record :as sut]
            ))


(schema/set-fn-validation! (boolean 1))


(sut/def-record dillo [dillo-liveness :- realm/boolean
                       dillo-weight :- realm/number])
(sut/def-record parrot [parrot-sentence :- realm/string
                        parrot-weight :- realm/number])

(sut/def-record animal [animal-weight
                        :- realm/number])
(sut/def-record dillo :extends animal [dillo-liveness :- realm/boolean])
(sut/def-record parrot :extends animal [parrot-sentence :- realm/string])

(def instance (sut/record? parrot))
(println instance)

(def anim (animal animal-weight 98))

(println anim)

(def anim-wrong (animal animal-weight 1009))

(println anim-wrong)

(def the-dillo (dillo dillo-liveness (boolean 1) animal-weight 400))
(println the-dillo)

(def the-parrot (parrot parrot-sentence "I am a parrot" animal-weight 300))
(println the-parrot)


