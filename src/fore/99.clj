(ns fore.99)

(def __
  (fn [x y]
    (map (comp read-string str) (str (* x y)))
    )
  )

(=  (__ 1 1)  [1])

(=  (__ 99 9)  [8 9 1])

(=  (__ 999 99)  [9 8 9 0 1])
