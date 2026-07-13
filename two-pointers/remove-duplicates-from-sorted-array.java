class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int n = nums.length;
        int curr = 0;
        for (int i=0; i<n;i++){
            if (nums[i]!=nums[curr]){
                curr++;
                nums[curr]=nums[i];
                count++;
            }
        }
        return count;
    }
}