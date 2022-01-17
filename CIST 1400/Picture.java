// Name : Godwin Djossou
// Class : CIST 1400-004
// Colleagues : NAME/EMAIL OF ANYONE YOU WORKED WITH, INCLUDING TUTORS 
// Resources : Canvas Document

public class Picture {
   
   private int size;
   private String format;
   private boolean color;

   public Picture () {
      this.size = 0;
      this.format = "none";
      this.color = true;
   }

   public Picture ( int a, String b, boolean c ) {
      this.setSize( a );
      this.setFormat( b );
      this.setColor( c );
   }   
   
   public int getSize() {
      return this.size;
   }
   
   public String getFormat() {
      return this.format;
   }
   
   public boolean getColor() {
      return this.color;
   }
   
   
   
   public void setSize( int a ) {
      if ( a >= 0 ) {
         this.size = a;
      }
   }
   
   public void setFormat( String b ) {
      switch ( b.toLowerCase() ) {
         case "bmp" : case "jpeg" : case "tiff":
         case "png" : case "gif" :
            this.format = b.toLowerCase();
            break;
         default :
            this.format = "none";
      }
   }
   
   public void setColor( boolean c ) {
      this.color = c;
      
   }
   
   
  @Override
   public String toString() {
      String result;
      String s = "black and white";
      if (this.color) {
         s = "color";
      }  
     return String.format("Picture is %s, %d kb big, and in %s format",
        s, this.getSize(), this.getFormat() );
   
   }
   
   @Override
   public boolean equals ( Object o ) {
      boolean result = false;
      if ( o instanceof Picture ) {
         Picture other = (Picture) o;
         if (
            this.getSize() == other.getSize()
            &&
            this.getColor() == other.getColor()
            &&
            this.getFormat().equals(other.getFormat())
            ) {
               result = true;
            }  
      }
      return result;  
   }
   
   
   
 
}