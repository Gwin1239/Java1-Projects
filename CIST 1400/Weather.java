// Name : Godwin Djossou
// Class : CIST 1400-004
// Colleagues : NAME/EMAIL OF ANYONE YOU WORKED WITH, INCLUDING TUTORS 
// Resources : Canvas Document

public class Weather {

   private Temperature temp;
   private int humidity;
   private int windspeed;
   private Season s;
   
   public Weather() {
      this.temp = new Temperature();
      this.humidity = 50;
      this.windspeed = 0;
      this.s = new Season();
   }
   
   public Weather(double t, char sc, String whichSeason) {
      this.temp = new Temperature(t, sc);
      this.humidity = 50;
      this.windspeed = 0;
      this.s = new Season();
      if (whichSeason.toLowerCase().equals("spring"))
      {
         s.setSeason(whichSeason);
      }
      if (whichSeason.toLowerCase().equals("summer"))
      {
         s.setSeason(whichSeason);
      }
      if (whichSeason.toLowerCase().equals("fall"))
      {
         s.setSeason(whichSeason);
      }
      if (whichSeason.toLowerCase().equals("winter"))
      {
         s.setSeason(whichSeason);
      }
      if (whichSeason.toLowerCase().equals("autumn"))
      {
         s.setSeason(whichSeason);
      }
      
   }
   
   public Season getSeason() {
      return s;
   }
   
   public void setSeason(Season newSeason) {
      if (newSeason != null)
      {
         String two;
         two = newSeason.getSeason();
         this.s.setSeason(two);
      }  
         
      
   }
   
   public Temperature getTemp() {
      return temp;
   }
   
   public int getHumidity() {
      return humidity;
   }
   
   public int getWindSp() {
      return windspeed;
   }
   
   public void setTemperature(Temperature t) {
      this.temp = t;
   }
   
   public void setHumidity(int h) {
      if (h >= 0 && h <= 100)
      {
         this.humidity = h;
      }
   }
   
   public void setWindSp(int sp) {
      if (sp >= 0)
      {
         this.windspeed = sp;
      }   
   }
   
   @Override
   public String toString() {
      return String.format("The weather is currently %s with %d%% humidity and a %d mph wind", 
      temp.toString(), this.getHumidity(), this.getWindSp());
   }
   
   @Override
   public boolean equals(Object other) {
      boolean result = false;
      if (other instanceof Weather)
      {
         Weather two = (Weather) other;
         if (this.getTemp().equals(two.getTemp())
            &&
            this.getHumidity() == two.getHumidity()
         )
         {
            result = true;
         }
        
      }
      return result;
    
   }
   






}