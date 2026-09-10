class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = 1,min = 1;
        int ans = nums[0];
        for(int i: nums){
            ans = Math.max(ans,i);
        }
        for(int i : nums){
            int temp = max * i;
            max = Math.max(temp,Math.max(min * i,i));
            min = Math.min(temp,Math.min(min * i,i));

            ans = Math.max(max,ans);
        }
        return ans;
    }
}