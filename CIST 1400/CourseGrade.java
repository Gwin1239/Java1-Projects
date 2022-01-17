public class CourseGrade {

   private String courseName;
   private char letterGrade;
   
   public CourseGrade () {
      this.courseName = "N/A";
      this.letterGrade = 'X';
   }

   public CourseGrade ( String name, char grade ) {
      this.setCourseName( name );
      this.setLetterGrade( grade );
   }

   public String getCourseName() {
      return this.courseName;
   }
   
   public char getLetterGrade() {
      return this.letterGrade;
   }
   
   public void setCourseName( String name ) {
      if ( name.length() >= 5 ) {
         this.courseName = name;
      }
      else {
         this.courseName = "N/A";
      }
   }
   
   public void setLetterGrade (char g) {
      switch ( g ) {
         case 'A' : case 'B' : case 'C':
         case 'D' : case 'F' : case 'a':
         case 'b' : case 'c' : case 'd':
         case 'f' :
            this.letterGrade = g;
            break;
         default :
            this.letterGrade = 'X';
      
      }
   }
      
  @Override    
  public String toString() {
      return String.format("In %s, you have a grade of %c\n",
         this.getCourseName(), this.getLetterGrade() ); 
  }


   @Override
   public boolean equals ( Object o ) {
      boolean result = false;
      if ( o instanceof CourseGrade ) {
         CourseGrade other = (CourseGrade) o;
         if ( 
            this.getLetterGrade() == other.getLetterGrade()
            &&
            this.getCourseName().equals(other.getCourseName())
            ) {
               result = true;
            }
      }
      return result;
      
   }



}