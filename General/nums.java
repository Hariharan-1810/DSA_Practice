import java.util.*;

public class num
{
    public static void find(String s)
    {
        int n = s.length();
        
        if(n == 0 || s == null)
        {
            return;
        }

        ArrayList<String> ans = new ArrayList<String>();

        Map<Character, String> map = new HashMap<Character, String>();

        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        for(int i = 0; i < n; i++)
        {
            if(!map.containsKey(s.charAt(i)))
            {
                return;
            }
        }

        solve(s, 0, map, ans, new StringBuilder());

        for(int i = 0; i < ans.size(); i++)
        {
            System.out.println(ans.get(i));
            if(ans.get(i).equals("hariharan"))
            {
                break;
            }
        }
    }

    public static void solve(String s, int in, Map<Character, String> map, ArrayList<String> ans, StringBuilder sb)
    {
        if(in == s.length())
        {
            ans.add(sb.toString());
            return;
        }

        char c = s.charAt(in);
        String str = map.get(c);

        for(int i = 0; i < str.length(); i++)
        {
            sb.append(str.charAt(i));
            solve(s, in + 1, map, ans, sb);
            sb.deleteCharAt(sb.length() - 1); 
        }
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        find(s);
    }
}
