// Name : Godwin Djossou
// Class : CIST 1400-004
// Colleagues : NAME/EMAIL OF ANYONE YOU WORKED WITH, INCLUDING TUTORS 
// Resources : SUFFICIENT INFORMATION AND CREDIT GIVEN TO ANY RESOURCES USED

import java.util.Scanner;
public class Text_Metrics
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter the number of sentences in the sample: ");
      double number1 = input.nextDouble();
          
      System.out.println("Please enter the number of words in the sample: ");
      double number2 = input.nextDouble();
     
      System.out.println("Please enter the number of big words in the sample: ");
      double number3 = input.nextDouble();
          
      System.out.println("Please enter the number of syllables in the sample: ");
      double number4 = input.nextDouble();
      
      System.out.println("Please enter the number of characters in the sample: ");
      double number5 = input.nextDouble();
          
      double Gunning = number2/number1 + 100*number3/number2;    
      System.out.printf("Gunning Fox Index: %2.4f \n", Gunning*0.4);    

      double Flesch = 206.835-1.015*number2/number1-84.6*number4/number2;
      System.out.printf("Reading Ease Score: %2.4f \n", Flesch);
      
      double Square = Math.sqrt(number3);
      double Round = Math.round(Square/10.0)*10;
      double Digit = Round/10;
      double Final = Digit + 3;
      System.out.printf("SMOG Index Grade Level: %1.0f \n",Final);
      
      double Automated = 4.71 * (number5/number2) + 0.5 * (number2/number1) - 21.43;
      System.out.printf("Automated Readability Index: %2.4f \n",Automated);
      
     
      

 
   }
}