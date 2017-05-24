(ns political_canvas.shared.data.us.il.cook.chicago
  (:use [political_canvas.shared.data.refdata.schema]
        [political_canvas.shared.data.model.region]))

(def ward1 {:name "Ward 1" :type "LOCAL-CITY"
            :precincts {} ; 44 precincts
            :boundaries [[] [] []] ; Explore geometric shapes (area), otherwise use lat-lon pairs
            :demographics {:total_population 56149} ; I am not in favor categorizing ethnicities, but worth a discussion
            :contact_info {:email "ward1@cityofchicago.ooorg"}
            :address {:state "IL" :city "Chicago" :postal []}})
; name type description electected postal languages population boundaries
(def wards
  {:ward1 (->PoliticalRegion "Ward 1" (:ward region_types) "Chicago, 1st Ward" "" [] [] 56149 [])
   ;:ward2 (->PoliticalRegion "Ward 2" (:ward region_types) "Chicago 2nd ward" elected [] [] population boundaries)
   :ward50 (->PoliticalRegion nil nil nil nil nil nil nil nil)
   })

(def postal (->AddressType "MAIL" ["MAIL"] {:en_us "Postal address for paper mail"}))


; type street postal region country coordinates
(def chicago-address
  (->Address postal "121 N. Lasalle Street" "Chicago" "Illinois" "60602" ""))

(def chicago
  {:name "Chicago"
   :nick_names "The Windy City (politics, not weather)"
   :region_type (:city region_types)
   :region {:country "United States" :State "Illinois" :County ["Cook"]}
   :districts wards
   :population 1
   :mayor {:name "Rahm Emmanuel"}
   ;
   :address (->Address nil "City Hall"
121 N. LaSalle Street
Chicago, Illinois 60602}
   :languages []
   :geograpy {:boundaries []}
   })