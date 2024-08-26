import java.util.*;
public class box2
{
    static int cn = 0;
    public static void find(int a[][], int n, int i, int j, int q, int tq)
    {
        if(q == tq)
        {
            cn++;
            System.out.println(cn);
            for(int k = 0; k < n; k++)
            {
                for(int l = 0; l < n; l++)
                {
                    System.out.print(a[k][l] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        if(j >= n)
        {
            i = i + 1;
            j = 0;
        }
        if(i >= n)
        {
            return;
        }
        if(a[i][j] == 0)
        {
            
            a[i][j] = 1;
            find(a, n, i, j+1, q + 1, tq);
            a[i][j] = 0;
        }
        find(a, n, i, j+1, q, tq);
        
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[][] = new int[n][n];
        int tq = s.nextInt();

        find(a, n, 0, 0, 0, tq);
    }
}