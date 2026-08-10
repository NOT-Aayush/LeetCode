class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] sl = s.split("\\s+");
        StringBuilder ans = new StringBuilder();
        for (int i=sl.length-1;i>=0;i--){
            ans.append(sl[i]+" ");
        }
        return ans.toString().trim();
    }
}