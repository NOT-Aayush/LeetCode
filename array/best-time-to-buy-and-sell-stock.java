class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int n = prices.length;
        int i=0;
        int j=1;
        while (j<n){
            if (prices[i]>prices[j]){
                i=j;
            }
            if (prices[j]-prices[i] > max){
                max = prices[j]-prices[i];
            }
            j++;
        }
        return max;
    }
}