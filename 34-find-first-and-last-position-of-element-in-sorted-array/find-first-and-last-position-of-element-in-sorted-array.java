class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1,last = -1;
        int low = 0,high = nums.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(target == nums[mid]){
                first = mid;
                high = mid - 1;
            }
            else if(target < nums[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        low = 0;
        high = nums.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(target == nums[mid]){
                last = mid;
                low = mid + 1;
            }
            else if(target < nums[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return new int[]{first,last};
    }
}
