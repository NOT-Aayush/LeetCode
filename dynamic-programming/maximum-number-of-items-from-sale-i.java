
class Solution {
    public int maximumSaleItems(int[][] items, int budget) {

        int n = items.length;
        int[] dp = new int[budget + 1];

        int minPrice = Integer.MAX_VALUE;

        for (int[] item : items) {

            int factor = item[0];
            int price = item[1];

            minPrice = Math.min(minPrice, price);

            // Count free items received
            int cnt = 0;

            for (int[] other : items) {
                if (other[0] % factor == 0) {
                    cnt++;
                }
            }

            // 0/1 Knapsack
            for (int j = budget; j >= price; j--) {

                dp[j] = Math.max(
                    dp[j],
                    dp[j - price] + cnt
                );
            }
        }
        int ans = 0;
        for (int i = 0; i <= budget; i++) {

            int extra = (budget - i) / minPrice;

            ans = Math.max(ans, dp[i] + extra);
        }

        return ans;
    }
}
