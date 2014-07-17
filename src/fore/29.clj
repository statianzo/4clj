(def __
  (fn [s]
    (apply str (filter #(Character/isUpperCase %) s))))

(= (__ "HeLlO, WoRlD!") "HLOWRD")

(empty? (__ "nothing"))

(= (__ "$#A(*&987Zf") "AZ")
