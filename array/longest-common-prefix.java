class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder lcp = new StringBuilder();
        lcp.append(strs[0]);
        for (String i: strs){
            int count =0;
            while (count < i.length() && count < lcp.length() && i.charAt(count) == lcp.charAt(count)){
                count++;
            }
            lcp.setLength(count);
            if (lcp.length() == 0){
                return "";
            }
        }
        return lcp.toString();
    }
}