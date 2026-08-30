class Solution {
    public int subarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i=0 ;i<nums.length;i++){
            set.add(k-nums[i]);            
        }
        int ans=0;
        for (int i=0;i<nums.length-1;i++){
            if (set.contains(k-nums[i])) ans++;
        }
        return ans;
    }
}