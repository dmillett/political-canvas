(ns political-canvas.shared.specs
  (:require [clojure.spec.alpha :as s]
            [political-canvas.shared.tools :as t])
  (:use [political-canvas.shared.data.schema.objects])
  (:import [political_canvas.shared.data.schema.objects Name Address EmailAddress SocialMedia]))

;; todo: placeholder for specs to assist with names, campaigns, etc ... lots to do

; In cases where it might be useful to reuse a 'Model' data type like 'defrecord
; Now to add secondary validation for defrecord fields (like email regex, etc)
(s/def ::name (t/spec-drec Name))
(s/def ::address (t/spec-drec Address))
(s/def ::email (t/spec-drec EmailAddress))
(s/def ::social_media (t/spec-drec SocialMedia))