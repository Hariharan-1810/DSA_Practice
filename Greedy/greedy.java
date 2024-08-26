public class greedy
{
    public static void main(String[] args)
    {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        int n = start.length;
        int cnt = 1;

        int endtime = end[0];

        for(int i = 1; i < n; i++)
        {
            if(start[i] >= endtime)
            {
                cnt++;
                endtime = end[i];
            }
        }
        System.out.println(cnt);
    }
}