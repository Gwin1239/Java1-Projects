//  CIST 1400
//  Lab Practical Starter Code
//  Starter Code
//  Name:  Godwin Djossou
//  You should copy this code and rename the class for the specific problem.

import java.util.Scanner;

public class Maximum
{
   public static void main (String [] args)
   {
      System.out.println("VERSION: BETA");
      System.out.println("");
      Scanner one = new Scanner(System.in);
      int a;
      int small = 0;
      int max = 0;
      
      
      
        
          
         
         System.out.println("Enter a value, 1 to quit: ");
         a = one.nextInt();
         
         if (a != 1)
         {
         max = a;
         
         }
         
         while (a != 1)
         {
        
            if (a != 1 && a > max)
            {
               max = a;
            }
            
            
            System.out.println("Enter a value, 1 to quit: ");
            a = one.nextInt();
         }
         
      
      
      
      System.out.println("Maximum: " + max);
   
   
   
   
   }
}