// Name : Godwin Djossou
// Class : CIST 1400-004
// Colleagues : NAME/EMAIL OF ANYONE YOU WORKED WITH, INCLUDING TUTORS 
// Resources : SUFFICIENT INFORMATION AND CREDIT GIVEN TO ANY RESOURCES USED


import java.util.Random;
import java.util.Scanner;


public class NumberGuess
{
   public static void main(String[] args)
   {  
      System.out.println("Guess the numnber I'm thinking of!");

      Random rand = new Random();
      int x = rand.nextInt(100) + 1;
      Scanner input = new Scanner(System.in);
      int y = input.nextInt();
      do
      {
                  
         if (x > y)
         {
            System.out.println("Your guess of " + y + " is too low. Try again!"); 
            y = input.nextInt();  
         }
         else if (x < y)
         {
            System.out.println("Your guess of " + y + " is too high. Try again!");
            y = input.nextInt();
         }
             
      } while (y != x);
      System.out.println("You guessed " + y + " which was the number I was thinking of!");
       
   
   
   
   }
   
}