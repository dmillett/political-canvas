(ns political-canvas.shared.refdata.data)

; Load these by language_locale (translate by :description)
; - store as edn
; => (map #(->Prefix %) (:prefix data))
;
; (def data
;   {:prefix ["Mr" "Ms" "Dr" "other"]
;    :title ["Mayor" "Alderman" "Senator" "Honor"]
;    :suffix []
;    })
;
(defprotocol Refdata
  "Ensure static reference style data has a short code, long code, and
  description. Use this for shared, common data and can serve as an anchor
  for a translatable ':description'. "
  (code [x])
  (long_code [x])
  (description [x]) )

; This data goes in lang
(defrecord Title [code long_code description] Refdata)
(defrecord Prefix [code long_code description] Refdata)
(defrecord Suffix [code long_code description] Refdata)