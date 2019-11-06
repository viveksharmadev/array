// https://leetcode.com/problems/sum-of-digits-in-the-minimum-number/
class sum-of-digits-in-the-minimum-number {
    // tc -> n, sc-> 1
    int min = Integer.MAX_VALUE;
    public int sumOfDigits(int[] A) {
        for(int i=0; i<A.length; i++){
            if(A[i]<min){
                min = A[i];
            }
        }
        
        //System.out.println(min);
        int sum = 0;
        while(min > 0){
            int mod = min%10;
            sum += mod;
            min /= 10;
        }
        //System.out.println(min);
        return sum%2!=0 ? 0 : 1;
    }
}
