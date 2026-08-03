class Solution {
    static int findPvt(int[] nums,int l,int r){
        while(l<=r){
            int mid = l + (r-l)/2;
            if (mid<nums.length-1 && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if (nums[mid]<nums[l]){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return -1;
    }
    static int bs(int[] nums,int target,int l,int r){
        while (l<=r){
            int mid = l + (r-l)/2;
            if (nums[mid]==target){
                return mid;
            }
            else if (nums[mid]>target){
                 r =mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int l=0;
        int r = nums.length-1;
        int pvt = findPvt(nums,l,r);
        int left = bs(nums,target,l,pvt);
        int right = bs(nums,target,pvt+1,r);
        if (left != -1){
            return left;
        }
        return right;
    }
}