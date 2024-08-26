import java.util.*;

public class closepath
{
    static String minpath;
    static int min = Integer.MAX_VALUE;
    
    public static void find(int tr, int tc, int cr, int cc, int trr, int trc, boolean maze[][], int c, String ans)
    {
        if (cr < 0 || cr >= tr || cc < 0 || cc >= tc)
        {
            return;
        }

        if (maze[cr][cc] == true)
        {
            return;
        }

        if(cr == trr && cc == trc)
        {
            if(min > c)
            {
                min = c;
                minpath = ans;
            }
            return;
        }
        maze[cr][cc] = true;

        find(tr, tc, cr + 1, cc, trr, trc, maze, c + 1, ans + "DOWN ");
        find(tr, tc, cr - 1, cc, trr, trc, maze, c + 1, ans + "TOP ");
        find(tr, tc, cr, cc + 1, trr, trc, maze, c + 1, ans + "RIGHT ");
        find(tr, tc, cr, cc - 1, trr, trc, maze, c + 1, ans + "LEFT ");

        maze[cr][cc] = false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        
        System.out.println("ENTER THE TOTAL ROW AND COLUMN OF THE MAZE  : ");
        System.out.println();
        System.out.print("\t");
        int tr = sc.nextInt();
        int tc = sc.nextInt();
        System.out.println();

        System.out.println("ENTER THE CURRENT ROW AND COLUMN [ STARING POSITION ] OF THE MAZE : ");
        System.out.println();
        System.out.print("\t");
        int cr = sc.nextInt();
        int cc = sc.nextInt();
        System.out.println();

        System.out.println("ENTER THE TARGET ROW AND COLUMN [ FINAL POSITION ] OF THE MAZE : ");
        System.out.println();
        System.out.print("\t");
        int trr = sc.nextInt();
        int trc = sc.nextInt();
        System.out.println();

        if(cr < 0 || cr > tr || cc < 0 || cc > tc || trr < 0 || trr > tr || trc < 0 || trc > tc )
        {
            System.out.println("POSITION IS OUT OF MAZE");
            System.out.println();
        }
        else
        {
            boolean maze[][] = new boolean[tr][tc];

            find(tr, tc, cr - 1, cc - 1, trr - 1, trc - 1, maze, 0, "");

            if(minpath == null)
            {
                System.out.println("NO PATH IS FOUND");
            }
            else
            {
                System.out.println("MINIMUM PATH TO REACH TARGET POSITION IS : ");
                System.out.println();
                System.out.println("\t"+minpath);
            }
            System.out.println();
        }
        sc.close();
    }
}

