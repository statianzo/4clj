(def __
  (fn [n]
    (loop [prev 0
           curr 1
           memo []
           i n]
      (if (zero? i)
        memo
        (let [nxt (+ curr prev)]
          (recur curr nxt (conj memo curr) (dec i) ))))))
(= (__ 3) '(1 1 2))

(= (__ 6) '(1 1 2 3 5 8))

(= (__ 8) '(1 1 2 3 5 8 13 21))
