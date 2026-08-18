class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l = new ArrayList<>();
        int n = nums.length;
        int min = (int)(n / 3);
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            int element = entry.getKey();
            int count = entry.getValue();

            if(count > min){
                l.add(element);
            }
        }
            
        return l;
    }
}