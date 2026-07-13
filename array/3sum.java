class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> sol=new HashSet<>();

        Arrays.sort(nums);
        for (int i=0 ; i<nums.length;i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; 
            }
            int j=i+1;
            int k=nums.length -1;
            while (j<k){
                if (nums[i]+nums[j]+nums[k]==0){
                    sol.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                else if(nums[i]+nums[j]+nums[k] > 0){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return new ArrayList(sol);
    }
}