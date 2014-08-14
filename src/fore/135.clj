(ns fore.135)

;(def __
  ;(fn [x & xs]
    ;(reduce (fn [memo [f y]] (f memo y)) x (partition 2 xs))
    ;)
  ;)

(def __
  (fn infix
    ([x f y] (f x y))
    ([x f y & xs] (apply infix (f x y) xs))
    )
  )

(= 42  (__ 38 + 48 - 2 / 2))

(= 8  (__ 10 / 2 - 1 * 2))

(= 72  (__ 20 / 2 + 2 + 4 + 8 - 6 - 10 * 9))
