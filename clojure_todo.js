goog.addDependency("base.js", ['goog'], []);
goog.addDependency("../cljs/core.js", ['cljs.core'], ['goog.string', 'goog.array', 'goog.object', 'goog.string.StringBuffer']);
goog.addDependency("../om/dom.js", ['om.dom'], ['cljs.core']);
goog.addDependency("../om/core.js", ['om.core'], ['cljs.core', 'om.dom']);
goog.addDependency("../clojure_todo/list.js", ['clojure_todo.list'], ['cljs.core', 'om.core', 'om.dom']);
goog.addDependency("../clojure_todo/details.js", ['clojure_todo.details'], ['cljs.core', 'om.core', 'om.dom']);
goog.addDependency("../clojure_todo/core.js", ['clojure_todo.core'], ['cljs.core', 'om.core', 'clojure_todo.details', 'om.dom', 'clojure_todo.list']);