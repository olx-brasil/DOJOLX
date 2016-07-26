(ns dojo-clojure.core-test
  (:require [clojure.test :refer :all]
            [dojo-clojure.core :refer :all]))

(deftest matrix-test
  (testing "Match dimensions"
    (let [m (matrix 5 4)]
    (is (= (count m) 4))
    (is (= (count (nth m 0)) 5))))
  (testing "All zero"
    (let [m (matrix 10 10)]
    (is (every? #(= 0 %) (flatten m))))))

(deftest getij-test
  (testing "Retrieve element on (i,j)"
    (let [m (list (list 1 2) (list 3 4))]
    (is (= (getij m 0 0) 1))
    (is (= (getij m 0 1) 2))
    (is (= (getij m 1 0) 3))
    (is (= (getij m 1 1) 4)))))

(deftest replace-idx-test
  (testing "Replace element in array on idx"
    (let [coll [1 2 3 4]]
    (is (= (vec (replace-idx coll -1 9)) [9 1 2 3 4]))
    (is (= (vec (replace-idx coll 4 9)) [1 2 3 4 9]))
    (is (= (vec (replace-idx coll 0 9)) [9 2 3 4]))
    (is (= (vec (replace-idx coll 1 9)) [1 9 3 4]))
    (is (= (vec (replace-idx coll 2 9)) [1 2 9 4]))
    (is (= (vec (replace-idx coll 3 9)) [1 2 3 9])))))

(deftest setij-test
  (testing "Replace element on (i,j) by x"
    (let [m (matrix 2 2)]
    (is (= (flatten (setij m 0 0 1)) (list 1 0 0 0)))
    (is (= (flatten (setij m 0 1 1)) (list 0 1 0 0)))
    (is (= (flatten (setij m 1 0 1)) (list 0 0 1 0)))
    (is (= (flatten (setij m 1 1 1)) (list 0 0 0 1))))))

(deftest diag-test
  (testing "Retrive elements from matrix diagonal"
    (let [m [[1 2] [3 4]]]
    (is (= (seq (diag m)) (list 1 4))))))


