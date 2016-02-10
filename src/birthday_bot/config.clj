(ns birthday-bot.config
    (:require [clojure.java.io :as io]
              [clojure.edn :as edn]
              [environ.core :refer [env]]))


(defn read-config []
  (let [path (or (:config-file env)
                 (io/file (io/resource "config.edn")))]
    (when-not path
        (println "Config file not found")
        (System/exit 0))
    (edn/read-string (slurp path))))
