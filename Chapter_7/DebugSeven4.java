// Gets a String from user
// Converts the String to lowercase, and 
// displays the String's length
// as well as a count of letters
import java.util.*;
public class DebugSeven4
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      String aString;
      int numLetters = 0;
      int stringLength;

      System.out.println("Enter a String. Include");
      System.out.println("some uppercase letters, lowercase");
      System.out.print("letters, and numbers >> ");
      aString = kb.nextLine();

      stringLength = aString.length();

      System.out.print("In all lowercase, the String is: ");

      // FIX: loop should be < stringLength, not <=
      for(int i = 0; i < stringLength; i++)
      {
         // FIX: typo — missing dot before charAt
         char ch = Character.toLowerCase(aString.charAt(i));

         System.out.print(ch);

         // FIX: Condition was reversed — count only letters
         if(Character.isLetter(ch))
            numLetters++;
      }

      System.out.println();
      System.out.println("The number of CHARACTERS in the string is " + stringLength);

      // FIX: string was broken due to missing quote
      System.out.println("The number of LETTERS is " + numLetters);
   }
}
