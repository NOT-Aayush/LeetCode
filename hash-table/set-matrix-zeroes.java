class Solution {
    public void setZeroes(int[][] matrix) {
        int[][] colm = new int[1][matrix[0].length];
        int[][] rows = new int[matrix.length][1];
        for (int row=0 ; row < matrix.length ; row++){
            for (int col=0 ; col < matrix[row].length ; col++){
                if (matrix[row][col] == 0) {
                    colm[0][col] = -1;
                    rows[row][0] = -1;
                }
            }
        }
        for (int row=0 ; row < matrix.length ; row++){
            for (int col=0 ; col < matrix[row].length ; col++){
                if (colm[0][col] == -1 || rows[row][0]==-1) {
                    matrix[row][col] = 0;
                }
            }
        }
    }
}