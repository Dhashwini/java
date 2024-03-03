public class StringToCharacters 
{
    public static void main(String[] args)
    {
        
        String str = "hello";
        
        System.out.println("Original string: " + str);
        System.out.println("Characters in the string:");
        
        
        for (int i = 0; i < str.length(); i++) 
        {
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }
}
