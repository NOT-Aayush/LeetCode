class Solution {
    public int lengthOfLongestSubstring(String s) {
        String maxstr="";
        for (int i=0;i<s.length();i++){
            String curstr="";
            HashMap<Character,Character> mp = new HashMap<>();
            for (int j=i;j<s.length();j++){
                if (mp.containsKey(s.charAt(j))){
                    break;
                }
                else{
                    mp.put(s.charAt(j),s.charAt(j));
                    curstr +=s.charAt(j);
                    if (curstr.length() > maxstr.length()){
                    maxstr=curstr;
                }
                }

                
            }
        }
        return maxstr.length();
    }
}