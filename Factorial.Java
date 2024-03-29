import java.util.Scanner;

public class Factorial 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();

        scanner.close();

        if (n < 0) 
        {
            System.out.println("Please enter a non-negative integer.");
            return;
        }

        long factorial = 1;
        
        for (int i = 1; i <= n; i++) 
        {
            factorial *= i;
        }
        System.out.println("The factorial of " + n + " is: " + factorial);
    }
}