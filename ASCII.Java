public class ASCII
{
    public static void main(String[] args) 
    {
        System.out.println("ASCII values from A to Z:");
        for (char c = 'A'; c <= 'Z'; c++) 
        {
            int asciiValue = (int) c;
            System.out.println(c + " -> " + asciiValue);
        }
    }
}