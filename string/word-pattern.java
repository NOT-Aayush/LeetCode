class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] arr = pattern.toCharArray();
        HashMap<Character,String> map = new HashMap<>();
        HashMap<String,Character> revmap = new HashMap<>();
        ArrayList<String> strs = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i) == ' '){
                strs.add(str.toString());
                str.setLength(0);
            }
            else{
                str.append(s.charAt(i));
            }
        }
        strs.add(str.toString());
        if (arr.length != strs.size()) return false;
        for (int i=0;i<strs.size();i++){
            char c = arr[i];
            String word = strs.get(i);
            if (map.containsKey(c) && !map.get(c).equals(word)) return false;
            if (revmap.containsKey(word) && !revmap.get(word).equals(c)) return false;
            map.put(c,word);
            revmap.put(word,c);
        }
        return true;
    }
}