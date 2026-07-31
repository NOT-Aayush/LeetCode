class Solution {

    static void setter(int[][] matrix,int[] rows,int[] cols){
        for (int i=0;i<rows.length;i++){
            if ( rows[i] == 1){
                for (int j=0;j<matrix[0].length;j++){
                    matrix[i][j] = 0;
                }
            }
        }
        for (int j=0;j<cols.length;j++){
            if ( cols[j] ==1){
                for (int i=0;i<matrix.length;i++){
                    matrix[i][j] = 0;
                }  
            }
        }
    }
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[] rows = new int[row];
        int[] cols = new int[col];
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (matrix[i][j]== 0){
                    rows[i]=1;
                    cols[j]=1;
                }
            }
        }
        setter(matrix,rows,cols);
    }
}