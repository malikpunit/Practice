class IntersectionTwoArrays {
    //https://leetcode.com/explore/learn/card/hash-table/183/combination-with-other-algorithms/1105/
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
      
        Set<Integer> set1 = new HashSet<>();
        
        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);
        }
        
        for(int i=0; i<nums2.length; i++){
            if(set.contains(nums2[i])){
                set1.add(nums2[i]);
                set.remove(nums2[i]);
            } 
        }
              
        return set1.stream().mapToInt(Integer::intValue).toArray();  
        
    }
}
