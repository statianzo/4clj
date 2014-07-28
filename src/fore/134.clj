(ns fore.134)

(def __
  (fn [k ms] (and (contains? ms k) (nil? (ms k))))
  )
(true?  (__ :a  {:a nil :b 2}))

(false?  (__ :b  {:a nil :b 2}))

(false?  (__ :c  {:a nil :b 2}))

