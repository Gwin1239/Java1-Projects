// Name : Godwin Djossou
// Class : CIST 1400-004
// Colleagues : NAME/EMAIL OF ANYONE YOU WORKED WITH, INCLUDING TUTORS 
// Resources : Canvas Document

public class DieDriver
{
   public static void main(String[] args)
   {
   
   Die one = new Die();
   
   Die two = new Die(5);
   Die three = new Die(2);
   
   Die four = new Die(4);
   Die five = new Die(4);
   
   two.setNumFaces(5);
   three.setNumFaces(2);
   
   one.setFaceValue(2);
   three.setFaceValue(0);
   
   System.out.println("Die2 has " + two.getNumFaces() + " faces and Die3 has " + three.getNumFaces() + " faces.");
   System.out.println("Die1 has face value of " + one.getFaceValue() + " and Die3 has face value of " + three.getFaceValue() );
   
   
   System.out.println("After rolling Die1 the face value is now " + one.roll() + " and after rolling Die3 the face value is now " + three.roll() );
   
   System.out.println(two);
   
   if (four.equals(five))
   {
      System.out.println("Die4 and Die5 are equal. This is correct.");
   }
   else
   {
      System.out.println("Die4 and Die5 are equal but there is something wrong with the equals() method.");
   }
   
   
   
   if (four.equals(two))
   {
      System.out.println("Die4 and Die2 are not equal, there is something wrong with the equals() method.");
   }
   else
   {
      System.out.println("Die4 and Die2 are not equal this is correct.");
   }
   
   
   }
}