class Solution {
    static Boolean isSafe(int row, int col, char[][] board){
        // checking horizontal
        for (int j=0; j<board.length; j++){
            if (board[row][j] == 'Q'){
                return false;
            }
        }
        // check vertical
        for (int i=0; i<board[0].length; i++){
            if (board[i][col] == 'Q'){
                return false;
            }
        }
        // check upper left
        int r = row;
        for (int c =col; c>=0 && r>=0; c-- ,r--){
            if (board[r][c] == 'Q'){
                return false;
            }
        }
        // check upper right
        r = row;
        for (int c=col; c<board.length && r>=0; c++, r--){
            if (board[r][c] == 'Q'){
                return false;
            }
        }
        // check lower left
        r = row;
        for (int c =col; c>=0 && r<board[0].length; c-- ,r++){
            if (board[r][c] == 'Q'){
                return false;
            }
        }
        // check lower right
        r = row;
        for (int c=col; c<board.length && r<board.length; c++, r++){
            if (board[r][c] == 'Q'){
                return false;
            }
        }
        return true;
    }
    static void saveBoard(char[][] board, List<List<String>> all){
        String row ="";
        List<String> newboard = new ArrayList<>();
        for (int i=0; i<board.length; i++){
            row="";
            for (int j=0;j<board[0].length;j++){
                if (board[i][j] == 'Q'){
                    row += 'Q';
                }
                else{
                    row +='.';
                }
            }
            newboard.add(row);
        }
        all.add(newboard);
    }
    static void helper(char[][] board, List<List<String>> all, int col){
        if (col == board.length){
            saveBoard(board,all);
            return;
        }
        for (int row=0;row<board.length;row++){
            if (isSafe(row,col,board)){
                board[row][col] = 'Q';
                helper(board,all,col+1);
                board[row][col] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> all = new ArrayList<>();
        char [][] board = new char[n][n];
        helper(board,all,0);
        return all;
    }
}