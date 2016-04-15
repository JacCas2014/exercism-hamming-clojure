 (ns hamming)

 (defn distance [strand strandToCompareTo]
  (when (= (count strand) (count strandToCompareTo))
   (count (filter false? (map = strand strandToCompareTo)))))