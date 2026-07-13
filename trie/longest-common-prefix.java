class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        String cm = strs[0];
        String ans="";
        for (int i =1 ; i<strs.length; i++){
            ans = "" ;
            int n=Math.min(strs[i].length(),cm.length());
            for (int j=0;j<n;j++){
                if (strs[i].charAt(j) == cm.charAt(j)){
                    ans += strs[i].charAt(j);
                }
                else{
                    break;
                }
            }
            cm=ans;
        }
        return cm;
    }
        
}
