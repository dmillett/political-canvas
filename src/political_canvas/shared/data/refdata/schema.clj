(ns political-canvas.shared.data.refdata.schema)

; Load these by language_locale
; - store as edn
; - store as JSON?
;
;(def title [#Title{:code "Mayor" :codes nil :translation {:en_us "Elected representative of a town or city"}}
;            #Title{:code "Alderman" :codes nil :translation {:en_us "Elected representative for a subset of town or city"}}
;            #Title{:code "Honor" :codes ["Judge"] :translation {:en_us "A justice of the peace"}}])

;;
; Protocols might not add much to the convention of defrecords
; (defprotocl Translatable (translate [this loc_lang] "Support translation for a given locale_language")
; (defrecord City [name description] Translatable (translate [this loc_lang] (-> this :description loc_lang)))
(defn translate
  "Translate a specific field in an object for any reference data type"
  [obj field loc_lang]
  (-> obj field loc_lang))

(defrecord Title [code codes translation])
(defrecord Prefix [code codes translation])
(defrecord Suffix [code codes translation])

(defrecord Address [coordinates street postal region country])
(defrecord RegionType [name description])
(defrecord PoliticalRegion [name type description electected postal languages population boundaries])
(defrecord AddressType [code codes translation])
(defrecord Country [name codes translation])

(defrecord ElectionType [code codes translation])
(defrecord CandidateType [code codes translation])
(defrecord PollType [code codes translation])
(defrecord ContributionType [code codes translation])
(defrecord ForumType [code codes translation])
(defrecord ForumTopicType [code codes translation])