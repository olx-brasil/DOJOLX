(ns dojo-clojure.core)

(defn matrix
  "Create matrix"
  [width height]
  (repeat height (repeat width 0)))

(defn getij
  "Retrieve element on m(i,j)"
  [m i j]
  (nth (nth m i) j))

(defn replace-idx
  "Replace element on idx to x"
  [coll idx x]
  (concat (take idx coll) [x] (drop (+ idx 1) coll)))

(defn setij
  "Replace element on m(i,j) by x"
  [m i j x]
  (replace-idx m i (replace-idx (nth m i) j x)))

(defn diag
  "Retrieve elements from matrix diagonal"
  [m]
  (for [x (range 0 (count m))] (getij m x x)))