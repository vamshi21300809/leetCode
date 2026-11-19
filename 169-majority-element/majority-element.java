class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int current = 0;
        for(int i:nums){
            if(count == 0){
                current = i;
            }
            count += (i == current)? 1:-1;
        }
        return current;


        // HashMap<Integer,Integer> hm = new HashMap<>();
        // for(int i:nums){
        //     hm.put(i,hm.getOrDefault(i,0) + 1);
        // }
        // int n = nums.length;
        // for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
        //     if(entry.getValue() > n / 2){
        //         return entry.getKey();
        //     }
        // }
        //return 0;
    }
}