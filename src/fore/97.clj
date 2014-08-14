(ns fore.97)

(def __
  (fn [n]
    (loop [i n
           prev [1]
           ]
      (if (= i 1)
        prev
        (->>
          (count prev)
          (inc)
          (range)
          (map #(+ (nth prev (dec %) 0) (nth prev % 0)))
          (recur (dec i)))
        )
      )
    )
  )
(=  (__ 1)  [1])

(=  (map __  (range 1 6))
   [     [1]
    [1 1]
    [1 2 1]
    [1 3 3 1]
    [1 4 6 4 1]])

(=  (__ 11)
   [1 10 45 120 210 252 210 120 45 10 1])
