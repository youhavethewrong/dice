(ns dice.core-test
  (:require [clojure.test :refer :all]
            [dice.core :refer :all]))

(defn within-range
  [x l]
  (contains? (set (range 1 (inc l))) x))

(deftest roll-test
  (testing "Roll a 6 sided die"
    (let [r (roll 6)]
      (is (within-range r 6))))
  (testing "Roll a 6 sided dice 3 times"
    (let [rs (roll 3 6)]
      (is (= 3 (count rs)))
      (is (every? #(within-range % 6) rs)))))
