(ns fore.90)

;(def __
  ;(fn [xs ys]
    ;(set (mapcat (fn [n] (map #(vector n %1) ys)) xs))
    ;)
  ;)

(def __
  (fn [xs ys]
    (set (for [x xs y ys] [x y]))
    )
  )

(=  (__ #{1 2 3} #{4 5})
      #{[1 4]  [2 4]  [3 4]  [1 5]  [2 5]  [3 5]})

(= 300  (count  (__  (into #{}  (range 10))
                     (into #{}  (range 30)))))
