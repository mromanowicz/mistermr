(defproject mistermr "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.5"]
                 [ring/ring-jetty-adapter "1.2.0-SNAPSHOT"]]
  :plugins [[lein-ring "0.8.3"]]
  :ring {:handler mistermr.handler/app}
  :profiles { :dev { :resource-paths ["public/"]
              :dependencies [[ring-mock "0.1.3"]]}}
  :main mistermr.handler
)
