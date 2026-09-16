class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        for(int i =0; i <=n ; i++){
                boolean contains = false;
                for ( int j=0; j<n ; j++){
                    if ( i == nums[j]){
                        contains = true;
                    }
                }
                if (!contains) return i;
            }
        return 0;
    }
}