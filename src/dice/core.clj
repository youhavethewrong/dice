(ns dice.core
  (:import [java.security SecureRandom]))

;; This library was inspired by the 'rolldice' program, available on
;; many Linux and Unix systems.

(defn roll
  ;; Roll a virtual die with d sides.
  ([d]
   (inc (.nextInt (SecureRandom.) d)))
  ;; Roll a virtual die with d sides n times.
  ([d n]
   (for [i (range n)] 
     (roll d)))
  ;; Roll s sets of virtual dice with d sides n times.
  ([d n s]
   (for [j (range s)]
     (roll d n)))
  )










