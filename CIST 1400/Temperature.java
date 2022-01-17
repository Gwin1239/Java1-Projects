// Name : Godwin Djossou
// Class : CIST 1400-004
// Colleagues : NAME/EMAIL OF ANYONE YOU WORKED WITH, INCLUDING TUTORS 
// Resources : Canvas Document

public class Temperature {

   private double degrees;
   private char scale;
   
   public Temperature() {
      this.degrees = 0.0;
      this.scale = 'C';
   }
   
   public Temperature(double temp, char sc) {
      switch (sc) {
         case 'C' : case 'c' :
            this.scale = 'C';
            break;
         case 'F' : case 'f' :
            this.scale = 'F';   
            break;
         default :
            this.scale = 'C';
      }
      if (sc == 'c' || sc == 'C') 
      {
         double convert = ((temp * 9) / 5) + 32;
         if (convert >= -50 && convert <= 150) 
         {
            this.degrees = temp;
         }
      
      } 
      if (sc == 'f' || sc == 'F') 
      {
         if (temp >= -50 && temp <= 150) 
         {
            this.degrees = temp;
         }
         else
         {
            this.scale = 'C';
         }
      }
            
   }
   
   public double getTemp() {
      return this.degrees;
   }
   
   public char getScale() {
      return this.scale;
   }

   public void set(double temp, char sc) {
      switch (sc) {
         case 'C' : case 'c' :
            this.scale = 'C';
            break;
         case 'F' : case 'f' :
            this.scale = 'F';   
            break;
         default :
            this.scale = 'C';
      }
      if (sc == 'c' || sc == 'C') 
      {
         double convert = ((temp * 9) / 5) + 32;
         if (convert >= -50 && convert <= 150) 
         {
            this.degrees = temp;
         }
      
      } 
      if (sc == 'f' || sc == 'F') 
      {
         if (temp >= -50 && temp <= 150) 
         {
            this.degrees = temp;
         }
      }
   }
   
   public void setTemp(double temp) {
      if (this.getScale() == 'c' || this.getScale() == 'C') 
      {
         double convert = ((temp * 9) / 5) + 32;
         if (convert >= -50 && convert <= 150) 
         {
            this.degrees = temp;
         }
      
      } 
      if (this.getScale() == 'f' || this.getScale() == 'F') 
      {
         if (temp >= -50 && temp <= 150) 
         {
            this.degrees = temp;
         }
      
      }
   }
   
   public void setScale(char sc) {
      if (scale == 'F' || scale == 'f') 
      {
         if (sc == 'C' || sc == 'c') 
         {
            this.degrees = ((degrees - 32) * 5) / 9;
            this.scale = 'C';
         }
      }
      if (scale == 'C' || scale == 'c')
      {
         if (sc == 'F' || sc == 'f')
         {
            this.degrees = ((degrees * 9) / 5) + 32;
            this.scale = 'F';
         }
      
      }
   }
   
   @Override
   public String toString() {
      return String.format("%.1f degrees %c", this.getTemp(), this.getScale());
   }

   public boolean equals(Temperature other) {
      boolean result = false;
      double first;
      double second;
      if (other instanceof Temperature)
      {
         Temperature two = (Temperature) other;
         if (this.scale == 'F')
         {
            first = degrees;
         }
         else
         {
            first = ((degrees * 9) / 5) + 32;
         }
         if (two.getScale() == 'F')
         {
            second = two.getTemp();
         }
         else
         {
            second = ((two.getTemp() * 9) / 5) + 32;
         }
         if (Math.abs(first - second) <= 0.001)
         {
            result = true;
         }
      
      }
      return result;
    
    
    
    
    
     
   
   }




}