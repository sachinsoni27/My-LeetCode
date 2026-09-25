class Solution {
    public int maxArea(int[] h) {
        int ans = 0;
        int left = 0;
        int right = h.length - 1;
        while(left < right){
            int area = Math.min(h[left], h[right])*(right - left);
            ans = Math.max(area, ans);
            if(h[left] <= h[right]){
                left++;
            }else{
                right--;
            }
        }
        return ans;
    }
}