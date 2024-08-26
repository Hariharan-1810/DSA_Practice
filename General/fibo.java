public class fibo
{
    static long ans[] = new long[101];
    public static long find(int n)
    {
        if(n == 1 || n == 0)
        {
            ans[n] = n;
            return n;
        }
        long num1;
        long num2;

        if(ans[n-1] == 0)
        {
            num1 = find(n-1);
        }
        else
        {
            num1 = ans[n-1];
        }

        if(ans[n-2] == 0)
        {
            num2 = find(n-2);
        }
        else
        {
            num2 = ans[n-2];
        }

        ans[n] = num1+num2;
        return ans[n];
    }

    public static void main(String args[])
    {
        int n = 100;

        System.out.println(find(n));
    }
}