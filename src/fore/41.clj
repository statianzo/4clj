(def __
  (fn [xs n]
    (let [indexed (map #(vector %1 %2) xs (rest (range)))]
      (map first (filter (fn [[item index]]
                          ((complement zero?) (mod index n))) indexed)))))

(= (__ [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])

(= (__ [:a :b :c :d :e :f] 2) [:a :c :e])

(= (__ [1 2 3 4 5 6] 4) [1 2 3 5 6])
