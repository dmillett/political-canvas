(ns political-canvas.campaign.election.example.local-election)

;;
; An example of a local aldermanic fictional race in Chicago. There are 50 aldermanic wards in Chicago and each
; has a number of precincts. The boundaries are not simple geometric shapes and are often redrawn (why? gerrymandering)
;
; Ward boundaries: https://data.cityofchicago.org/Facilities-Geographic-Boundaries/Boundaries-Wards-2015-/sp34-6z76
; http://www.chicagoelections.com/en/ward-maps-and-aldermen.html

; todo: much of this will probably be broken out into appropriate namespaces, configuration, and persistent data storage
; http://www.nbcchicago.com/blogs/ward-room/Get-to-Know-Your-Ward-1st-Ward-289330161.html
;
(def ward1 {:name "Ward 1" :type "LOCAL-CITY" :population 123
            :precincts {} ; 44 precincts
            :boundaries [[] [] []] ; Explore geometric shapes (area), otherwise use lat-lon pairs
            :demographics {:total_population 56149} ; I am not in favor categorizing ethnicities, but worth a discussion
            :contact_info {:email "ward1@cityofchicago.ooorg"}})

; Putting together a rough skeleton of candidate information
; Note the :website
(def candidates
  "A collection of candidates, to be broken out later"
  [{:name {:prefix "MS" :first "Janessa" :middle nil :last "Random" :suffix nil}
    :contact_info {:email "jane.random@gmail.com"
                   :website "www.political-canvas.org/chicago/ward1/2017/janerandom/"
                   :social {:twitter "janerandome" :facebook "Jane Random Ward 1"}}
    :position ward1
    :bio {:summary "A fictional candidate for a fictional election for a real public office"}
    :positions {:education {} :mass_transit {} :building_permits {} :violence {}
                :health {} :police {} :garbage {} :recycling {} :budget {}}
    }
   ])