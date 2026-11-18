class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        char nums[] = num.toCharArray();
        for(int i=n-1;i>=0;i--){
            if(nums[i] % 2 != 0){
                String sub = num.substring(0,i+1);
                return sub;
            }
        }
        return "";
    }
}