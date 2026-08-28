class Solution {
    static double pow(double x,long nm, double ans){
        if (nm == 0) return ans;
        if ( nm % 2 == 1){         
            ans*=x;
            nm--;
        }
        x*=x;
        nm/=2;
        return pow(x,nm,ans);
    }
    public double myPow(double x, int n) {
        long nm = Math.abs((long)n);
        double ans = 1;
        ans = pow(x,nm,ans);
        if(n<0) ans = (double) 1.0 / ans;
        return ans;
    }
}