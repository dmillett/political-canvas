(ns political-canvas.shared.tools)

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