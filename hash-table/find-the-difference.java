class Solution {
    public char findTheDifference(String s, String t) {
        char[] arr = s.toCharArray();
        char[] trr = t.toCharArray();
        for (int i=0;i<trr.length-1;i++){
            if (arr[i]!=trr[i]) return trr[i];
        }
        return trr[trr.length-1];
    }
}