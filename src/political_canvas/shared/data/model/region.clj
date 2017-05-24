(ns political-canvas.shared.refdata.data.model.region
  (:use [political-canvas.shared.data.refdata.schema]))

; Currently these are heavily focused on US region structure
(def region_types
  {:village  (->RegionType {:en_us "Village"} {:en_us "A smaller, urban gathering of residences"})
   :ward     (->RegionType {:en_us "Ward"} {:en_us "A sub-district within a city or township"})
   :city     (->RegionType {:en_us "City"} {:en_us "A"})
   :county   (->RegionType {:en_us "County"} {:en_us ""})
   :district (->RegionType {:en_us "District"} {:en_us ""})
   :state    (->RegionType {:en_us "State"} {:en_us ""})
   :province (->RegionType {:en_us "Province"} {:en_us ""})
   :country  (->RegionType {:en_us "Country"} {:en_us ""})
   })
