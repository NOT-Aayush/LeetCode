class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int max_sum=0;
        for (int i=0;i<k;i++){
            max_sum+=nums[i];
        }
        int left=0;
        int sum = max_sum;
        for (int j=k;j<n;j++){
            sum = sum + nums[j] - nums[left];
            left++;
            max_sum = Math.max(max_sum,sum);
        }
        return (double) max_sum/k;
    }
}