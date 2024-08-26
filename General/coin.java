import java.util.*;
public class coin
{
    static int c = 0;
    public static void find(int coins[], int n, int tot, int sum, String ans)
    {
        if(sum == tot)
        {
            System.out.println(ans);
            c++;
            return;
        }
        if(sum > tot)
        {
            return;
        }
        for(int i = 0; i < n; i++)
        {
            find(coins, n, tot, sum + coins[i], ans + coins[i] + " ");
        }

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int coins[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            coins[i] = sc.nextInt();
        }
        int tot = sc.nextInt();
        
        find(coins, n, tot, 0, "");
        System.out.println("Total number of combinations: " + c);

        sc.close();
    }
}
