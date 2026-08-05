class Solution {
    static int bs(int[] nums, int target, int l, int r){
        while (l<=r){
            int mid = l + (r-l)/2;
            if (nums[mid]==target){
                return mid;
            }
            else if (nums[mid] >= nums[l]){
                if (nums[l] > target || nums[mid] < target){
                     l = mid+1;
                }
                else{
                    r = mid-1;
                }
            }
            else if (nums[mid]<target){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        return bs(nums,target,l,r);
    }
}