// Name : Godwin Djossou
// Class : CIST 1400-004
// Colleagues : Used Piazza, CSLC
// Resources : Canvas Document

import java.util.Scanner;
public class Forecaster
{
   public static void main(String[] args)
   {  
   
     
      String season;
      double degrees;
      char scale;
      boolean five;
      int humidity;
      int windSpeed;
      int choose;
      Weather uno = new Weather();
      Temperature four = new Temperature();
      Scanner input = new Scanner(System.in);
      
      do
      {
         System.out.println("Welcome to the Weather Forecaster.");
         System.out.println("1. Set temperature preference");
         System.out.println("2. Set season");
         System.out.println("3. Set weather");
         System.out.println("4. Get forecast");
         System.out.println("5. Print the weather");
         System.out.println("6. Quit");

      
         System.out.println("Enter choice: ");
         choose = input.nextInt();
         input.nextLine();
      
         if (choose == 1)
         {
            System.out.println("Enter temperature preference (C/F): ");
            scale = input.nextLine().charAt(0);
            while ((scale != 'F') && (scale != 'C'))
            {
               System.out.println("Invalid choice.");
               System.out.println("Enter temperature preference (C/F): ");
               scale = input.nextLine().charAt(0);
               input.nextLine();
            } 
            uno.getTemp().setScale(scale);     
         }
         else if (choose == 2)
         {
            System.out.println("Enter season: ");
            season = input.nextLine();
            while (!season.toLowerCase().equals("summer") 
                  && 
                  !season.toLowerCase().equals("winter")
                  &&
                  !season.toLowerCase().equals("autumn")
                  &&
                  !season.toLowerCase().equals("fall")
                  &&
                  !season.toLowerCase().equals("spring"))
            {
               System.out.println("Invalid season. Season can be spring, summer, winter, autumn or fall");     
               System.out.println("Enter season: ");
               season = input.nextLine();
            } 
            Season six = new Season();
            six.setSeason(season);
            uno.setSeason(six);  
         }
      
         else if (choose == 3)
         {
            /*do
            {  
               five = false;
               System.out.println("Enter temperature: ");
               degrees = input.nextDouble();
               System.out.println("Enter humidity: ");
               humidity = input.nextInt();
               System.out.println("Enter Wind Speed: ");
               windSpeed = input.nextInt();
               if (!(windSpeed >= 0 && humidity >= 0 && humidity <= 100
                  && (degrees >= -50 && degrees <= 150 && four.getScale() == 'F')
                  || (degrees >= -45.556 && degrees <= 65.556 && four.getScale() == 'C')))
               {
                  five = true;
               }  
            
         
            }while(five);
            uno.getTemp().setTemp(degrees);
            uno.setHumidity(humidity);
            uno.setWindSp(windSpeed); 
         
            Did this code as a basis to do code below
            */
         
            five = false;
            System.out.println("Enter temperature: ");
            degrees = input.nextDouble();
            System.out.println("Enter humidity: ");
            humidity = input.nextInt();
            System.out.println("Enter Wind Speed: ");
            windSpeed = input.nextInt();
            while (!five)
            {
               if (uno.getTemp().getScale() == 'C')
               {
                  double faren = ((degrees * 9) / 5) + 32;
                  if (faren >= -50 && faren <= 150 && humidity >= 0 && humidity <= 100 && windSpeed >= 0)
                  {
                     break;
                  }
               }
               else
               {
                  if (degrees >= -50 && degrees <= 150 && humidity >= 0 && humidity <= 100 && windSpeed >= 0)
                  {
                     break;
                  }
               }
               System.out.println("Invalid entry, try again.");
               System.out.println("Enter temperature: ");
               degrees = input.nextDouble();
               System.out.println("Enter humidity: ");
               humidity = input.nextInt();
               System.out.println("Enter Wind Speed: ");
               windSpeed = input.nextInt();
            }
            uno.getTemp().setTemp(degrees);
            uno.setHumidity(humidity);
            uno.setWindSp(windSpeed);

         
         }
      
         else if (choose == 4)
         {
            double faren;
            double celc;
         
            if (uno.getTemp().getScale() == 'F')
            {
               faren = uno.getTemp().getTemp();
               celc = ((uno.getTemp().getTemp() - 32) * 5) / 9;
            }
            else
            {
               faren = ((uno.getTemp().getTemp() * 9) / 5) + 32;
               celc = uno.getTemp().getTemp();
            }
         
            if (uno.getSeason().getSeason().equals("winter"))
            {
               if (faren < 10 && uno.getWindSp() > 15)
               {
                  System.out.println("The forecast is frigid");
               }
               else if (faren >= 10 && faren <= 30 && uno.getHumidity() >= 80)
               {
                  System.out.println("The forecast is snow");
               }
               else if (faren >= 28 && faren <= 33 && uno.getHumidity() >= 60 && uno.getHumidity() <= 80)
               {
                  System.out.println("The forecast is icy");
               }
               else if (faren > 40)
               {
                  System.out.println("The forecast is warm");
               }
               else
               {
                  System.out.println("The forecast is cold");
               }
            }
            else if (uno.getSeason().getSeason().equals("summer"))
            {
               if (celc >= 32 && uno.getWindSp() < 10 && uno.getHumidity() >= 70)
               {
                  System.out.println("The forecast is steamy");   
               }
               else if (celc >= 32 && uno.getWindSp() >= 20 && uno.getHumidity() >= 70)
               {
                  System.out.println("The forecast is stormy");
               }
               else if (celc >= 30 && uno.getHumidity() < 50)
               {
                  System.out.println("The forecast is dry heat");
               }
               else if (celc >= 30 && celc < 32 && uno.getWindSp() >= 20)
               {
                  System.out.println("The forecast is hot and windy");
               }
               else if (celc >= 30)
               {
                  System.out.println("The forecast is hot");
               }
               else
               {
                  System.out.println("The forecast is warm");
               }
            }
            else if (uno.getSeason().getSeason().equals("spring"))
            {
               if (faren > 65 && faren <= 80 && uno.getWindSp() >= 20 && uno.getHumidity() >= 80)
               {
                  System.out.println("The forecast is stormy");
               }
               else if (faren < 50)
               {
                  System.out.println("The forecast is chilly");
               }
               else if (uno.getHumidity() < 80 && uno.getWindSp() >= 20)
               {
                  System.out.println("The forecast is windy");
               }
               else
               {
                  System.out.println("The forecast is pleasant");
               }
            }
            else
            {
               if (faren >= 65 && faren < 80 && uno.getWindSp() < 15 && uno.getHumidity() <= 60)
               {
                  System.out.println("The forecast is nice");
               }
               else if (faren >= 80)
               {
                  System.out.println("The forecast is too warm");
               }
               else if (faren >= 40 && faren < 65 && uno.getWindSp() > 15)
               {
                  System.out.println("The forecast is chilly");
               }
               else if (uno.getHumidity() >= 80)
               {
                  System.out.println("The forecast is rainy");
               }
               else
               {
                  System.out.println("The forecast is typical");
               }
            }
       
         }
      
         else if (choose == 5)
         {
            System.out.println(uno);
         }
      
         else if (choose < 1 || choose > 6)
         {
            System.out.println("Invalid selection.");
         }
 
      
      
      } while (choose != 6);
   
      
      input.close();
   
   
   
   
   
   
   }
   
}
