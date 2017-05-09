(defproject political-canvas "0.1.0-SNAPSHOT"
  :description "An application that facilitates political campaigns, in an inclusive, constructive, transparent and inexpensive manner."
  :url "http://www.political-canvas.org/FIXME"
  :license {:name "GNU Lesser General Public License, version 2.1"
            :url "https://www.gnu.org/licenses/old-licenses/lgpl-2.1.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :plugins [[lein-kibit "0.1.3"]
            [jonase/eastwood "0.2.3"]
            [lein-ancient "0.6.10"]
            [com.walmartlabs/lacinia "0.14.0"]
            [com.datomic/datomic-free "0.9.5561"]]
  :repl-options {:init (do
                         (use 'political-canvas.shared.refdata.data)
                         (use 'political-canvas.shared.tools))}
  )
