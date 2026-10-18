class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] score = new int[n+1];
        for (int i=0; i<trust.length; i++){
            score[trust[i][0]]--;
            score[trust[i][1]]++;
        }
        for (int i=1; i<=n; i++){
            if (score[i] == n-1) return i;
        }
        return -1;
    }
}