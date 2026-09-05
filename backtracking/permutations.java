class Solution {
    static int[] swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return nums;
    }
    static void getPerms(int[] nums, List<List<Integer>> ans, int idx){
        if (idx == nums.length){
            List<Integer> curr = new ArrayList<>();
            for (int i :nums){
                curr.add(i);
            }
            ans.add(curr);
        }
        for (int i=idx; i<nums.length; i++){
            swap(nums,idx,i);
            getPerms(nums,ans,idx+1);
            swap(nums,i,idx);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        getPerms(nums,ans,0);
        return ans;
    }
}