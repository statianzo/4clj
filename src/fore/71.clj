(ns fore.71)

(def __
  last
  )

(=  (__  (sort  (rest  (reverse  [2 5 4 1 3 6]))))
   (->  [2 5 4 1 3 6]  (reverse)  (rest)  (sort)  (__))
   5)
