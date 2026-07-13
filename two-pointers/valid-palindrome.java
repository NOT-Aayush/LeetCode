class Solution {
    public boolean isPalindrome(String s) {
        String sn = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int l=0;
        int r=sn.length()-1;
        while (l<r){
            if (sn.charAt(l) != sn.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}