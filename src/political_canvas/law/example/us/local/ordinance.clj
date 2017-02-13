(ns political-canvas.law.example.ordinance
  (:require [political-canvas.shared.example.ward :as local]))

;;
; This is an example of a local ordinance that restricts nightime urban
; lighting to reduce light polution, yet maintain pedestrian safety.
;
; Allow for versioning of laws and ordinances with source control (git)
; where authors/sponsors own commit history (no forced updates!)

(def clean_urban_lighting
  "An example local ordinance which targets excessive urban lighting."
  {:type "LOCAL-ORDINANCE"
   :district local/ward1
   :summary "To reduce urban light pollution while maintaining resident safety."
   :description "To reduce light pollution, maintain resident safety, and reduce electricity through the use of smart sidewalk lights with motion detection sensors"
   :examples [{}]
   :status "PLANNING"
   :effective-date "20180101"
   :authors [{:name "dmillett" :created "20170208"}]
   :sponsors []
   :history [{:status "PLANNING" :date "20170208"} {:status "INTRODUCTION" :date "20170228"}]})