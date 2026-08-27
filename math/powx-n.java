class Solution {
    public double myPow(double x, int n) {
        if (n==0) return 1;
        long nm = Math.abs(n);
        double ans = 1;
        while (nm>0){
            if ( nm % 2 == 1){         
                ans*=x;
                nm--;
            }
            else{
                x*=x;
                nm/=2;
            }
        }
        if(n<0) ans = (double) 1.0 / ans;
        return ans;
    }
}