package OnNumber;

import java.util.*;   
class PalindromNoUserInput
{  
   public static void main(String args[])  
   {  
      String original, reverse = " " ; // Objects of String class  
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a string/number to check if it is a palindrome");  
      original = in.nextLine();   
      int length = original.length();  
      System.out.println("Length of Original:" + length);
      
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      System.out.println("Reverse :" +reverse);
      if (original.equals(reverse))  
         System.out.println("Entered string/number is a palindrome.");  
      else  
         System.out.println("Entered string/number isn't a palindrome.");   
   }  
}  