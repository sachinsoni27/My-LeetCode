class Solution {
    public int missingNumber(int[] nums) {
        long n = nums.length +1;
        long sum = n*(n-1)/2;
       long  Arrsum =0;
        for(int ele : nums){
            Arrsum += ele;
        }
        return (int)(sum - Arrsum);
    }
}