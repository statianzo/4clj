(def __
  (fn [xs]
    (reduce (fn [memo x]
              (if (= x (last memo))
                memo
                (conj memo x))) [] xs)))
(= (apply str (__ "Leeeeeerrroyyy")) "Leroy")

(= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))

(= (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))
