(ns birthday-bot.config
    (:require [clojure.java.io :as io]
              [clojure.edn :as edn]))


(defn read-config [config-file]
  (let [path (or config-file
                 (io/resource "config.edn"))]
    (when-not path
        (println "Config file not found")
        (System/exit 1))
    (edn/read-string (slurp path))))
