(ns political-canvas.shared.refdata.data)

; Load these by language_locale
; - store as edn
; - store as JSON?
;
;(def title [#Title{:code "Mayor" :codes nil :translation {:en_us "Elected representative of a town or city"}}
;            #Title{:code "Alderman" :codes nil :translation {:en_us "Elected representative for a subset of town or city"}}
;            #Title{:code "Honor" :codes ["Judge"] :translation {:en_us "A justice of the peace"}}])

; This data goes in locale specific folders
(defrecord Title [code codes translation])
(defrecord Prefix [code codes translation])
(defrecord Suffix [code codes translation])

; Types
(defrecord AddressType [code codes translation])
(defrecord ElectionType [code codes translation])
(defrecord CandidateType [code codes translation])
(defrecord PollType [code codes translation])
(defrecord ContributionType [code codes translation])
(defrecord ForumType [code codes translation])
(defrecord ForumTopicType [code codes translation])