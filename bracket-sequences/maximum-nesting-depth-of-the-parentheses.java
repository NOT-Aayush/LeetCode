class Solution {
    public int maxDepth(String s) {
        int left =0;
        int right =0;
        int depth = 0;
        for (char c : s.toCharArray()){
            if (c == '('){
                left++;
            }
            if (c == ')'){
                right++;
            }
            if (left-right > depth){
                depth = left -right;
            }
        }
        return depth;
    }
}