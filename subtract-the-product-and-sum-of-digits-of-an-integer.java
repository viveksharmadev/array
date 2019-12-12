// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
class subtract-the-product-and-sum-of-digits-of-an-integer {
    // tc -> n, sc-> 1
    public int subtractProductAndSum(int n) {
        int sum = 0, product = 1;
        while(n>0){
            int mod = n%10;
            sum += mod;
            product *= mod;
            n /= 10;
        }
        return product-sum;
    }
}
