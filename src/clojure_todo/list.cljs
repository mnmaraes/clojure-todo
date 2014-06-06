(ns clojure-todo.list
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]))


(enable-console-print!)

(defn- sublist-view [list owner]
  (reify
    om/IRender
    (render [_]
            (dom/div nil
                     (dom/h3 nil (:name list))
                     (if (:list list)
                       (apply dom/ul nil
                              (om/build-all sublist-view (:list list))))))))

(defn main-list-view [app owner]
  (reify
    om/IRender
    (render [_]
            (dom/div nil
                     (dom/h2 nil (:name app))
                     (dom/p nil (:details app))
                     (apply dom/ul nil
                            (om/build-all sublist-view (:list app)))))))


