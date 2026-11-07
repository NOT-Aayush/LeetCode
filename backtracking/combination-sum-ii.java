class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        gen(0,candidates,target,new ArrayList<>(),0,ans);
        return ans;
    }
    static void gen(int pos,int[] candidates,int target,ArrayList<Integer> arr,int sum,List<List<Integer>> ans){
        if(sum>target) return;
        if (pos == candidates.length){
            if (sum == target && !ans.contains(arr)){
                ans.add(new ArrayList<>(arr));
            }
            return;
        }
        //takes
        sum+=candidates[pos];
        arr.add(candidates[pos]);
        gen(pos+1,candidates,target,arr,sum,ans);

        //backtrack
        sum-=candidates[pos];
        arr.remove(arr.size()-1);
        int next = pos + 1;
        while (next < candidates.length && candidates[next] == candidates[pos]) {
            next++;
        }
        gen(next,candidates,target,arr,sum,ans);
    }
}