class Solution {
    static int binarySearch(int[] nums,int left,int right){
        int min =nums[0];
        while (left <=right){
            int mid = left + (right-left)/2;
            if (nums[mid]<min){
                min = nums[mid];
            }
            if (nums[left] < nums[right]){
                return nums[left];
            }
            else{
                if (nums[mid] < nums[right]){
                    right = mid;
                }
                else{
                    left = mid+1;                
                }
            }
        }
        return min;
        
    }
    public int findMin(int[] nums) {
        int left=0;
        int right= nums.length-1;
        return binarySearch(nums,left,right);
    }
}