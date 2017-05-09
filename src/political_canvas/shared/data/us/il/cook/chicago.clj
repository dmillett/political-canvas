(ns political-canvas.shared.data.us.il.cook.chicago
  (:use [political-canvas.shared.model.region]))

(def wards
  {:ward1 (->PoliticalRegion "Ward 1" (:ward region_types) "Chicago, 1st Ward" "" 56149 [])
   ;:ward2 (->PoliticalRegion "Ward 2" (:ward region_types) "Chicago 2nd ward" elected population boundaries)
   :ward50 (->PoliticalRegion nil nil nil nil nil nil)
   })

(def chicago
  {:name "Chicago"
   :nick_names "The Windy City (politics, not weather)"
   :region_type (r/region_types :city)
   :regions {:country "United States" :State "Illinois" :County ["Cook"]}
   :districts wards
   :population 1
   :mayor {}
   :languages []
   :geograpy {:boundaries []}
   })