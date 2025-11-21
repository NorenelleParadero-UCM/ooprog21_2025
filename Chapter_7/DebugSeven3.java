// Program accepts a String and displays some facts
import java.util.*;
public class DebugSeven3
{
   public static void main(String[] args)
   { 
      Scanner kb = new Scanner(System.in);
      String quote, charString;
      char searchChar;

      System.out.print("Enter a famous quote >> ");
      quote = kb.nextLine();  
      // FIX: Should use kb.nextLine(), not nextLine() alone

      System.out.print("Enter a character to search for >> ");
      charString = kb.nextLine();  
      // FIX: nextInt() was wrong; we need a string input

      searchChar = charString.charAt(0);  
      // FIX: charAt(0) gets the first character of the input

      System.out.println("indexOf('" + searchChar + "') is: " +
         quote.indexOf(searchChar));  
      // FIX: missing parenthesis

      System.out.println("indexOf('a') is: " + quote.indexOf('a'));  
      // FIX: wrong syntax quote.indexOf'a'

      System.out.println("indexOf('x') is: " + quote.indexOf('x'));

      System.out.println("charAt(5) is: " + quote.charAt(5));

      System.out.println("replace('e', '*') is: " +
         quote.replace('e', '*'));  
      // FIX: wrong spelling repplace → replace
   }
}
