class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] temp = path.split("/");
        for (String p : temp){
            if (p.equals("..")){
                if (!st.isEmpty()) st.pop();
            }
            else if (!p.equals(".") && !p.equals("")) st.push(p);
            }
        String abs = "";
        for (String t: st){
            abs += "/" + t;
        }
        return abs.isEmpty() ? "/" : abs; 
    }
}