class Solution {
    public char findTheDifference(String s, String t) {
        char[] arr = s.toCharArray();
        char[] trr = t.toCharArray();
        char ans =0;
        for (char i: arr){
            ans^=i;
        }
        for (char i: trr){
            ans^=i;
        }
        return ans;
    }
}