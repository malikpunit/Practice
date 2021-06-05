class TwoSum {
  //https://leetcode.com/explore/learn/card/hash-table/184/comparison-with-other-data-structures/1115/
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i < nums.length; i++){
            int reqNum = target - nums[i];
            if(map.containsKey(reqNum)){
                return new int[]{i, map.get(reqNum)};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
