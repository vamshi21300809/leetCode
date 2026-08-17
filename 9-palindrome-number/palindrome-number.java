class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        long sum = 0;
        while(x > 0){
            int r = x % 10;
            sum = sum * 10 + r;
            x /= 10;
        }
        if(sum == n){
            return true;
        }
        else{
            return false;
        }
    }
}