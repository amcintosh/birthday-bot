(ns birthday-bot.parser
    (:require [net.cgrand.enlive-html :as html]
              [clj-http.client :as http]
              [clj-time.core :as time]
              [clj-time.format :as format]
              [clojure.string :as str]))


(defn get-day []
  (let [day-format (format/formatter "MMM-d")]
    (format/unparse day-format (time/now))))

(defn get-page [config]
  (let [my-cs (clj-http.cookies/cookie-store)]
    (http/post (:login-url config)
                 {:form-params {:os_username (:username config)
                                :os_password (:password config)}
                  :cookie-store my-cs})
    (http/get (:url config) {:cookie-store my-cs})))

(defn get-data [data]
  (html/select
    (html/html-resource (java.io.StringReader. (:body data)))
    [:.confluenceTable :tr]))

(defn merge-people [people]
  (if (:tag (first people))
    (str/join " " (map #(first (:content %)) people))
    (first people)))

(defn get-people [config]
  (let [data (get-data (get-page config))
        day (get-day)]
    (merge-people (:content (first (html/select
      (for [tr (html/select data [:tr])
           :when (str/includes? tr day)]
      tr) [:td]))))))
