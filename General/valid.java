//print all possible valid paranthesis pattern

import java.util.*;
public class valid
{
    static int c = 0;
    public static void find(int n, int m, String str)
    {
        if(n == 0 && m == 0)
        {
            System.out.println(str);
            c++;
            return;
        }
        if(m < n)
        {
            return;
        }
        if(m < 0 || n < 0)
        {
            return;
        }
        find(n-1, m, str + "(");
        find(n, m-1, str + ")");
    }
    @SuppressWarnings("resource")
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        find(n, n, "");
        System.out.println("Total number of valid strings: " + c);
    }
}