class Solution {
    static void makezeros(int[][] matrix, int row , int col){

            //make row
            for (int i=0;i<matrix[0].length;i++){
                matrix[row][i] = 0;
            }
            //make cols
            for (int i=0;i<matrix.length;i++){
                matrix[i][col] = 0;
            }         
        
    }
    static void setter(int[][] matrix,int[][] buff){
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (buff[i][j]==1){
                    makezeros(matrix,i,j);
                }
            }
        }
    }
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] buff = new int[row][col];
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (matrix[i][j]== 0){
                    buff[i][j] =1;
                }
                else{
                    buff[i][j] = 0;
                }
            }
        }
        setter(matrix,buff);
    }
}