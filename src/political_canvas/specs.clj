(ns political-canvas.specs
  (:require [clojure.spec.alpha :as s])
  (:use [political_canvas.shared.data.schema.objects]))

;; todo: placeholder for specs to assist with names, campaigns, etc ... lots to do
; How to construct specs from defrecords
(defrecord Foo [a b])
(defmethd validate-record )

(s/def ::name #(->Name & %))
(s/def ::address #(->Address & %))