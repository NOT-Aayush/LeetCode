class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans=0;
        for (int i : arr1){
            ans+=check(i,arr2,d);
        }
        return ans;
    }
    static int check(int arr, int[] arr2, int d){
        for (int i: arr2){
            if (Math.abs(arr-i)<=d) return 0;
        }
        return 1;
    }
}