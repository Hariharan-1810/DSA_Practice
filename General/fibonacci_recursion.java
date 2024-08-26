import java.util.*;
public class fibonacci_recursion
{
    public static int fibonacci(int n)
    {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int n = scanner.nextInt();
        System.out.println("Fibonacci sequence:");
        for (int i = 0; i < n; i++)
        {
            System.out.print(fibonacci(i) + " ");
        }
        scanner.close();
    }
}
