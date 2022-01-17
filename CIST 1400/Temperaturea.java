// Name : Godwin Djossou
// Class : CIST 1400-004
// Colleagues : NAME/EMAIL OF ANYONE YOU WORKED WITH, INCLUDING TUTORS
// Resources : SUFFICIENT INFORMATION AND CREDIT GIVEN TO ANY RESOURCES
//             BEYOND THOSE DIRECTLY PROVIDED BY YOUR INSTRUCTOR.

// The purpose of this program is to do some temperature calculations

public class Temperaturea 
{
   public static void main(String[] args)
   {
      //declare variables
      double celsiusValue;
      double fahrenheitValue;
      double kelvinValue;
      
      //declare constant variables
      final double celsiusToFahrenheit = 9.0 / 5.0;
      final double fahrenheitToKelvin = 5.0 / 9.0;
      final int fahrenheitBase = 32;
      final double kelvinBase = 273.15;
      
      //set up initial value
      celsiusValue = 24.33;
      
      //calculate farenheit equivalent
      fahrenheitValue = celsiusValue * celsiusToFahrenheit + fahrenheitBase;
      
      //perform output
      System.out.print(celsiusValue + " degrees Celsius is ");
      System.out.println(fahrenheitValue + " degrees Fahrenheit.");
      
      //calculate kelvin equivalent
      kelvinValue = (fahrenheitValue - fahrenheitBase) * fahrenheitToKelvin + kelvinBase;
      System.out.println("This is " + kelvinValue + " degrees Kelvin.");
      System.out.printf("This is %3.2f degrees Kelvin.", kelvinValue);
   
   
   
   
   
   }
}