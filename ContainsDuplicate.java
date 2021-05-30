class ContainsDuplicate {
    
  //https://leetcode.com/explore/learn/card/hash-table/183/combination-with-other-algorithms/1112/
    HashSet<Integer> set = new HashSet<>();
    
    public boolean containsDuplicate(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }    
        return false;
    }
}
