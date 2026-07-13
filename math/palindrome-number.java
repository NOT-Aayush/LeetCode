class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        String a1 = String.valueOf(x);
        String a2 = "";

        for (int i = a1.length() - 1; i >= 0; i--) {
            char ch = a1.charAt(i);
            a2 += ch;
        }

        return a1.equals(a2);
    }
}