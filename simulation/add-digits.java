class Solution {

    static int addDigs(String numS) {
        if (numS.length() == 1) {
            return Integer.parseInt(numS);
        }
        int sum = 0;
        for (int i = 0; i < numS.length(); i++) {
            sum += numS.charAt(i) - '0';
        }
        return addDigs(String.valueOf(sum));
    }

    public int addDigits(int num) {
        String numS = String.valueOf(num);
        return addDigs(numS);
    }
}