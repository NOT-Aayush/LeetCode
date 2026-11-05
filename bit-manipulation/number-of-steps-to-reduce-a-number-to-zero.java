class Solution {
    public int numberOfSteps(int num) {
        return rec(num,0);
    }
    static int rec(int num, int ans){
        if (num==0) return ans;
        if(num%2==0) return rec(num/2,++ans);
        return rec(num-1,++ans);
    }
}