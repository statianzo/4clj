(ns fore.62)

; First attempt before I discovered fn can take a name
;(def __
  ;(fn [f start]
    ;(let [a (atom start)]
      ;(cons start (repeatedly #(swap! a f)))
      ;)
    ;)
  ;)

(def __
  (fn iter [f a]
    (cons a (lazy-seq (iter f (f a))))
    )
  )


(=  (take 5  (__ #(* 2 %) 1))  [1 2 4 8 16])

(=  (take 100  (__ inc 0))  (take 100  (range)))

(=  (take 9  (__ #(inc  (mod % 3)) 1))  (take 9  (cycle  [1 2 3])))
