(ns birthday-bot.config
    (:require [clojure.java.io :as io]
              [clojure.edn :as edn]
              [environ.core :refer [env]]))


(defn read-config []
  (let [path (or (:birthday-config env)
                 (io/resource "config.edn"))]
    (when-not path
        (println "Config file not found")
        (System/exit 1))
    (edn/read-string (slurp path))))
