class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, majarityEle = 0;
        for(int num : nums){
            if(count == 0){
                majarityEle = num;
            }
            count += (num == majarityEle) ? 1 : -1;
        }
        return majarityEle;
    }
}