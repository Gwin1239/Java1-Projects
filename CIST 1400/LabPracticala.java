import java.util.Scanner;

public class LabPracticala
{
   public static void main(String[] args)
  {
   Scanner one = new Scanner(System.in);
   System.out.println("VERSION: RHO");
   System.out.println("");
   System.out.println("Enter your first and last names: ");
  
   
   String firstname = one.next();
   String lastname = one.next();
   System.out.println("");
   
   System.out.println("Full Name: " +lastname.toLowerCase() + ", " +firstname.toLowerCase() );
   System.out.println("Initials: " +firstname.charAt(0) +"" +lastname.charAt(0) ); 
   System.out.println("");
  
  System.out.println("Enter first integer:");
  int a = one.nextInt();
   
  System.out.println("Enter second integer:");
  int b = one.nextInt();   
  System.out.println(""); 
   
  int sum = a + b; 
  System.out.printf("Sum: %d \n",sum);
   
  int product = a * b;
  System.out.printf("Product: %d \n",product); 
  
  double quotient = a / b;
  System.out.printf("Quotient: %1.1f \n",quotient);
   
  int remainder = a % b;
  System.out.printf("Remainder: %d \n",remainder); 
  
  double power = Math.pow(a,b);
  
  System.out.printf("Power: %1.1f", power);
   
   
   
   
   
   }
} 
   
   
   
   
   