(ns fore.64)

(def __ +)

(= 15 (reduce __ [1 2 3 4 5]))

(=  0 (reduce __ []))

(=  6 (reduce __ 1 [2 3]))
