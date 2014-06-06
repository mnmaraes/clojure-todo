(ns clojure-todo.details
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]))


(defn addTwo [a b]
  (+ a b))