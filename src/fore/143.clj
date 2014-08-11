(ns fore.143)


;(def __
  ;(fn [xs ys]
    ;(->> (map vector xs ys)
         ;(map (fn [[a b]] (* a b)))
         ;(reduce +)
         ;)
    ;)
  ;)

(def __
  #(reduce + (map * %1 %2)))

(= 0  (__  [0 1 0]  [1 0 0]))

(= 3  (__  [1 1 1]  [1 1 1]))

(= 32  (__  [1 2 3]  [4 5 6]))

(= 256  (__  [2 5 6]  [100 10 1]))
