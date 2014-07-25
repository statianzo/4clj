(ns fore.66)

(def __
  (fn [a b]
    (let [biga (java.math.BigInteger. (str a))
          bigb (java.math.BigInteger. (str b))
          ]
      (.gcd biga bigb)
      )
   )
  )
(=  (__ 2 4) 2)

(=  (__ 10 5) 5)

(=  (__ 5 7) 1)

(=  (__ 1023 858) 33)

