public class Test
{
   public static void main(String[] args)
   {
      
      String i = new String("Buena");
      String j = new String("vista");
      System.out.println(i+j);
      
      int a = 4;
      switch (a)
      {
         case 1: System.out.println("equals 1");
         case 4: System.out.println("equals 4");
      
      }
      
      String x = new String("Java");
      String y = new String("Lava");
    int r1 = y.compareTo(x);
    if ( r1 > 0 )
    System.out.println("Greater Than");
    else if ( r1 < 0 )
    System.out.println("Less Than");
    else
    System.out.println("Equal");
      
      
      
      
      }
}