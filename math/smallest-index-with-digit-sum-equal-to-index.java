class Solution {
    static int makeSum(int i){
        int sum =0;
        while (i>0){
            sum = sum+i%10;
            i=i/10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        for (int i=0;i<nums.length;i++){
            if (makeSum(nums[i]) == i) return i;
        }
        return -1;
    }
}