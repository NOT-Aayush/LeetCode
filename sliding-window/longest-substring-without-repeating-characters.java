class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        int maxlen=0;
        int i=0;
        for (int j=0 ; j<n ; j++){
            while (set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            maxlen = Math.max(maxlen, j-i+1);
        }
        return maxlen;
    }
}