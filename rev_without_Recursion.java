//How to reverse String without recursion

import java.util.Scanner;

public class rev_without_Recursion 
{
    public static String reverseString(String str)
    {
      if(str.isEmpty())
      {
         return str;
      }
      else
      {
         return reverseString(str.substring(1))+str.charAt(0);
      }
   }
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a String value: ");
      String str = sc.next();
      String result = rev_without_Recursion.reverseString(str);
      System.out.println(result);
   }
}