class Solution {
    public long maxAlternatingSum(int[] nums) {
        //smallest at even, largest at odd
        long score=0;
        for (int i=0;i<nums.length;i++){
            nums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        int l=0;
        int r=nums.length-1;
        boolean odd =true;
        while (l<=r){
            if (odd){
                score += (long)nums[r]*nums[r];
                r--;
            }
            else{
                score -= (long)nums[l]*nums[l];
                l++;
            }
            odd=!odd;
        }
        return score;
    }
}