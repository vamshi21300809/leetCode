class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int sum = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        for(int i=0;i<n;i++){
            sum += nums[i];
            int remove = sum - k;
            count += hm.getOrDefault(remove,0);
            hm.put(sum,hm.getOrDefault(sum,0) + 1);
            // sum=0;
            // for(int j=i;j<n;j++){
            //     sum += nums[j];
            //     if(sum == k){
            //         count++;
            //     }
            // }
        }
        return count;
    }
}