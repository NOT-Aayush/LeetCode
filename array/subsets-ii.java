class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        subs(0,nums,new ArrayList<Integer>(),set);
        return new ArrayList<>(set);
    }
    static void subs(int pos,int[] nums,List<Integer> arr,HashSet<List<Integer>> set){
        if (pos == nums.length){
            set.add(new ArrayList<>(arr));
            return;
        }
        arr.add(nums[pos]);
        subs(pos+1,nums,arr,set);
        arr.remove(arr.size()-1);
        subs(pos+1,nums,arr,set);
    }
}