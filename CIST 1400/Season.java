// Name : Godwin Djossou
// Class : CIST 1400-004
// Colleagues : NAME/EMAIL OF ANYONE YOU WORKED WITH, INCLUDING TUTORS 
// Resources : Canvas Document

public class Season {
   
   private String season;
   
   public Season() {
      this.season = "winter"; 
   }
   
   public String getSeason() {
      return this.season;
   }
   
   public void setSeason(String newSeason) {
      switch (newSeason.toLowerCase()) {
         case "spring" : case "summer" : case "fall" :
         case "winter" : case "autumn" :
            this.season = newSeason.toLowerCase();
            break;
         default :
            this.season = "winter";
      }       
   }
   
   @Override
   public String toString() {
      return this.season;
   }
   
   
   public boolean equals(Season other) {
      boolean no = false;
      if (season.equals(other.getSeason()))
      {
         return true;
      }
      else if ((season.equals("fall") && other.getSeason().equals("autumn")) 
         || 
         (season.equals("autumn") && other.getSeason().equals("fall")))
      {        
         return true;
      }
      return no; 
   
   }







}