class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans =nums[0]+nums[1]+nums[2];
        for (int i=0 ;i<nums.length;i++){
            int l = i+1;
            int r= nums.length-1;
            while (l<r){
                int sum = nums[i]+nums[l]+nums[r];
                int cur_diff = Math.abs(sum-target);
                int ans_diff= Math.abs(ans-target);
                if (cur_diff<ans_diff){
                    ans=sum;
                }
                if(ans==target){
                    return ans;
                }
                if (sum<target){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return ans;
    }
}