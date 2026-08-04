import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        boolean isSorted = true;

     
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                isSorted = false;
                break;
            }
        }

       
        if (!isSorted) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (nums[j] > nums[j + 1]) {
                        int temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                    }
                }
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            for (int j = nums[i] + 1; j < nums[i + 1]; j++) {
                ans.add(j);
            }
        }

        return ans;
    }
}