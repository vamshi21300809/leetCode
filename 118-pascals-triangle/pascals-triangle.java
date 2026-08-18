class Solution {

    public int ncr(int r,int c){
        long ans = 1;
        if(c > r - c){
            c = r - c;
        }
        for(int i=0;i<c;i++){
            ans = ans * (r - i);
            ans /= (i+1);
        }
        return (int)ans;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> l1 = new ArrayList<>();
            for(int j=0;j<=i;j++){
                l1.add(ncr(i,j));
            }
            l.add(l1);
        }
        return l;
    }
}