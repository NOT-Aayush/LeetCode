class Solution {
    static final long MOD = 1_000_000_007;
    static long pow(long x,long nm){
        long ans =1;
        while (nm>0){
            if (nm %2 == 1){
                ans = (ans*x)%MOD;
            }
            x= (x*x)%MOD;
            nm/=2;        
        }
        return ans;
    }
    public int countGoodNumbers(long n) {
        long even = (n+1)/2;
        long odd = n/2;
        return (int) ((pow(5, even) * pow(4, odd)) % MOD);

    }
}