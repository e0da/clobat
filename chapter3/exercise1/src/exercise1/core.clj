(ns exercise1.core
  (:gen-class))

(defn describe
  "Describe the thing that was passed in"
  [thing demo]
  (println (str (name thing) ": " demo)))

(defn -main
  "Use the str, vector, list, hash-map, and hash-set functions"
  [& args]

  (describe 'str (str "this is" " a string"))

  (let [my-vector [:foo :bar]]
    (describe 'vector (first my-vector)))

  (let [my-list '(:foo :bar)]
    (describe 'list (rand-nth my-list)))

  (let [my-hash-map (hash-map :foo "FOO" :bar "BAR")]
    (describe 'hash-map (:foo my-hash-map)))

  (let [my-hash-set #{:foo :bar}]
    (describe 'hash-set (contains? my-hash-set :foo))))
