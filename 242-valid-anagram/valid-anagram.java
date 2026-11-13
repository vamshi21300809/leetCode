class Solution {
    public boolean isAnagram(String s, String t) {
        int s_length = s.length();
        int t_length = t.length();
        if(s_length != t_length){
            return false;
        }
        char ch[] = s.toCharArray();
        char ch1[] = t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        for(int i=0;i<s_length;i++){
            if(ch[i] != ch1[i]){
                return false;
            }
        }
        return true;
    }
}