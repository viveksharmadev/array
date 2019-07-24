// https://leetcode.com/problems/duplicate-zeros/

class duplicate-zeros {
    // tc -> n, sc-> 1
    public void duplicateZeros(int[] arr) {
        // Step1 : count 0 and determine the new length
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0)
            count++;
        }
        int newLength = arr.length + count;
        // Step2 : with new length we know how much we can fit using second pointer
        for(int i=arr.length-1, j=newLength-1; i>=0 && j>=0; i--,j--){
            if(arr[i]!=0){
                if(j<arr.length) arr[j] = arr[i];
            }else{
                if(j<arr.length) arr[j] = arr[i];
                j--;
                if(j<arr.length) arr[j] = arr[i];                
            }
        }        
    }
}
