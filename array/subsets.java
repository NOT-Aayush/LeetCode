class Solution {
    static void dfs( List<List<Integer>> ans, int[] ps, ArrayList<Integer> subset, int curr, int dep){
        if( dep == ps.length){
            ans.add(new ArrayList<>(subset));
            return;
        }
        subset.add(ps[curr]);
        dfs(ans,ps,subset,curr+1,dep+1);
        subset.remove(subset.size()-1);
        dfs(ans,ps,subset,curr+1,dep+1);
    }    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(ans,nums,new ArrayList<Integer>(),0,0);
        return ans;
    }
}