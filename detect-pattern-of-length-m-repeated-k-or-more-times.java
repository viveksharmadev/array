// https://leetcode.com/problems/detect-pattern-of-length-m-repeated-k-or-more-times/
class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        int count = 0;
        for(int i=0; i+m<arr.length; i++){
            if(arr[i]!=arr[i+m]){
                count = 0;
            }else{
                count++;
            }
            
            if(count >= (k-1)*m) return true;
        }   
        
        return false;
    }
}
