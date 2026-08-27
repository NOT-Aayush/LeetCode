class Solution {
    public double myPow(double x, int n) {
        long nm = Math.abs((long)n);
        double ans = 1;
        while (nm>0){
            if ( nm % 2 == 1){         
                ans*=x;
                nm--;
            }
            x*=x;
            nm/=2;
        }
        if(n<0) ans = (double) 1.0 / ans;
        return ans;
    }
}