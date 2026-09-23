class Solution {
    static int getMax(int[] nums) {
    int max = Integer.MIN_VALUE;

    for (int num : nums) {
        max = Math.max(max, num);
    }
    return max;
    }
    static int solve(int[] nums, int n){
        if (n==2) return getMax(nums);
        int num = getMax(nums);
        for (int i=0; i<nums.length;i++){
            if (nums[i]==num){
                nums[i] = Integer.MIN_VALUE;
            }
        }
        return solve(nums,n+1);
    }
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        if (set.size() < 3) {
            return getMax(nums);
        }
        return solve(nums,0);
    }
}