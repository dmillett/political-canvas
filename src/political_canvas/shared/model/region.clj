(ns political-canvas.shared.model.region)

;;
; Protocols might not add much to the convention of defrecords
; (defprotocl Translatable (translate [this loc_lang] "Support translation for a given locale_language")
; (defrecord City [name description] Translatable (translate [this loc_lang] (-> this :description loc_lang)))

(defn translate
  "Translate a specific field in an object for any PoliticalRegion"
  [obj field loc_lang]
  (-> obj field loc_lang))

(defrecord Address [coordinates street postal region country])
(defrecord RegionType [name description])
(defrecord PoliticalRegion [name type description electected population boundaries])

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