class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int max = nums[0];
        int min = nums[n-1];
        int[] maxs = new int[n];
        int[] mins = new int[n];
        for (int i=0;i<n;i++){
            max = Math.max(max,nums[i]);
            maxs[i] = max;
        }
        for (int i=n-1;i>=0;i--){
            min = Math.min(min,nums[i]);
            mins[i] = min;
        }
        for (int i=0;i<n;i++){
            if ((maxs[i]-mins[i]) <=k) return i;
        }

        return -1;
    }
}