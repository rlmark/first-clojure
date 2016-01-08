(ns first-clojure.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World! I'm a little teapot.")

  ; prefix operators
  (println (+ 1 2 3 4))
  (println (* 1 2 3 4))

  ;do form
  (do (println "Hey there")
      (+ 1 3))
  (println (str "Once upon a time" " in the west"))

  ;first line for true statements
  (println
    (if true
      "this is true"
      "else case")
    )

  ;second line for false
  (println
    (if false
      "skip"
      "false case")
    )

  ;multi-line conditionals
  (println
    (if true
      (do (println "Success")
          "Second line of success")
      (do (println "Failure")
          "Second line of failure")
      )
    )

  ;when form
  (println
    (when true
      (println "When, success")
      "When Sucess two"
      )
    )

  ;truthy and falsiness
  (println
    (if "strings are truthy"
      "Hi truthy"
      "Nope, falsy")
    (if nil
      "Nope"
      "Nil is falsey")
    )

  ;equality operator
  (println
    (= 1 1)
    (= 1 2)
    (= "Hi" "Hi")
    (= nil nil)
    )
  )