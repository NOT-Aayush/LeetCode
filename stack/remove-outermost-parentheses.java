class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        StringBuilder newS = new StringBuilder();
        int flip = 0;
        for (int i=0;i<n;i++ ){
            if ( s.charAt(i) == '('){
                if (flip>0){
                    newS.append(s.charAt(i));
            }
                flip++;
            }
            else{
                flip--;
                if (flip>0){
                    newS.append(s.charAt(i));
            }
            }
        }
        return newS.toString();
    }
}