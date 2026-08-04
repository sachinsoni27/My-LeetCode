class Solution {
    public boolean isSorted(int[] arr) {
        int n = arr.length;
        int small = arr[0];
        for(int j=0 ; j <n ;j++){
        
        for( int i =j; i<n-1 ; i++){
            if( arr[i]> arr[i+1]){
                return false;
            }
        }
        // code here
        }
        return true;
    }
}