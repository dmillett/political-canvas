(ns political-canvas.shared.tools-test
  (:require [clojure.test :refer :all]
            [clojure.spec.alpha :as s])
  (:use political-canvas.shared.tools)
  (:import (clojure.lang ArityException)))

(defrecord FooBar [c a b])
(s/def ::foobar (spec-drec FooBar))

(deftest test-spec-drec
  (is (s/valid? ::foobar [1 2 3]))
  (is (thrown? ArityException (s/valid? ::foobar [1 2])))
  (is (thrown? ArityException (s/valid? ::foobar [1 2 3 4])))
  (is (= [1 2 3] (s/conform ::foobar [1 2 3])))
  )

