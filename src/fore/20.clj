(def __
  (comp second reverse))

(= (__ (list 1 2 3 4 5)) 4)


(= (__ ["a" "b" "c"]) "b")


(= (__ [[1 2] [3 4]]) [1 2])
