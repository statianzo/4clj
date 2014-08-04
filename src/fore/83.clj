(ns fore.83)

;(def __
  ;(fn [& xs]
    ;(and
      ;(boolean (some false? xs))
      ;(boolean (some true? xs))
      ;)
    ;)
  ;)

(def __
  not=
  )

(= false  (__ false false))

(= true  (__ true false))

(= false  (__ true))

(= true  (__ false true false))

(= false  (__ true true true))

(= true  (__ true true true false))
