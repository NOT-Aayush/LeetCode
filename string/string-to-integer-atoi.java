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
             ans = ans*10 + (arr[i] - '0');
             i++;
        }
        return pstv ? ans : -ans;
    }
}