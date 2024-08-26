public class knap
{
    static int max = 0;
    public static void find(int val[], int wt[], int i, int cap, int sum)
    {
        if (i == val.length)
        {
            return;
        }

        if(cap-wt[i] < 0)
        {
            if(sum > max)
            {
                max = sum;
            }
            return;
        }

        find(val, wt, i+1, cap - wt[i], sum + val[i]);
        find(val, wt, i+1, cap, sum);
    }

    public static void main(String[] args)
    {
        int val[] = {100, 50, 30, 25, 15, 10};
        int wt[] = {10, 5, 2, 1, 1 ,2};

        int cap = 7;

        find(val, wt, 0, cap, 0);

        System.out.println(max);
    }
}
