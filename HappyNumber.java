class HappyNumber {
  //https://leetcode.com/explore/learn/card/hash-table/183/combination-with-other-algorithms/1131/
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int ss = 0;
        do{
            ss = sumOfSquares(n);
            if(set.contains(ss)){
                return false; 
            }
            set.add(ss);
            n = ss;
        } while(ss!=1);
        return true;
    }
    
    private int sumOfSquares(int n){
        int sum = 0;
        while(n > 0){
            sum += Math.pow((n%10), 2);
            n/=10;
        }
        return sum;
    }
}
