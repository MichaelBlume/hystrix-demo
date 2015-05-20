(ns hystrix-demo.core
  (:require [com.netflix.hystrix.core :refer [defcommand]]))

(defcommand foo
  "I don't do a whole lot."
  [x]
  (inc x))
