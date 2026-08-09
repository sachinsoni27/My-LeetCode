class Solution {
    public void reverseArray(int arr[]) {
        int n = arr.length;
        // code here
        int left =0;
        int right= n-1;
        
        while( left <right){
            int temp = arr[left];
             arr[left] = arr[right];
             arr[right]= temp;
            left++;
             right--;
        }
        /*for( int k =0; k<n; k++){
            System.out.print(arr[k]+" ");
        }*/
    }
}