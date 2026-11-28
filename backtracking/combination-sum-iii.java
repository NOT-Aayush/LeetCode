class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        if (k>n || n>45) return ans;
        rec(1,ans,k,n,new ArrayList<Integer>() ,0);
        return ans;
    }
    static void rec(int curr,List<List<Integer>> ans,int k,int n,List<Integer> arr,int sum){
        if ( arr.size() == k){
            if(sum == n){
                ans.add(new ArrayList<>(arr));
            }
            return;
        }
        if(curr>9) return;
        arr.add(curr);
        sum+=curr;
        rec(curr+1,ans,k,n,arr,sum);
        arr.remove(arr.size()-1);
        sum-=curr;
        rec(curr+1,ans,k,n,arr,sum);
    }
}