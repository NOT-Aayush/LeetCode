class Solution {
    static boolean bs(int[] nums, int target, int l, int r){
        while (l<=r){
            int mid = l + (r-l)/2;
            if (nums[mid]==target){
                return true;
            }
            else if (nums[l] == nums[mid] && nums[mid] == nums[r]){
                l++;
                r--;
            }
            else if (nums[mid] >= nums[l]){
                if (nums[l] <= target && nums[mid] > target){
                     r = mid-1;
                }
                else{
                    l = mid+1;
                }
            }
            else {
                if (nums[mid]<=target && nums[r]>=target){
                    l = mid+1;
                }
                else{
                    r = mid-1;
                }
            }
        }
        return false;
    }
    public boolean search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        return bs(nums,target,l,r);
    }
}