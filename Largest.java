import java.util.Scanner;
public class Largest

{
  public static void main(String[] args)

  {
    
      int a, b, c, temp, largest;
      Scanner sc=new Scanner(System.in);

      System.out.print(" Enter the first number:");
      a = sc.nextInt();
  	
      System.out.print(" Enter the second number:");
      b = sc.nextInt();

      System.out.print(" Enter the third number:");
      c = sc.nextInt();
       
      temp = a>b?a:b;
      largest = c>temp?c:temp;

      System.out.print(" largest number is" + largest);
  
  }

}