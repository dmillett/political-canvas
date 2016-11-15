(ns political-canvas.shared.model)

; Where a Constituent or Candidate lives
(defrecord Address [street1 street2 apartment city state postal country])

; Voters name, alias, address, ids {voterId, etc}

(defrecord Constituent [name address alias start_date history ids])

; The Candidate who holds office/position or desires office/positions
(defrecord Candidate [name address affiliation incumbant])


; Texts, images, videos, etc
(defrecord History [key date content])

; Only voting elligible people are allowed to contribute
(defrecord FinancialContribution [date amount constituent])

; Time/people spent organizing, canvasing, etc
(defrecord VolunteerContribution [date time type constituent])


; An entity (person) who moderates forums for bullying & factual content
(defrecord Moderator [name alias affiliation])

; Town hall style conversations (with moderators to ensure Constructive criticism)
; All entries are recorded, included temporary bans from Moderators
(defrecord Forum [name description created_by created_date participants hosted_by])

(defrecord ForumTopic [])


; A list of boundary coordinates enclosing an election district
; Where boundaries is a list of external coordinates
(defrecord Region [name description boundaries modified_date])

; The public position Candidate(s) are running for and Constituents are voting for
(defrecord Election [name date candidates forums description])

; An election topic like: "clean air", "taxation", etc
(defrecord ElectionTopic [name description created_date])
