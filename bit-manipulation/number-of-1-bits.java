class Solution {
    public int hammingWeight(int n) {
        String binary = Integer.toBinaryString(n);
        int ans=0;
        for (char i : binary.toCharArray()){
            if (i=='1') ans++;
        }
        return ans;
    }
}