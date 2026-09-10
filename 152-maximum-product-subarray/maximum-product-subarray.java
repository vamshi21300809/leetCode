class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = 1,min = 1;
        int ans = nums[0];
        for(int i=0;i<n;i++){
            int temp = max * nums[i];
            max = Math.max(temp,Math.max(min * nums[i],nums[i]));
            min = Math.min(temp,Math.min(min * nums[i],nums[i]));

            ans = Math.max(max,ans);
        }
        return ans;
    }
}