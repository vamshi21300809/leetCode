class Solution {
    public boolean isPalindrome(int x) {
        int palin = 0;
        int n = x;
        while(n > 0){
            int temp = n % 10;
            palin = palin * 10 + temp;
            n /= 10;
        }
        if(palin != x){
            return false;
        }
        return true;
    }
}