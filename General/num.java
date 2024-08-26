//digit to string number

import java.util.*;
public class num
{
    static String val[] = {"Zero ", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine "};
    public static void find(int n)
    {
        if(n <= 0)
        {
            return;
        }

        find(n / 10);
        int m = n % 10;

        System.out.print(val[m]);
    }
    @SuppressWarnings("resource")
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        find(n);
    }
}
