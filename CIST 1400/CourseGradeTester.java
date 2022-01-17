public class CourseGradeTester {
   public static void main(String[] args) {
   
      CourseGrade foo = new CourseGrade();
      
      System.out.println(foo.getCourseName());
      System.out.println(foo.getLetterGrade());
   
      foo.setCourseName("CIST 1400 - Intro to CS1");
      System.out.println(foo.getCourseName());
      foo.setCourseName("CS1");
      System.out.println(foo.getCourseName());

      foo.setLetterGrade('A');
      System.out.println(foo.getLetterGrade());
      foo.setLetterGrade('&');
      System.out.println(foo.getLetterGrade());

      System.out.println(foo);
      
      CourseGrade bar = new CourseGrade("CIST 1400 - CS1", 'A');
      CourseGrade zoo = new CourseGrade("CIST 1400 - CS1", 'A');
      System.out.println(bar);
      
      if (bar.equals(bar) ) {
         System.out.printf( "%s is equal to itself\n", bar.getCourseName() );
      }
      if (foo.equals(bar) ) {
         System.out.println ( foo.getCourseName() + " is equal to " +
            bar.getCourseName() );
            
      }
      else {
         System.out.println ( foo.getCourseName() + " is not equal to " +
            bar.getCourseName() );
      }
      
      
      
      if (bar.equals(zoo) ) {
         System.out.println ( bar.getCourseName() + " is equal to " +
            zoo.getCourseName() );
            
      }
      else {
         System.out.println ( bar.getCourseName() + " is not equal to " +
            zoo.getCourseName() );
      }

      
      

   }
}