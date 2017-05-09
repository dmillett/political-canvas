(ns political-canvas.shared.refdata.data.model.region
  (:use [political-canvas.shared.data.refdata.schema]))

(def region_types
  {:village  (->RegionType {:en_us "Village"} {:en_us "A smaller, urban gathering of residences"})
   :ward     (->RegionType {:en_us "Ward"} {:en_us "A city or township district"})
   :city     (->RegionType {:en_us "City"} {})
   :county   (->RegionType {:en_us "County"} {})
   :district (->RegionType {:en_us "District"} {})
   :state    (->RegionType {:en_us "State"} {})
   :province (->RegionType {:en_us "Province"} {})
   :country  (->RegionType {:en_us "Country"} {})
   })
