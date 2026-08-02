class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int[] len = new int[]{-1,-1};
        while (l <= r){
            int mid = l + (r-l)/2;
            if (nums[mid] == target){
                if (nums[mid+1]>target){
                    len[1]=mid;
                    while(nums[mid] ==target){
                        len[0]=mid--;
                    }
                }
                else{
                    len[0]=mid;
                    while(nums[mid]==target){
                        len[1]=mid++;
                    }
                }
                return len;
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