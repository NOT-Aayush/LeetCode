class Solution {
    static boolean recurr(Set<Integer> set,int sum){
        if (sum == 1) return true;
        if (set.contains(sum)) return false;
        char[] chars = Integer.toString(sum).toCharArray();
        int newSum=0;
        for (char c : chars){
            int digit = c - '0';
            newSum += digit*digit;
        }
        set.add(sum);
        return recurr(set,newSum);
    }
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        return recurr(set,n);
    }
}