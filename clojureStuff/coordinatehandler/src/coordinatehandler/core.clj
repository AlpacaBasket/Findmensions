(ns coordinatehandler.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

--- Code logic to implement/test in clojure when I get home

''' Takes two coordinate lists and compares them, recursively iterating through the list to evaluate each pair
(defn diff (coord1 coord2)
  if coord1 is number return difference between it and coord2 using diff2
  if coord1 is list return + (diff2 ((first coord1) (first coord2))) (diff ((rest coord1) (rest coord2)))
)

''' Find the difference between a pair of numbers
''' Not sure on clojure syntax and am not at home so will look up when I have the time, logic may change
(defn diff2 (n1 n2)
  difference = n1 - n2
  if difference is <0 then invert it (negative difference is the same as positive difference, just in a different direction)
  else, simply return differrence
)
