//print unique in string

import java.util.*;
public class st
{
    static String st = "";
    static boolean hash[] = new boolean[26];
    public static void find(String str, int index)
    {
        if(index == str.length())
        {
            return;
        }

        char c = str.charAt(index);
        if(hash[c - 'a'] == false)
        {
            st += c;
            hash[c - 'a'] = true;
        }
        find(str, index+1);
    }
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        find(str,0);
        System.out.println(st);
    }
}
