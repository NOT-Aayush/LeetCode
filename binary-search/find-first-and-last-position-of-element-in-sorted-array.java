class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int[] len = new int[]{-1,-1};
        while (l <= r){
            int mid = l + (r-l)/2;
            if (nums[mid] == target && (mid==nums.length-1 || nums[mid+1] != target)){
                len[1]=mid;
                r = mid-1;
            }
            else if (nums[mid]==target && (mid==0 || nums[mid-1] != target)){
                len[0]=mid;
                l = mid+1;
            }

            else if(nums[mid]>target){
                r = mid-1;
            }

            else{
                l= mid+1;
            }
        }
        return len;
    }
}