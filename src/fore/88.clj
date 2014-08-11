(ns fore.88)

(def __
  (fn [xs ys]
    (clojure.set/difference
      (clojure.set/union xs ys)
      (clojure.set/intersection xs ys)
      )
    )
  )

(=  (__ #{1 2 3 4 5 6} #{1 3 5 7}) #{2 4 6 7})

(=  (__ #{:a :b :c} #{}) #{:a :b :c})

(=  (__ #{} #{4 5 6}) #{4 5 6})

(=  (__ #{[1 2]  [2 3]} #{[2 3]  [3 4]}) #{[1 2]  [3 4]})
