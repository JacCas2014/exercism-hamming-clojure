 (ns hamming)

 (defn distance [strand strandToCompareTo]
  (count (filter false? (map = strand strandToCompareTo))))