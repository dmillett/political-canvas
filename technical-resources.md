

## Specs from records

```clojure
(:require [political-canvas.shared.tools :as t]
          [clojure.spec.alpha :as s])

(defrecord Name [prefix first middle last family suffix])

; Create a spec for valid/conform
(s/def ::name (t/spec-drec Name))

=> (s/valid? ::name ["dr" "foo" nil "bar" nil nil])
true
```

## Datomic schema
* todo ...