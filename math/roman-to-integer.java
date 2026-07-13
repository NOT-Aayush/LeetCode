class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);

        int num = 0;
        int prevnum = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            char now= s.charAt(i);
            int curnum=mp.get(now);
            if (prevnum > curnum){
                num -= curnum;
            }
            else{
                num += curnum;
            }
            prevnum = curnum;
        }
        return num;
    }
}