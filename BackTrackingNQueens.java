
public class BackTrackingNQueens {
    static int count=0;
public static void main(String[] args) {
    int n=5;
    char board[][]=new char[n][n];
    for(int i=0;i<board.length;i++){
        for(int j=0;j<board.length;j++){
            board[i][j]='.';
        }
    }
    nQueens(board,0);
    System.out.println("total ways to solve nQueens is:"+count);
}   

private static boolean isSafe(char board[][],int row, int col){

    //vertically up
    for(int i=row-1;i>=0;i--){
    if(board[i][col]=='Q'){
        return false;
    }}

    //diagnolly left up
    for(int i =row-1,j=col-1;i>=0 && j>=0; i--,j--){
        if(board[i][j]=='Q'){
            return false;
        }
    }

    //diagnol right up

    for(int i=row-1, j =col+1;i>=0 && j<board.length;j++,i--){
        if(board[i][j]=='Q'){
            return false;
        }
    }

    return true;



}
private static void nQueens(char board[][], int row){
    
    //base case
    if(row==board.length){
        printBoard(board);
        count++;
        return;
    }
    //column loop
    for(int j=0;j<board.length;j++){

        if(isSafe(board,row,j)){
            board[row][j]='Q';
            nQueens(board, row+1);
            board[row][j]='.';
        }
    }
}

private static void printBoard(char board[][]){
    System.out.println("------------------");
    for(int i=0;i<board.length;i++){
        for(int j=0;j<board.length;j++){
            System.out.print(board[i][j]+" ");

        }
        System.out.println();
    }
}

}
