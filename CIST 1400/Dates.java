// Name : Godwin Djossou
// Class : CIST 1400-004
// Colleagues : NAME/EMAIL OF ANYONE YOU WORKED WITH, INCLUDING TUTORS 
// Resources : SUFFICIENT INFORMATION AND CREDIT GIVEN TO ANY RESOURCES USED


import java.util.Random;

public class Dates 
{ 
   public static void main (String[] args)
   {
      SimpleDate sd1 = new SimpleDate();
      System.out.println(sd1);
      
      SimpleDate birthday = new SimpleDate(6,18,2001);
      System.out.println(birthday);
      
      
      Random month = new Random();
      int month1 = 1 + month.nextInt(12);
  
  
      
      Random day = new Random();
      int day1 = 1 + day.nextInt(28);
      
      Random year = new Random();
      int year1 = 1800 + year.nextInt(401);
  
      System.out.println(month1 + " " + day1 + " " + year1);  
  
      SimpleDate sd2 = new SimpleDate(month1,day1,year1);
      System.out.println(sd2);
      
      int nextDay = day1 + 1;
      
      SimpleDate sd3 = new SimpleDate(month1,nextDay,year1);
      System.out.println(sd3);
      
      int moreDays = nextDay + 3;
      SimpleDate sd4 = new SimpleDate(month1,moreDays,year1);
      System.out.println(sd4); 
      
     int month2 = sd4.getMonth();
     int day2 = sd4.getDay();
     int year2 = sd4.getYear();
     
     System.out.println(day2 + "-" + month2 + "-" + year2);
    
  
    }

}