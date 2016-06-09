(ns exercise2.core
  (:gen-class))

(defn add100
  [n]
  (+ n 100))

(defn print100
  [n]
  (println (str n " + 100 = " (add100 n))))

(defn -main
  "Write a function that takes a number and adds 100 to it."
  [& args]
  (print100 5)
  (print100 50)
  (print100 5000))
