(ns dice.core
  (:import [java.security SecureRandom]))

;; This library was inspired by the 'rolldice' program, available on
;; many Linux and Unix systems.

(defn roll
  ;; Roll a virtual die with d sides.
  ([d]
   (inc (.nextInt (SecureRandom.) d)))
  ;; Roll a virtual die with d sides n times.
  ([n d]
   (for [i (range n)] 
     (roll d)))
  )










