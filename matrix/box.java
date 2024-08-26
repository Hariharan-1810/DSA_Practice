import java.util.*;
public class box
{
    static int cn = 0;
    public static void find(int a[], int n, int in, int p, int tq)
    {
        if(p >= tq)
        {
            for(int i=0; i<n; i++)
            {
                if(a[i] == 1)
                {
                    System.out.print("q ");
                }
                else
                {
                    System.out.print("_ ");
                }
            }
            cn = cn + 1;
            System.out.println();
            return;
        }
        if(in >= n)
        {
            return;
        }
        if(a[in] == 0)
        {
            a[in] = 1;
            find(a, n, in + 1, p + 1, tq);
            a[in] = 0;
        }
        
        find(a, n, in + 1, p, tq);
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int a[] = new int[n];

        int tq = s.nextInt();

        find(a, n, 0, 0, tq);
        System.out.println("Total number of combinations: " + cn);
        s.close();
    }    
}

