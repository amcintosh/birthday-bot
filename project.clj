(defproject birthday-bot "0.1.0-SNAPSHOT"
  :description "Parse our company birthday list and send out slack message for today's birthdays."
  :url "https://github.com/amcintosh/birthday-bot"
  :license {:name "The MIT License"
            :url "https://github.com/amcintosh/birthday-bot/blob/master/LICENSE"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [environ "1.0.2"]
                 [clj-time "0.11.0"]
                 [enlive "1.1.6"]
                 [clj-http "2.0.1"]]
  :main ^:skip-aot birthday-bot.core
  :resource-paths ["resources"]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
