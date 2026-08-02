class Solution {
    static int bs( int[] nums, int target, int l, int r, boolean swtch){
        int ans=-1;
        while (l <= r){
            int mid = l + (r-l)/2;
            if (nums[mid] == target && !swtch){
                ans=mid;
                r = mid-1;
            }
            else if (nums[mid] == target && swtch){
                ans=mid;
                l = mid+1;
            }
            else if(nums[mid]>target){
                r = mid-1;
            }

            else{
                l= mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int[] len = new int[]{-1,-1};
        boolean swtch = false;
        len[0] = bs(nums,target,l,r,swtch);
        swtch =true;
        len[1] = bs(nums,target,l,r,swtch);
        return len;
    }
}