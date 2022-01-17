// Name : Godwin Djossou
// Class : CIST 1400-004
// Colleagues : NAME/EMAIL OF ANYONE YOU WORKED WITH, INCLUDING TUTORS 
// Resources : Canvas Document

public class Bunco
{
   public static void main(String[] args)
   {
      System.out.println("Welcome to the Bunco Game");
      
      System.out.println("ROUND 1");
      int a = 6;
      //number for faces on die
      
      Die d1 = new Die(a);
      Die d2 = new Die(a);
      Die d3 = new Die(a);
      //3 die with 6 faces on each initilized 
      
      int round = 1;
      //start from round 1 will add in later code
      int total = 0;
      int t1 = 0;
      int t2 = 0;
      int t3 = 0;
      int t4 = 0;
      int t5 = 0;
      int t6 = 0;
      // total score from each round
     
      
      while (round >= 1 && round <= 6)
      {
         System.out.println("You rolled a " + d1.roll() + " and a " + d2.roll() + " and a " + d3.roll());
         
         if ((d1.getFaceValue() == round || d2.getFaceValue() == round || d3.getFaceValue() == round))
         {
            total = total + 1;
         }  
         if ((d1.getFaceValue() == round && d2.getFaceValue() == round && d3.getFaceValue() == round))
         {  
            total = total - 1;
            //fixed error from previous submition
            total = total + 21;
            System.out.println("BUNCO!");
            System.out.println("Your score for round " + round + " is " + total);     
         }
         else if ((d1.getFaceValue() == round && d2.getFaceValue() == round) 
            || (d2.getFaceValue() == round && d3.getFaceValue() == round) 
            || (d3.getFaceValue() == round && d1.getFaceValue() == round))
         {
            total = total + 1;
         
         }
         if ((d1.getFaceValue() == d2.getFaceValue() 
            && d2.getFaceValue() == d3.getFaceValue() && round != d1.getFaceValue()))
         {
            total = total + 5;
            System.out.println("MINI-BUNCO!");
            
         }
         if (round == 1)
         {
            t1 = total;
         }   
         if (round == 2)
         {
            t2 = total;
         }
         if (round == 3)
         {
            t3 = total;
         }
         if (round == 4)
         {
            t4 = total;
         }
         if (round == 5)
         {
            t5 = total;
         }
         if (round == 6)
         {
            t6 = total;
         }
         if (d1.getFaceValue() != round && d2.getFaceValue() != round && d3.getFaceValue() != round)
         {
            System.out.println("Your score for round " + round + " is " + total);
            round = round + 1;
            if (round != 7)
            {
               System.out.println("ROUND " + round);
            }
            total = 0;
         }
         if (total == 21)
         {
            round = round + 1;
            total = 0;
            System.out.println("ROUND " + round);
         }
         if (total > 21)
         {  
            total = 0;
         }
         
   
      }
      int add = t1 + t2 + t3 + t4 + t5 + t6;
      //variable for all round totals together
      
      System.out.println("Score for all rounds is " + add);
      
      
      
   }
}
      
      
      