public class mat01
{
    public static void find(int matrix[][], int result[][], int i, int j, int n, int m, int dis)
    {
        dis = dis + 1;

        if(i < 0 || j < 0 || i >= n || j >= m)
        {
            return;
        }
        if(matrix[i][j] == 0)
        {
            return;
        }

        if(result[i][j] != 0 && result[i][j] <= dis)
        {
            return;
        }

        result[i][j] = dis;

        find(matrix, result, i+1, j, n, m, dis);
        find(matrix, result, i-1, j, n, m, dis);
        find(matrix, result, i, j+1, n, m, dis);
        find(matrix, result, i, j-1, n, m, dis);
    }

    public static void main(String[] args)
    {
        int matrix[][] = {{0,0,0},{0,1,0},{1,1,1},{1,1,1}};

        int n = matrix.length;
        int m = matrix[0].length;

        int result[][] = new int[n][m];

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(matrix[i][j] == 0)
                {
                    find(matrix, result, i+1, j, n, m, 0);
                    find(matrix, result, i-1, j, n, m, 0);
                    find(matrix, result, i, j+1, n, m, 0);
                    find(matrix, result, i, j-1, n, m, 0);
                }
            }
        }

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}