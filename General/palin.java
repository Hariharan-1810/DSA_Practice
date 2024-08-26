import java.util.*;

public class palin
{
    public static boolean isPalindrome(String str, int start, int end)
    {
        if (start >= end)
            return true;
            
        if (str.charAt(start)!= str.charAt(end))
        {
            return false;
        }
        
        return isPalindrome(str, start + 1, end - 1);
    }
    public static void main(String args[])
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        boolean result = isPalindrome(str, 0, str.length() - 1);
        
        if (result)
        {
            System.out.println("The string is a palindrome.");
        }
        else
        {
            System.out.println("The string is not a palindrome.");
        }
    }   
}
