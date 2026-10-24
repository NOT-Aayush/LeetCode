class Solution {
    static String comp(String s1, String s2, boolean flip) {
        if (flip) {
            return s1.compareTo(s2) > 0 ? s2 : s1;
        }
        return s1.compareTo(s2) > 0 ? s1 : s2;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String commStart = comp(arriveAlice, arriveBob, false);
        String commEnd = comp(leaveAlice, leaveBob, true);
        if (commStart.compareTo(commEnd) > 0) return 0;
        int startMonth= Integer.parseInt(commStart.substring(0, 2));
        int endMonth = Integer.parseInt(commEnd.substring(0, 2));
        int startDay = Integer.parseInt(commStart.substring(3, 5));
        int endDay = Integer.parseInt(commEnd.substring(3, 5));
        int time = 0;
        if (startMonth == endMonth) {
            return endDay-startDay+1;
        }        
        for (int i=startMonth; i<endMonth-1; i++){
            time+= days[i];
        }
        return ((days[startMonth - 1] - startDay + 1)+endDay+time);
    }
}