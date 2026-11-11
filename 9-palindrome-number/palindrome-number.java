class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int palin = 0;
        int n = x;
        while(x > 0){
            int temp = x % 10;
            palin = palin * 10 + temp;
            x /= 10;
        }
        if(palin != n){
            return false;
        }
        return true;
    }
}