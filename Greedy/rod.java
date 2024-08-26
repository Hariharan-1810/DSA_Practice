//maximum profit in rod

public class rod
{
    static int maxpri = 0;

    public static void find(int pri[], int i, int tot, int prize)
    {
        if(tot == 0)
        {
            if(prize > maxpri)
            {
                maxpri = prize;
            }
            return;
        }

        if(i == pri.length)
        {
            return;
        }

        if(tot < 0)
        {
            return;
        }

        find(pri, i+1, tot, prize);

        if (tot >= (i + 1))
        {
            find(pri, i, tot - (i + 1), prize + pri[i]);
        }
    }

    public static void main(String[] args)
    {
        int pri[] = {1, 5, 8, 9, 10, 17, 17, 20};

        int tot = 8;

        find(pri, 0, tot, 0);

        System.out.println("Maximum prize: "+maxpri);
    }
}