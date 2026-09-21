class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i=0;i<s.length();i++){
            List<Integer> curr = new ArrayList<>();
            curr.add(i);
            char ini = s.charAt(i);
            int j;
            for ( j=i+1;j<s.length();j++){
                char sec = s.charAt(j);
                if ( ini != sec){
                    break;
                }
            }
            int leng = j-i;
            if (leng >=3){
                curr.add(j-1);
                ans.add(curr);
            }
            i = j-1;
        }
        return ans;
    }
}