public class CharacterToString
{
    public static void main(String[] args) 
    {
       
        char ch = 'a';
        
        String str1 = Character.toString(ch);
        System.out.println("Using Character.toString(): " + str1);
        
        
        String str2 = "" + ch;
        System.out.println("Using concatenation with empty string: " + str2);
    }
}