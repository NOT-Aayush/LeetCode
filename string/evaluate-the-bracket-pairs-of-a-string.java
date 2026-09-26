class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder ans = new StringBuilder();
        StringBuilder helper = new StringBuilder();
        boolean rep = false;
        Map<String, String> map = new HashMap<>();
        for (List<String> pair : knowledge) {
            map.put(pair.get(0), pair.get(1));
        }
        for ( int i=0; i<s.length(); i++){
            if ( s.charAt(i) == '('){
                rep = true;
                continue;
            }
            if (!rep){
                ans.append(s.charAt(i));
            }
            else{
                if (s.charAt(i) == ')'){
                    rep = false;
                    ans.append(map.getOrDefault(helper.toString(),"?"));
                    helper.setLength(0);
                    continue;
                }
                helper.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}