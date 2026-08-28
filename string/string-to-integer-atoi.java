class Solution {
    static public int recursion(String s,int ans, boolean pstv){
        if (s.isEmpty()) return ans;
        int digit = s.charAt(0) - '0';
        if (digit < 0 || digit > 9) return ans;

        if (pstv) {
            if ( ans > (Integer.MAX_VALUE - digit)/10) return Integer.MAX_VALUE;
            ans = ans*10+(digit);
        }
        else{
            if ( ans < (Integer.MIN_VALUE + digit)/10) return Integer.MIN_VALUE;
            ans = ans*10 -(digit);
        }
        s=s.substring(1);
        return recursion(s,ans,pstv);
    }
    public int myAtoi(String s) {
        s = s.trim();
        boolean pstv = true;
        int ans = 0;
        if (s.charAt(0) == '-') {
            pstv = false;
            s=s.substring(1);
        }
        else if (s.charAt(0) == '+'){
            s=s.substring(1);
        }
        return recursion(s,ans,pstv);
    }
}