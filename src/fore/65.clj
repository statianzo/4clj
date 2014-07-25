(ns fore.65)

(def __
  (fn [xs]
  (cond
    (= (inc (count xs)) (count (conj xs [:one 5] [:one 6]))) :map
    (= (inc (count xs)) (count (conj xs 5000 5000))) :set
    (= (last (conj xs 5000 5001)) 5001) :vector
    :default :list
    )))

(= :map  (__  {}))
(= :map  (__  {:a 1, :b 2}))

(= :list  (__  (range  (rand-int 20))))

(= :vector  (__  [1 2 3 4 5 6]))

(= :set  (__ #{10  (rand-int 5)}))

(=  [:map :set :vector :list]  (map __  [{} #{}  []  ()]))


