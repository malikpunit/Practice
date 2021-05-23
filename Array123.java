class Array123{
  //https://codingbat.com/prob/p136041
  public boolean array123(int[] nums) {
    for(int i=0; i < nums.length-2; i++){
      if(nums[i] == 1 && nums[i+1] == 2 && nums[i+2] ==3) return true;
    } 
    return false;
  }
}
