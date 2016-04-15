(ns hamming-test
  (:require [clojure.test :refer [deftest is]]
            [hamming :refer :all])
  (:use midje.sweet))

(fact "no-difference-between-empty-strands"
        (hamming/distance "" "") => 0)

(fact "no-difference-between-identical-strands"
       (hamming/distance "GGACTGA" "GGACTGA") => 0)

(fact "complete-distance-in-small-strand"
      (hamming/distance "ACT" "GGA") => 3)

(fact "small-distance-in-middle-somewhere"
      (hamming/distance "GGACG" "GGTCG") => 1)

(fact "larger-distance"
       (hamming/distance "ACCAGGG" "ACTATGG") => 2)

(fact "undefined-when-lengths-are-different"
       (hamming/distance "AAAC" "TAGGGGAGGCTAGCGGTAGGAC") => nil
       (hamming/distance "GACTACGGACAGGGTAACATAG" "GACA") => nil)
