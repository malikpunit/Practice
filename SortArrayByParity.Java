class SortArrayByParity {
//https://leetcode.com/problems/sort-array-by-parity/submissions/
    public int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        
        int startI = 0;
        int endI = result.length-1;
        for(int i=0; i < nums.length; i++){
            //check even
            if(nums[i]%2 == 0){
                result[startI] = nums[i];
                startI++;
            } else {
                result[endI] = nums[i];
                endI--;
            }
        }
        return result;
    }
}
