class Solution {
    public String digitSum(String s, int k) {
        while (s.length() > k){
            int sum = 0;
            int len = 0;
            StringBuilder ans = new StringBuilder();
            for ( char c : s.toCharArray()){
                if ( len == k){
                    len = 0;
                    ans.append(sum);
                    sum = 0;
                }
                sum+= c - '0';
                len++;
            }
            if (len >0) ans.append(sum);
            s = ans.toString();
        }
        return s;
    }
}