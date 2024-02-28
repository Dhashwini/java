import java.util.Scanner;

public class FactorCount 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        scanner.close();

        int factorCount = 0;
        for (int i = 1; i <= number; i++) 
        {
            if (number % i == 0) 
            {
                factorCount++;
            }
        }

        System.out.println("The number of factors of " + number + " is: " + factorCount);
    }
}