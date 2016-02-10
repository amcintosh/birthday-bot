(ns birthday-bot.parser-test
  (:require [clojure.test :refer :all]
            [birthday-bot.parser :refer :all]))

(deftest get-day-test
  (testing "get-day returns in proper format"
    (is (re-matches (re-pattern (str "(?:Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|"
                                     "Sep|Oct|Nov|Dec)-[1-9][0-9]?"))
                    (get-day)))))
