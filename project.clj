(defproject birthday-bot "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [environ "1.0.0"]
                 [clj-time "0.11.0"]
                 [enlive "1.1.6"]
                 [clj-http "2.0.1"]]
  :main ^:skip-aot birthday-bot.core
  :resource-paths ["resources"]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
