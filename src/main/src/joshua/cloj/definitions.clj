(ns joshua.cloj.definitions
  (:refer-clojure :exclude [def defn fn])
  (:require [active.data.realm :as realm]
            [schema.core :as schema]
            [active.data.realm.attach :refer :all]
           ))


(schema/set-fn-validation! (boolean 1))

(defn i-am-a-fake-fun :- realm/boolean
      [msg :- realm/string a :- realm/number b :- realm/number]
      (let [res (* a b)]
        (println msg res)
        (boolean res)))

(defn i-return-somewhat  :- realm/boolean
      [msg :- realm/string a :- realm/number b :- realm/number]
      (let [res (* a b)]
        (println msg res)
        (boolean res)
        "blah"))

(i-am-a-fake-fun "huhu" 8 9)

;; error ?? whats wrong ?
;;(i-am-a-fake-fun 10 8 9)

;;whats wrong here
;;(i-return-somewhat "huhu" 8 9)

;; Make a definition of a calculator for * + / - by do curring
;; hint + / - .... are normal functions - material can be found in deinprogramm.de
;; do it using the typed version of functions like above
