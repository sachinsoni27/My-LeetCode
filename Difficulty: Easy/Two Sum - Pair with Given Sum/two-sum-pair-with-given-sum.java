class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        int i =0;
        int j = n-1;

      while(i < j ){
          int sum = arr[i]+arr[j];
          if(sum == target ){
              return true;
          }else if(sum < target){
              i++;
          }else {
              j--;
          }
      }
      return false;
      
    }
};