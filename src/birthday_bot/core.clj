(ns birthday-bot.core
  (:require [clojure.tools.cli :refer [parse-opts]]
            [clojure.tools.logging :as log]
            [clj-slack.chat :as slack]
            [birthday-bot.config :as config]
            [birthday-bot.parser :as parser])
  (:gen-class))


(defn send-message [config people]
  (println people)
  (let [message (:message config)]
    (slack/post-message (:slack config)
                        (:channel message)
                        (format (:message message) people)
                        {:username "birthday-bot"
                         :icon_emoji ":birthday:"
                         :parse "full"
                         :link_names "1"})))

(def cli-options
  [["-c" "--config FILE" "Config File"]
   ["-v" nil "Logging Verbosity level"
    :id :verbosity
    :default 0
    :assoc-fn (fn [m k _] (update-in m [k] inc))]
   ["-h" "--help"]])

(defn usage [options-summary]
  (println "birthday-bot.\n\n"
           "Options:\n"
           options-summary)
  (System/exit 0))

(defn -main [& args]
  (let [{:keys [options arguments errors summary]}
      (parse-opts args cli-options)]
    (cond
      (:help options) (usage summary))
    (let [config (config/read-config (:config options))
          people (parser/get-people (:birthday-webpage config))]
      (send-message config people))))
