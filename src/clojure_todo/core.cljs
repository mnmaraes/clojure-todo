(ns clojure-todo.core
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            [clojure-todo.details :as details]
            [clojure-todo.list :as tdlist]))

(enable-console-print!)

(def app-state
  (atom {:name "Master List"
         :details "One List to Rule them all"
         :list
         [{:name "Writing"
           :details "Writing things is fun"
           :list
             [{:name "Write A Best-Seller"
               :details "Making money is also fun"
               :list
                 [{:name "Come up with the plot"
                   :details "What do I want to talk about?"}]}
              {:name "Write for the New York Times"
               :details "People need to hear this"}]}
          {:name "Reading"
           :details "I have a long list of books to read"
           :list
             [{:name "The Catcher in the Rye"
               :details "Who is Holden Caulfield and Why should I care?"}]}
          {:name "Profit"
           :details "All Done"}]}))

(om/root tdlist/main-list-view app-state
  {:target (. js/document (getElementById "list"))})
