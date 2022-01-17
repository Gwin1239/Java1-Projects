// Name : Godwin Djossou
// Class : CIST 1400-004
// Colleagues : NAME/EMAIL OF ANYONE YOU WORKED WITH, INCLUDING TUTORS 
// Resources : Lab Sheet

import java.util.Scanner;

public class FizzBuzz
{
   public static void main(String[] args) {
   
      Scanner one = new Scanner(System.in);
      System.out.println("FizzBuzz");
      System.out.println("Enter a non-negative number: ");
      int x = one.nextInt();
      int y = 0;
      while (y < x) 
      {  
         ++y;
         if (y % 3 == 0 && y % 5 == 0)
         {
            System.out.println("FizzBuzz");
         }
         else if (y % 3 == 0)
         {
            System.out.println("Fizz");
         }
         else if (y % 5 == 0)
         {
            System.out.println("Buzz");
         }
         else 
         {
            System.out.println(y);
         }
         
           
      
      }
      
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   }
}