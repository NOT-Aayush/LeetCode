//using extra space
class Solution {

    public void sortColors(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i =0; i<n;i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
            map.put(nums[i],map.get(nums[i])+1);
            }
        }
        int index=0;
        for (int j=0;j<3;j++){
            int count = map.getOrDefault(j,0);
            while (count-->0){
                nums[index++]=j;
            }
        }
    }
}