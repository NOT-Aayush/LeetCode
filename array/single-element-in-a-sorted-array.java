class Solution {
    static int binarySearch(int[] nums, int left, int right){
        while (left <= right){
            int mid = left + (right -left)/2;
            if ( mid > 0 && nums[mid] == nums[mid-1] ){
                if( (mid-1)%2 ==0 ){
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }
            else if (mid <nums.length-1 && nums[mid] == nums[mid+1]){
                if( mid%2 ==0 ){
                    left = mid +1;
                }
                else{
                    right = mid-1;
                }
            }
            else{
                return nums[mid];
            }
        }
        return -1;
    }
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        return binarySearch(nums,left,right);
    }
}