public class EvenNumbers 
{
    public static void main(String[] args) 
    {
        int count = 0;
        
        System.out.println("Even numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++)
        {
            if (i % 2 == 0) 
            {
                System.out.print(i + " ");
                count++;
            }
        }
        
        System.out.println("\nTotal even numbers: " + count);
    }
}