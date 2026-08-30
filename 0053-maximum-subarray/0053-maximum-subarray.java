// class Solution {
//     public int maxSubArray(int[] nums) {
//         int n = nums.length;
//         int ans = Integer.MIN_VALUE;
//         for(int i =0; i<n; i++){
//             int sum =0;
//             for(int j = i; j<n ;j++){
//                 sum = sum +  nums[j];
//                 ans = Math.max(sum,ans);

//             }
//         }
//         return ans;
//     }
// }


// above solution is not optimal -----------------------------------------------------------------





class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int ans = Integer.MIN_VALUE;
         int sum =0;
         for(int i =0; i<n; i++){
            sum = sum +  nums[i]; 
             ans = Math.max(sum,ans);
              if(sum < 0){
                sum = 0;
              }
         }
         return ans;
    }

}