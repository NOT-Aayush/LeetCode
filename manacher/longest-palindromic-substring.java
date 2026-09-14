class Solution {
    static boolean isPalinedrome(String str){
        char[] arr = str.toCharArray();
        int i=0;
        int j=arr.length-1;
        while (i<=j){
            if (!(arr[i]==arr[j])) return false;
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String maxSub = "";
        for (int i=0;i<s.length();i++){
            String str = "";
            for (int j=i;j<s.length();j++){
                str = s.substring(i,j+1);
                if (isPalinedrome(str)){
                    if (str.length()>maxSub.length()){
                        maxSub = str;
                    }
                }
            }
        }
        return maxSub;
    }
}