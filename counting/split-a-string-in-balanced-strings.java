class Solution {
    public int balancedStringSplit(String s) {
        int r = 0;
        int l = 0;
        int split=0;
        for (char c: s.toCharArray()){
            if (c == 'R') r++;
            if ( c == 'L') l++;
            if ( r==l) split++;
        }
        return split;
    }
}