// Program prompts user to enter a series of integers
// separated by spaces
// Program converts them to numbers and sums them

import java.util.*;

public class DebugSeven2
{
   public static void main(String[] args)
   {
      String str;
      int x;
      int length;
      int lastSpace = -1;
      int sum = 0;
      String partStr;
      Scanner in = new Scanner(System.in);

      System.out.print("Enter a series of integers separated by spaces >> ");
      str = in.nextLine();

      length = str.length();               //replaced str.len() with str.length()

      for(x = 0; x < length; ++x)          //changed len to length
      {
         if(str.charAt(x) == ' ')
         {
            partStr = str.substring(lastSpace + 1, x);
            int num = Integer.parseInt(partStr);  //ensuring partStr is used correctly

            System.out.println(" " + num);
            sum += num;                    //correctly adds number to sum
            lastSpace = x;
         }
      }

      partStr = str.substring(lastSpace + 1, length);
      int num = Integer.parseInt(partStr);      //parStr to partStr

      System.out.println(" " + num);
      sum += num;                               //changed sum = num to sum += num

      System.out.println("-------------------" +
         "\nThe sum of the integers is " + sum);
   }
}
