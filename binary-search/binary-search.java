class Solution {
    static int biSearch(int[] arr, int i,int j,int k){
        if (i>j) return -1;
        int mid = i+((j-i))/2;
        if (arr[mid] == k) return mid;
        else if (arr[mid] < k) return biSearch(arr, mid+1, j, k);
        else return biSearch(arr,i,mid-1,k);
    }
    public int search(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        return biSearch(nums,i,j,target);
    }
}