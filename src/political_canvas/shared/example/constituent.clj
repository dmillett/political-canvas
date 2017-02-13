(ns political-canvas.shared.example.constituent
  (:require [political-canvas.shared.example.ward :as local]))

;;
; A mock list of consituents for local/regional/federal districts
;

(def mock_constituents
  [{:id 1
    :name "Joe Plumber"
    :aliases []
    :districts [local/ward1]
    :contact {[:address {} :email {} :phone {} :date]} ; because districs can change (boo?), people move
    :affiliations [{}]
    :admin_history [{}] ; mostly unused, track warnings from forum moderators
    },
   {:id 2
    :name "Maryann Perez"
    :aliases []
    :districts [local/ward1]
    :contact {[:address {} :email {} :phone {} :date]}
    :affiliations [{}]
    :admin_history [{}]
    }
   ])
