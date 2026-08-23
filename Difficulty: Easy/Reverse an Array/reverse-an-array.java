class Solution {
    public void reverseArray(int arr[]) {
        // code
        int i = 0;
        int j = arr.length-1;
        while( j>i ){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
       
      
    }
}