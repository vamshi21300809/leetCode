class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l = new ArrayList<>();
        int n = nums.length;
        int min = (int)(n / 3) + 1;
        int count1=0;
        int count2=0;
        int ele1 = Integer.MIN_VALUE;
        int ele2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(ele1 == nums[i]){
                count1++;
            }
            else if(ele2 == nums[i]){
                count2++;
            }
            else if(count1 == 0){
                count1 = 1;
                ele1 = nums[i];
            }
            else if(count2 == 0){
                count2 = 1;
                ele2 = nums[i];
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int i=0;i<n;i++){
            if(ele1 == nums[i]){
                count1++;
            }
            else if(ele2 == nums[i]){
                count2++;
            }
        }
        if(count1 >= min){
            l.add(ele1);
        }
        if(count2 >= min){
            l.add(ele2);
        }
        return l;
    }
}



//      better aproach
        // HashMap<Integer,Integer> hm = new HashMap<>();
        // for(int i=0;i<n;i++){
        //     hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        // }

        // for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
        //     int element = entry.getKey();
        //     int count = entry.getValue();

        //     if(count > min){
        //         l.add(element);
        //     }
        // }