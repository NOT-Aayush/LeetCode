class Solution {
    public long countCommas(long n) {
        String s = Long.toString(n);
        long len = (long)s.length();
        if (len <4) return 0;
        long ans =0;
        long inc = (len-1)/3;
        //long num = (long) Math.pow(10,len-1);
        for (long i=1 ; i<=inc ; i++){
            long num = (long) Math.pow(10, 3*i);
            long cap = (long) Math.min(n,Math.pow(10,3*(i+1))-1);
            ans +=(cap-num+1)*i;
        }
        return ans;
    }
}