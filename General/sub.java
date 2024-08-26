//substring

import java.util.*;
public class sub
{
    public static void find(String a, String b)
    {
        if(a.length() == 0)
        {
            System.out.println(b);
            return;
        }

        char c = a.charAt(0);
        find(a.substring(1),b+c);
        find(a.substring(1),b);
    }
    public static void main(String args[])
    {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
    
    
        String a = s.nextLine();
        find(a,"");
    }
}
