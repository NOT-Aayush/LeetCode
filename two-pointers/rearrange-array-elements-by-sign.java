class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for (int i: nums){
            if (i < 0){
                negative.add(i);
            }
            else{
                positive.add(i);
            }
        }
        Boolean p = true;
        int cnt=0;
        for (int i =0; i< nums.length;i++){
            if (p){
                nums[i]=positive.get(cnt);
                p=false;
            }
            else{
                nums[i]=negative.get(cnt);
                p = true;
                cnt++;
            }
        }
        return nums;
    }
}