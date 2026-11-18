class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        int total_sum = 0;
        for(int i=0;i<=nums.length;i++){
            total_sum += i;
        }
        return total_sum - sum;
    }
}