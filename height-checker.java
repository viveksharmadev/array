// https://leetcode.com/problems/height-checker/

class height-checker {
    // tc -> nlogn, sc-> n
    public int heightChecker(int[] heights) {
        int[] clone = heights.clone();
        Arrays.sort(clone);
        int res = 0;
        for(int i=0; i<heights.length; i++){
            if(clone[i]!=heights[i]){
                res++;
            }
        }
        return res;
    }
}
