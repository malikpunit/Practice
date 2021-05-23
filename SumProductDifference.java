class SumProductDifference {
  //https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        
        do {
            int digit = n%10;
            sum += digit;
            product *= digit;
            n /= 10;
        } while(n>0);
            
        return (product - sum);
    } 
}
