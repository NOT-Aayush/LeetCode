class Solution {
    public int myAtoi(String s) {
        boolean pstv = true;
        s = s.trim();
        char[] arr = s.toCharArray();
        int i=0;
        int ans = 0;
        if ( arr[i] == '-'){
            pstv = false;
            i++;
        }else if( arr[i] == '+'){
            i++;
        }
        while( i < arr.length && arr[i] >= '0' && arr[i] <='9'){
            int digit = arr[i] - '0';
            if (ans > Integer.MAX_VALUE / 10 ||
                (ans == Integer.MAX_VALUE / 10 && digit > 7)) {
                return pstv ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            ans = ans * 10 + digit;
            i++;
        }
        return pstv ? ans : -ans;
    }
}