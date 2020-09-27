// https://leetcode.com/problems/crawler-log-folder/
class Solution {
    // tc -> n, sc-> 1
    public int minOperations(String[] logs) {
        int minOperations = 0;
        
        for(int i=0; i<logs.length; i++){
            
            if(logs[i].equals("./")) continue;
            
            if(logs[i].equals("../")) minOperations = Math.max(0, --minOperations);
            
            else minOperations++;
        }
        
        return minOperations;
    }
}
