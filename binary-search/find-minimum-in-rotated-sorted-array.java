class Solution {
    static int binarySearch(int[] nums,int left,int right){
        while (left <=right){
            int mid = left + (right-left)/2;

            if (nums[left] < nums[right]){
                return nums[left];
            }
            else{
                left = mid+1;
            }
        }
        return nums[left];
        
    }
    public int findMin(int[] nums) {
        int left=0;
        int right= nums.length-1;
        return binarySearch(nums,left,right);
    }
}