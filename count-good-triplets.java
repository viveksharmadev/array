// https://leetcode.com/problems/count-good-triplets/
class Solution {
    // tc -> n^3, sc-> 1
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int res = 0, n = arr.length;
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    if(Math.abs(arr[i]-arr[j]) <= a &&
                      Math.abs(arr[j]-arr[k]) <= b &&
                      Math.abs(arr[k]-arr[i]) <= c)
                        res++;
                }
            }
        }   
        return res;
    }
    
    // Bit optimized
     // tc -> n^3, sc-> 1
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int res = 0, n = arr.length;
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                if(arr[i]-arr[j] > a) continue;
                for(int k=j+1; k<n; k++){
                    if(Math.abs(arr[i]-arr[j]) <= a &&
                      Math.abs(arr[j]-arr[k]) <= b &&
                      Math.abs(arr[k]-arr[i]) <= c)
                        res++;
                }
            }
        }   
        return res;
    }
}
