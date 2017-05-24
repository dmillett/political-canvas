(ns political_canvas.shared.data.model.country
  (:use [political_canvas.shared.data.schema.objects]))


;; http://www.worldatlas.com/aatlas/ctycodes.htm
;; http://www.science.co.il/language/Locale-codes.php
;; todo: character sets for accents, etc on non-english letters
(def countries
  {:US (->Country "United States of America" ["USA"] {:en_us "United States"})
   :CA (->Country "Canada" ["CAN"] {:en_ca "Canada" :fr_ca "Canada"})
   :MX (->Country "Mexico" ["MEX"] {:es_mx "Mexico"})
   })

