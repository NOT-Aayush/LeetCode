class Solution {
    public boolean rotateString(String s, String goal) {
        int k=0;
        int len =0;
        for (int i=0; i < s.length();i++){
            if ( s.charAt((i+k)%s.length()) == goal.charAt(i)){
                len++;
                if(len == goal.length()){
                    return true;
                }
            }
            else{
                k++;
            }
        }
        return false;
    }
}