class Solution {
    public boolean rotateString(String s, String goal) {
        char ch[] = s.toCharArray();
        for(int i=0;i<s.length();i++){
            String s1 = new String(ch);
            if(s1.equals(goal)){
                return true;
            }
            char temp = ch[0];
            for(int j=1;j<s.length();j++){
                ch[j-1] = ch[j];
            }
            ch[s.length()-1] = temp;
        }
        return false;
    }
}