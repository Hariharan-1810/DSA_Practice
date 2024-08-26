import java.util.*;

public class rotten
{

    public static int find(int grid[][], int n, int m, Queue<ArrayList<Integer>> q, int time)
    {
        int cnt = q.size();

        while(!q.isEmpty())
        {
            ArrayList<Integer> temp = q.poll();
            int x = temp.get(0);
            int y = temp.get(1);

            if(x > 0 && grid[x-1][y] == 1)
            {
                grid[x-1][y] = 2;
                ArrayList<Integer> l = new ArrayList<>();
                l.add(x-1);
                l.add(y);
                q.add(l);
            }
            if(x < n-1 && grid[x+1][y] == 1)
            {
                grid[x+1][y] = 2;
                ArrayList<Integer> l = new ArrayList<>();
                l.add(x+1);
                l.add(y);
                q.add(l);
            }
            if(y > 0 && grid[x][y-1] == 1)
            {
                grid[x][y-1] = 2;
                ArrayList<Integer> l = new ArrayList<>();
                l.add(x);
                l.add(y-1);
                q.add(l);
            }
            if(y < m-1 && grid[x][y+1] == 1)
            {
                grid[x][y+1] = 2;
                ArrayList<Integer> l = new ArrayList<>();
                l.add(x);
                l.add(y+1);
                q.add(l);
            }
            cnt--;
            
            if(cnt == 0)
            {
                cnt = q.size();
                time++;
            }
        }
        return time;
    }

    public static int orangesRotting(int[][] grid)
    {
        int n = grid.length;
        int m = grid[0].length;

        Queue<ArrayList<Integer>> q = new LinkedList<>();

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(grid[i][j] == 2)
                {
                    ArrayList<Integer> l = new ArrayList<>();
                    l.add(i);
                    l.add(j);

                    q.add(l);
                }
            }
        }
        if(q.isEmpty())
        {
            return -1;
        }

        return find(grid, n ,m, q, -1);

    }

    public static void main(String[] args)
    {
        int grid[][] = {{1,2,1},{1,1,0},{2,1,2}};
        int n = grid.length;
        int m = grid[0].length;

        System.out.println(orangesRotting(grid));

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}

