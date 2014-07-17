(def __
  (fn [& xs]
    (reduce (fn [memo i]
            (if (> memo i)
              memo
              i)) xs)))

(= (__ 1 8 3 4) 8)

(= (__ 30 20) 30)

(= (__ 45 67 11) 67)
