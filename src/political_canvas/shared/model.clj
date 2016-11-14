(ns political-canvas.shared.model)

; A documentation override? Not sure about this yet
(defprotocol RecordDocs (description [_]))

; Voters
(defrecord Constituent
  [name address alias start_date history]
  RecordDocs (description [_] (str "Campaign Constituent")))

; The Candidate who holds office/position or desires office/positions
(defrecord Candidate [name address affiliation incumbant])

; An election topic like: "clean air", "taxation", etc
(defrecord ElectionTopic [name description])

; Texts, images, videos, etc
(defrecord History [key date content])

; Only voting elligible people are allowed to contribute
(defrecord FinancialContribution [date amount constituent])

(defrecord VolunteerContribution [date time type constituent])

; An entity (person) who moderates forums for bullying & factual content
(defrecord Moderator [name alias affiliation])

; Town hall style conversations (with moderators to ensure Constructive criticism)
; All entries are recorded, included temporary bans from Moderators
(defrecord Forum [name description created_by created_date participants hosted_by])

(defrecord Region [name description boundaries])

(defrecord Election [name date candidates forums description])