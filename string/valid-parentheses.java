class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> mp = new HashMap<>();
        mp.put(')','(');
        mp.put(']','[');
        mp.put('}','{');

        Stack<Character> arr = new Stack<>();
        for (char c : s.toCharArray()){
            if ( mp.containsValue(c)){
                arr.push(c);
            }
            else{
                if (arr.isEmpty() || mp.get(c)!=arr.pop()){
                    return false;
                }
            }
        }
        return arr.isEmpty();
    }
}