class Solution {
    public int pivotIndex(int[] nums) {
        int tsum = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (tsum - sum - nums[i] == sum) return i;
                sum += nums[i];
        }
        return -1;
    }
}   