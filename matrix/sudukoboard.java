public class sudukoboard
{
    public static void printBoard(char[][] board)
    {
        int n = board.length;
        int m = board[0].length;

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean checkbox(char num, char board[][], int startX, int startY, int endX, int endY)
    {
        for(int i = startX; i <= endX; i++)
        {
            for(int j = startY; j <= endY; j++)
            {
                if(board[i][j] == num)
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValidbox(int x, int y, char num, char board[][])
    {
        int startX = (x / 3) * 3;
        int startY = (y / 3) * 3;
        int endX = startX + 2;
        int endY = startY + 2;
        return checkbox(num, board, startX, startY, endX, endY);
    }

    public static boolean isValid(int x, int y, char num, char board[][])
    {
        int i = 0;
        while(i < board.length)
        {
            if(board[i][y] == num)
            {
                return false;
            }
            if(board[x][i] == num)
            {
                return false;
            }
            i++;
        }

        return isValidbox(x, y, num, board);
    }

    public static boolean solve(char board[][])
    {
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[0].length; j++)
            {
                if(board[i][j] == '.')
                {
                    for(char num = '1'; num <= '9'; num++)
                    {
                        if(isValid(i, j, num, board))
                        {
                            board[i][j] = num;
                            if(solve(board))
                            {
                                return true;
                            }
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args)
    {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        if(solve(board))
        {
            printBoard(board);
        }
        else
        {
            System.out.println("No solution exists");
        }
    }
}