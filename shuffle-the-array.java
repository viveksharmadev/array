// https://leetcode.com/problems/shuffle-the-array/
class Solution {
    // tc -> n, sc-> n
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int[] res = new int[len];
        int i=0, j = n, k= 0;
        while(i<n && j<nums.length){
            res[k++] = nums[i++];
            res[k++] = nums[j++];
        }
        return res;
    }
}
