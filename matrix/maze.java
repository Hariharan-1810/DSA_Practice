import java.util.*;

public class maze
{
    static ArrayList<String> path = new ArrayList<>();
    public static void find(int row, int col, int i, int j, String ans)
    {
        if(i >= row || j >= col)
        {
            return;
        }
        if(i == row-1 && j == col-1)
        {
            path.add(ans);
            return;
        }
        find(row, col, i, j+1, ans + "H ");
        find(row, col, i+1, j, ans + "V ");
        find(row, col, i+1, j+1, ans + "D ");
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        find(row, col, 0, 0, "");

        int n = path.size();
        
        for(int i = 0; i < n; i++)
        {
            System.out.println(path.get(i));
        }
        
        System.out.println("Total paths: " + n);
        sc.close();
    }
}
