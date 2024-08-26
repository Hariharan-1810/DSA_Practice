//longest substring

public class sub
{
    static String ans = "";
    static int max = 0;

    public static void find(String res, String b)
    {
        int i = 0;
        int j = 0;

        while(i < res.length() && j < b.length())
        {
            if(res.charAt(i) == b.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                j++;
            }
        }

        if(i == res.length())
        {
            if(max < res.length())
            {
                max = res.length();
                ans = res;
            }
        }
    }

    public static void longsub(String a, String res, String b)
    {
        if(a.length() == 0)
        {
            find(res, b);
            return;
        }

        
        char c = a.charAt(0);

        longsub(a.substring(1), res+c, b);
        longsub(a.substring(1), res, b);
    }

    public static void main(String[] args) 
    {
        String a = "abcd";
        String b = "agcfd";

        longsub(a, "", b);

        System.out.println(ans);
    }
}
