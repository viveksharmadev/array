// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
class find-numbers-with-even-number-of-digits {
    // tc -> n, sc-> 1
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            int curr = num;
            int len = 0;
            while(curr > 0){
                curr /= 10;
                len++;
            }
            if(len%2==0) count++;
        }
        return count;
    }
}
