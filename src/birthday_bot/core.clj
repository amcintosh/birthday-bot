(ns birthday-bot.core
  (:require [birthday-bot.config :as config]
            [birthday-bot.parser :as parser]
            [clojure.pprint])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (let [config (config/read-config)]
    (println "Starting with config:" config)
    (println (parser/get-day))
    (println (parser/get-people
                          (:birthday-webpage config)))))
