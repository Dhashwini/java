import java.util.Scanner;

public class SecondLastDigit 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        scanner.close();

        number /= 10;

        int secondLastDigit = Math.abs(number) % 10; 
        
        System.out.println("The second last digit of the number is: " + secondLastDigit);
    }
}