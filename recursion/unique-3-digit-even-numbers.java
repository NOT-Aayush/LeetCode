class Solution {

    static void gen(int[] digits,int cnt,int num,boolean[] used,Set<Integer> set){
        if (cnt == 3){
            if (num%2==0){
                set.add(num);
            }
            return;
        }
        for (int i=0;i<digits.length;i++){
            if (cnt==0 && digits[i] == 0) continue;
            if (used[i]) continue;
            used[i] = true;
            gen(digits,cnt+1,num*10+digits[i],used,set);
            used[i] = false;
        }
    }
    public int totalNumbers(int[] digits) {
        Set<Integer> set = new HashSet<>();
        boolean[] used = new boolean[digits.length];
        gen(digits,0,0,used,set);
        return set.size();
    }
}