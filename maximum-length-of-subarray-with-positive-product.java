// https://leetcode.com/problems/maximum-length-of-subarray-with-positive-product/
class Solution {
    // tc -> n, sc-> 1
    public int getMaxLen(int[] nums) {
        int minusCount = 0, firstNegative = -1, zeroIndex = -1;
        int maxLength = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0){
                minusCount++;
                
                if(firstNegative == -1) firstNegative = i;
            }
            
            if(nums[i]==0){
                minusCount = 0;
                firstNegative = -1;
                zeroIndex = i;
            }else{
                if(minusCount%2==0) maxLength = Math.max(maxLength, i-zeroIndex);                
                else maxLength = Math.max(maxLength, i-firstNegative);
            }
        }
        
        return maxLength;
    }
}
