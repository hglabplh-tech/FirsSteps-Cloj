(defproject hgp.cljito/mock-fn-hgp "0.2.4-SNAPSHOT"
  :description "Mockito wrapper for Clojure"
  :url "https://github.com/shaolang/cljito"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[metosin/testit             "0.4.0"]
                 [org.clojure/clojure "1.11.1"]
                 [org.clojure/core.async "1.6.681"]
                 [de.active-group/active-clojure "0.42.2"]
                 [de.active-group/active-data "0.2.0-SNAPSHOT"]]




  :scm {:name "git"
        :url  ""}
  :aot all
  :source-paths ["src/main/clj"]
  :java-source-paths ["src/main/java"]                      ; Java source is stored separately.
  :test-paths ["test/clj"]
  :resource-paths ["resource"]
  )