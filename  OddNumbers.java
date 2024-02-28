public class OddNumbers
 {
    public static void main(String[] args)
       {
        int count = 0;
        
        System.out.println("Odd numbers from 1 to 10:");

        for (int i = 1; i <= 10; i++) 
            {
            if (i % 2 != 0) 
                {
                System.out.print(i + " ");

                count++;
                }
            }
        
        System.out.println("\nTotal odd numbers: " + count);

        }
}
