(ns political-canvas.shared.data.schema.objects)

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

;; Types (referential data)
(defrecord Title [code codes translation])
(defrecord Prefix [code codes translation])
(defrecord Suffix [code codes translation])
(defrecord NameType [code codes translation])

(defrecord AddressType [code codes translation])
(defrecord Address [type street city region postal country coordinates])
(defrecord RegionType [name description])
(defrecord PoliticalRegion [name type description electected postal languages population boundaries])
(defrecord Country [name codes translation])

(defrecord ContactType [code codes icon translation]) ; email, phone, slack, pidgin, etc
(defrecord SocialMediaType [code icon url translation]) ;twitter, facebook, blog, website
(defrecord ElectionType [code codes translation])
(defrecord CandidateType [code codes translation])
(defrecord PollType [code codes translation])
(defrecord ContributionType [code codes translation])
(defrecord ForumType [code codes translation])
(defrecord ForumTopicType [code codes translation])
(defrecord ViewpointsType [code codes translation]) ; taxes, education, environment, voting, etc

;; Schema (persistent data)
; An email address and the date it was entered
(defrecord EmailAddress [email date])
; Candidate social media types and handles
(defrecord SocialMedia [type handle])
; Candidate viewpoints on topics like taxes, education, etc (see ViewpointsTypes)
(defrecord Viewpoints [type voted communicated])
; For any participant that can use screennames with date
(defrecord Name [first middle last prefix suffix screennames])
; Texts, images, videos, etc
(defrecord History [key date content])
(defrecord PoliticalOffice [id region title description created_date])
; Only voting elligible people are allowed to contribute (time/money contribution)
(defrecord Contribution [id type date amount])
; Where 'types' might be: [{Constituent }, {Encumbent 2018+), {Candidate 2017+}, {Moderator n/a}]
(defrecord Human [ids types name address email_addresses register_date history affiliations contributions offices])
; A list of boundary coordinates enclosing an election district
; Where boundaries is a list of external coordinates and coordinates can change
(defrecord Region [id name description boundaries modified_date])
; The public position Candidate(s) are running for and Constituents are voting for
(defrecord Election [name date candidates forums description])
; An election topic like: "clean air", "taxation", etc
(defrecord ElectionTopic [name description created_date])