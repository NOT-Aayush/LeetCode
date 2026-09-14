class Solution {
    public char findTheDifference(String s, String t) {
        char[] arr = s.toCharArray();
        char[] trr = t.toCharArray();
        for (int i=0;i<trr.length;i++){
            if (arr[i]!=trr[i]) return trr[i];
        }
        return trr[0];
    }
}