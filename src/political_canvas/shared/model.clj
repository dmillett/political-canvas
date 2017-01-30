(ns political-canvas.shared.model)

;; todo: lots to do here

; Where a Constituent or Candidate lives (some validation is required)
(defrecord Address [street1 street2 apartment city state postal country])

; An email address and the date it was entered
(defrecord EmailAddress [email date])

; For any participant that can use screennames with date
(defrecord Name [first middle last prefix suffix screennames])

; Texts, images, videos, etc
(defrecord History [key date content])

(defrecord PoliticalOffice [id region title description created_date])

; Only voting elligible people are allowed to contribute (time/money contribution)
(defrecord Contribution [id type date amount])

; Where 'types' might be: [{Constituent }, {Encumbent 2018+), {Candidate 2017+}, {Moderator n/a}]
(defrecord Human [ids types name address email_addresses register_date history affiliations contributions offices])

; Town hall style conversations (with moderators to ensure Constructive criticism)
; All entries are recorded, included temporary bans from Moderators
(defrecord Forum [name description created_by created_date participants hosted_by])

(defrecord ForumTopic [])


; A list of boundary coordinates enclosing an election district
; Where boundaries is a list of external coordinates and coordinates can change
(defrecord Region [id name description boundaries modified_date])

; The public position Candidate(s) are running for and Constituents are voting for
(defrecord Election [name date candidates forums description])

; An election topic like: "clean air", "taxation", etc
(defrecord ElectionTopic [name description created_date])
