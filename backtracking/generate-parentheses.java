class Solution {
    static void gen(List<String> arr, StringBuilder s,char[] poss, int n,int open,int close){
        if (s.length()== 2*n){
            arr.add(s.toString());
            return;
        }
        if (open < n){
            s.append('(');
            gen(arr,s,poss,n,open+1,close);
            s.deleteCharAt(s.length()-1);
        }
        if (open > close){
            s.append(')');
            gen(arr,s,poss,n,open,close+1);
            s.deleteCharAt(s.length()-1);
        }

    }
    public List<String> generateParenthesis(int n) {
        List<String> arr = new ArrayList<>();
        char[] poss = new char[]{'(',')'};
        StringBuilder s = new StringBuilder();
        gen(arr,s,poss,n,0,0);
        return arr;
    }
}