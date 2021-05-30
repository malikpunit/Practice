class SingleNumber {
//https://leetcode.com/explore/learn/card/hash-table/183/combination-with-other-algorithms/1176/
  public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0; i < nums.length; i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            } else{
                set.add(nums[i]);
            }
        }
        
        return set.stream().findFirst().get();
    }
}
