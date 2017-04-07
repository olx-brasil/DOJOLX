(defproject dojo-clojure "0.1.0-SNAPSHOT"
  :description "Dojo exercise about Clojure"
  :url "http://www.olx.com.br"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :profiles {:dev {:plugins [[com.jakemccrary/lein-test-refresh "0.16.0"]
                             [lein-autoreload "0.1.0"]]}}
  :dependencies [[org.clojure/clojure "1.8.0"]])
