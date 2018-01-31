(ns political-canvas.shared.tools
  (:require [clojure.string :as str]))

(defn local-file
  "Refer to a local file somewhere in the project directory."
  [filename]
  (str (System/getProperty "user.dir") "/" filename))

(defn data-to-file
  "Dump a clojure data structure to an EDN file using (with-out-str). This
  requires an existing directory or a filename inclusive of directory."
  [data filename]
  (spit (str filename ".edn") (with-out-str (pr data))) )

(defn data-from-file
  "Read the contents of a small file into its clojure data structure."
  [filename]
  (read-string (slurp filename)))

; (apply ->Foo [1 2 3]) works
(defn- dr-fields
  "Find the custom fields in a defrecord. So fields that do not begin
  with '__' or 'const_'. Will the specs be attached to the fields or the
  defrecord itself? (todo:)" ; getSimpleName
  [dr]
  (filter
    (fn [field] (not-any? #(str/starts-with? (.getName field) %) ["__" "const_"]))
    (.getFields dr)))

(defn spec-drec
  "Create a spec predicate for defrecord types. For example:

  (defrecord Foo [a b c])
  (s/def ::foo (spec-drec Foo))
  (s/valid? ::foo [1 2 3])
  =>true"
  [datarec]
  (let [fx (-> (str "->" (.getSimpleName datarec)) symbol resolve)]
    (fn [spec_args]
      (apply fx spec_args))
    ) )