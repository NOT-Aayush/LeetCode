class Solution {
    public long countCommas(long n) {
        String s = Long.toString(n);
        long len = (long)s.length();
        if (len <4) return 0;
        long inc = (len-1)/3;
        long num = (long) Math.pow(10,len-1);
        return (n-num+1)*inc;
    }
}