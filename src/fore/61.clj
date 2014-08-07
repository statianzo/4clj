(ns fore.61)

(def __
  (fn [xs ys]
    (apply hash-map (interleave xs ys))
    )
  )

(=  (__  [:a :b :c]  [1 2 3])  {:a 1, :b 2, :c 3})

(=  (__  [1 2 3 4]  ["one" "two" "three"])  {1 "one", 2 "two", 3 "three"})

(=  (__  [:foo :bar]  ["foo" "bar" "baz"])  {:foo "foo", :bar "bar"})
