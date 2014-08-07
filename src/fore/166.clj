(ns fore.166)

(def __
  (fn [f x y]
    (cond
      (f x y) :lt
      (f y x) :gt
      :else :eq
      )
    )
  )

(= :gt  (__ < 5 1))

(= :eq  (__  (fn  [x y]  (<  (count x)  (count y))) "pear" "plum"))

(= :lt  (__  (fn  [x y]  (<  (mod x 5)  (mod y 5))) 21 3))

(= :gt  (__ > 0 2))
 
