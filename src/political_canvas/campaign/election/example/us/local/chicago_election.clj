(ns political-canvas.campaign.election.example.us.local.chicago-election
  (:use [political_canvas.shared.data.us.il.cook.chicago]
        [political_canvas.shared.data.schema.objects]
        [political_canvas.shared.data.model.types]))

;;
; An example of a local aldermanic fictional race in Chicago. There are 50 aldermanic wards in Chicago and each
; has a number of precincts. The boundaries are not simple geometric shapes and are often redrawn (why? gerrymandering)
;
; Ward boundaries: https://data.cityofchicago.org/Facilities-Geographic-Boundaries/Boundaries-Wards-2015-/sp34-6z76
; http://www.chicagoelections.com/en/ward-maps-and-aldermen.html
;
; https://data.cityofchicago.org/Facilities-Geographic-Boundaries/Boundaries-Wards-2015-/sp34-6z76
;
; todo: much of this will probably be broken out into appropriate namespaces, configuration, and persistent data storage
; http://www.nbcchicago.com/blogs/ward-room/Get-to-Know-Your-Ward-1st-Ward-289330161.html
;

(def chicago_elections
  {:ward "www.political-canvas.org/us/il/cook/chicago/ward/2018/"})

(def candidate_jrandom
  {:name (->Name "MS" "Janessa" nil "Random" nil {}) ; defrecord Name
   :contact_info {:email (->EmailAddress "jane.random@gmail.com" "2010101")
                  :social_media [(->SocialMedia (:twitter social_media) "@jrandom")
                                 (->SocialMedia (:facebook social_media) "jrandom")]
                  :websites {:pc (str (:ward chicago_elections) "/ward1/jrandom")}
                  :forums {:pidgin nil :slack nil}}

   :bio {:summary "A fictional candidate for a fictional election for a real public office"
         :previous {:ward1 {:from "01/01/2016"}}}
   :viewpoints {:education (->Viewpoints (:education viewpoints) {} {})
                :taxes (->Viewpoints (:taxes viewpoints) {} {})
                :mass_transit (->Viewpoints (:transit viewpoints) {} {})
                :garbage nil}
   })

; Putting together a rough skeleton of candidate information
; Note the :website
(def chicago-2018
  "A collection of candidates, to be broken out later"
  ; todo: region as data with namespace: 'us.il.cook.chicago.ward1'
  ; todo:
  ;       - include ward statistics
  ;       - polling places
  ;       - election dates
  ;       -
  {:region "us.il.cook.chicago.ward1"
   :pc_url "www.political-canvas.org/us/il/cook/chicago/ward1/2018/"
   :candidates
     [candidate_jrandom,
   ]})



(def chicago-election-2018
  {:region {}
   :name "Chicago General Election 2018"
   :dates {:election "" :early_polling {:from "" :to ""} :candidate_registration {:from "" :to ""}}
   :candidate chicago-candidate ; covers individual communications & events
   :opinion_polls {}
   :media {:social {} :journalism {} :blog {} :misc {}}
   :events {:town_hall {} :debates {}}
   })