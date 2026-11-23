class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer> h1 = new HashMap<>();
        HashMap<Character,Integer> h2 = new HashMap<>();
        int length_s = s.length();
        int length_t = t.length();
        if(length_s != length_t){
            return false;
        }
        for(int i=0;i<length_s;i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            h1.putIfAbsent(ch1,i);
            h2.putIfAbsent(ch2,i);

            if(!h1.get(ch1).equals(h2.get(ch2))){
                return false;
            }
        }
        return true;
    }
}