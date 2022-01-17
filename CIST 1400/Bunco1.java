public class Bunco1
{
   public static void main(String[] args)
   {
      System.out.println("Welcome to the Bunco Game");
      
      System.out.println("Round 1");
      Die one = new Die();
      Die two = new Die();
      Die three = new Die();
      
      int a = one.roll();
      int b = two.roll();
      int c = three.roll();
      
      int bunco1 = 0;
      
      
         
      while (a == 1 || b == 1 || c == 1)
      {
         System.out.println("You rolled a " + a + " and a " + b + " and a " + c );
        
         if ( a == 1)
         {
            bunco1 = bunco1 + 1;
            if ( b == 1)
            {
               bunco1 = bunco1 + 1;
               if ( c == 1)
               {
                  bunco1 = bunco1 + 1;
               }
            }
         }
         else if ( b == 1)
         {
            bunco1 = bunco1 + 1;
            if ( c == 1)
            {
               bunco1 = bunco1 + 1;
            }
         }
         else if ( c == 1)
         {
            bunco1 = bunco1 + 1;
         }
         else 
         {
           
         }
         
         if ( a == 1 && b == 1 && c == 1)
         {
            System.out.println("BUNCO!");
            bunco1 = bunco1 + 21;
         }
         
         a = one.roll();
         b = two.roll();
         c = three.roll();
      
      
      
      
      }
         System.out.println("You rolled a " + a + " and a " + b + " and a " + c );
         System.out.println("Your score for Round 1 is " + bunco1 );
      
      
      
      
   
   
   
   






 
   }
 
}