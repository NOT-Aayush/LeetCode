class Solution {
    public int strStr(String haystack, String needle) {
        for (int i =0 ; i <haystack.length() ; i++){
            int j=i+needle.length()-1;
            if (j>=haystack.length()){
                break;
            }
            if (haystack.charAt(i) == needle.charAt(0) && haystack.charAt(j) == needle.charAt(needle.length()-1)){
                if (haystack.substring(i,j+1).equals(needle)){
                    return i;
                }
            }
            else{
            }
        }
        return -1;
    }
}