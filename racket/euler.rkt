;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-intermediate-lambda-reader.ss" "lang")((modname euler) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #f #t none #f ())))
;If we list all the natural numbers below 10 that are multiples of 3 or 5, we 
;get 3, 5, 6 and 9. The sum of these multiples is 23.
;
;Find the sum of all the multiples of 3 or 5 below 1000.

(define (euler1 acc i)
  (cond [(= i 1000) acc]
        [(= 0 (modulo i 3)) (euler1 (+ acc i) (+ i 1))]
        [(= 0 (modulo i 5)) (euler1 (+ acc i) (+ i 1))]
        [else (euler1 acc (+ i 1))]))