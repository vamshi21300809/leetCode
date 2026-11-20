class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int posIdx = 0;
        int negIdx = 1;
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i] > 0){
                ans[posIdx] = nums[i];
                posIdx += 2;
            }
            else{
                ans[negIdx] = nums[i];
                negIdx += 2;
            }
        }
        // int pov[] = new int[n/2];
        // int neg[] = new int[n/2];
        // int j=0,k=0;
        // for(int i:nums){
        //     if(i < 0){
        //         neg[j++] = i;
        //     }
        //     else{
        //         pov[k++] = i;
        //     }
        // }
        // int a = 0, b = 0;
        // for(int i=0;i<n;i++){
        //     if(i % 2 == 0){
        //         nums[i] = pov[a++];
        //     }
        //     else{
        //         nums[i] = neg[b++];
        //     }
        // }
        return ans;
    }
}