class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        int zeroCount = 0;
        int product = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                product *= nums[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (zeroCount >= 2) {
                answer[i] = 0;
            } else if (zeroCount == 1) {
                answer[i] = (nums[i] == 0) ? product : 0;
            } else {
                answer[i] = product / nums[i];
            }
        }

        return answer;
    }
}   