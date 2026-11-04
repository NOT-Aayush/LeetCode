class Solution {
    public static void subseq(int pos, int tag, int[] qes, ArrayList<Integer> arr, int sum, List<List<Integer>> ans){
        if (sum > tag) return ;
        if (pos == qes.length){
            if (sum == tag){
                ans.add(new ArrayList<>(arr));
            }
            return;
        }
        sum+=qes[pos];
        arr.add(qes[pos]);
        subseq(pos,tag,qes,arr,sum,ans);
        sum-=qes[pos];
        arr.remove(arr.size()-1);
        subseq(pos+1,tag,qes,arr,sum,ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        subseq(0,target,candidates,new ArrayList<Integer>(),0,ans);
        return ans;
    }
}