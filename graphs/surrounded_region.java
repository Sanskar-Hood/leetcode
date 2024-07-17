// import java.util.ArrayDeque;
// import java.util.Queue;
// import javax.management.Query;

public class surrounded_region {

    public static void main(String[] args) {
        char[][] board = {
            {'X', 'X', 'X', 'X'},
            {'X', 'O', 'O', 'X'},
            {'X', 'X', 'O', 'X'},
            {'X', 'O', 'X', 'X'}
            
        };
        solve(board);
        for(int i=0 ;i < 4 ; i++){
            System.out.println();
            for(int j=0;j<4 ;j++){
                System.out.print(board[i][j]+"  ");
            }
        }
    }

    public static void solve(char[][] board) {
        int r=board.length;
        int c=board[0].length;

        // 1.check border cells run dfs and identify 'O'
        for(int i=0 ;i < r ; i++){
            for(int j=0;j<c ;j++){
                if((board[i][j]=='O' && (i==0 || i==r-1) ) || (board[i][j]=='O' && (j==0 || j==c-1) ) ){
                   dfs(i,j,board);
                }
            }
        }

        // 2.reconvert remaining O to X and T to O
        for(int i=0 ;i < r ; i++){
            for(int j=0;j<c ;j++){
                if(board[i][j]=='O') board[i][j]='X';
                
                else if(board[i][j]=='T') board[i][j]='O';
            }
        }
    }

    public static void dfs(int i , int j ,char[][]board){
        if(i<0 || j<0 || i==board.length || j==board[0].length || board[i][j]!='O' ) return;
        else{
            board[i][j]='T';
            dfs(i+1, j, board);
            dfs(i-1, j, board);
            dfs(i, j+1, board);
            dfs(i, j+1, board);
            dfs(i, j-1, board);
        }
    }
}
    

