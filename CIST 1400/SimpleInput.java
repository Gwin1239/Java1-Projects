// Name : Godwin Djossou
// Class : CIST 1400-004
// Colleagues : NAME/EMAIL OF ANYONE YOU WORKED WITH, INCLUDING TUTORS 
// Resources : SUFFICIENT INFORMATION AND CREDIT GIVEN TO ANY RESOURCES USED


import java.util.Scanner;
public class SimpleInput
{
   public static void main (String[] args)
   {
   Scanner input = new Scanner(System.in);
   System.out.println("What is your name?");
   String name = input.nextLine();
   System.out.println("Hello " + name + "\n");

   System.out.println("What year were you born?");
   int number1 = input.nextInt();
   System.out.println(number1);
   int age = 2019-number1;
   System.out.println(age);
   
   double life = 78.7;
   System.out.println(age/78.7*100 + "\n");
   
   System.out.println("What is the value of Pi?");
   double number2 = input.nextDouble();
   System.out.println(number2);
   System.out.println(22.0/7.0-number2);

   }
}