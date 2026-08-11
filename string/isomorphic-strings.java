class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();
        for (int i=0 ; i<s.length();i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(map.containsKey(a) && !(map.get(a) == b)){
                return false;
            }
            else if(map2.containsKey(b) && !(map2.get(b) == a)){
                return false;
            }
            map.put(a,b);
            map2.put(b,a);
        }
        return true;
    }
}