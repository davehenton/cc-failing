(ns cc-failing.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (-> [] count)
  (println x "Hello, World!"))


