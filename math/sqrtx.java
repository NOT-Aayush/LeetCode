class Solution {
    public int mySqrt(int x) {
        int i=1;
        if (x<2){
            return x;
        }
        for (int j=0 ; j <(x/2)+1 ; j++){
            long sq = (long) i*i;
            if (sq == x){
                return i;
            }
            else if (sq <x) {
                i++;
            }
            else{
                break;
            }
        }
        return i-1;
    }
}