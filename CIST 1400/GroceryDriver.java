// Name : Godwin Djossou
// Class : CIST 1400-004
// Colleagues : Used Piazza, CSLC
// Resources : Canvas Document

import java.util.Scanner;
public class GroceryDriver
{
   public static void main(String[] args)
   { 
      GroceryList one = new GroceryList();
      int choose;
      Scanner input = new Scanner(System.in);
      
      do
      {
         System.out.println("1. Print the grocery list");
         System.out.println("2. Print the number of items in the list");
         System.out.println("3. Print the total number of grocery items to be purchased");
         System.out.println("4. Add an item to grocery list");
         System.out.println("5. Remove an item (based on position)");
         System.out.println("6. Increase the quantity of an item");
         System.out.println("7. Sort the items by quantity");
         System.out.println("8. Sort the items by name");
         System.out.println("9. Quit");
         

      
         System.out.println("Enter choice: ");
         choose = input.nextInt();
         input.nextLine();
      
         if (choose == 1)
         {
            System.out.printf("Grocery List is: \n" + one + "\n");       
         }
         else if (choose == 2)
         {
            System.out.println("Number of unique items: " + one.getCount());    
         }
      
         else if (choose == 3)
         {
            int sum = 0;
            for (int a = 0; a < one.getCount(); a++)
            {
               sum += one.getItem(a).getQuantity();
            }
  
            System.out.println("Total grocery Items: " + sum);
         }
      
         else if (choose == 4)
         {
            String name;
            int q;
            System.out.println("Enter Item:");
            name = input.nextLine();
            do 
            {
               System.out.println("Enter quantity (1-20)");
               q = input.nextInt(); input.nextLine();
            } while (q <= 0 || q > 20 );
            Item z = new Item(name, q);
            one.addItem(z);          
            
            if (one.getCount() > 30)
            {
               System.out.println("No more room");
            }
         }
      
         else if (choose == 5)
         {
            int b;
            System.out.println("Here is the List of Groceries : ");
            System.out.println(one.toString());
            System.out.println("Enter number of item to delete : ");
            b = input.nextInt(); input.nextLine();
            if (b < 1 || b > one.getCount())
            {
               System.out.println("Item does not exist");
            }
            else
            {
               one.deleteItem(b);
            }   
         }
         
         else if (choose == 6)
         {
            int b;
            System.out.println("Here is the List of Groceries : ");
            System.out.println(one.toString());
            System.out.println("Enter number of item for quantity increase : ");
            b = input.nextInt(); input.nextLine();
            if (b < 1 || b > one.getCount())
            {
               System.out.println("Item does not exist");
            }
            else
            {
               one.getItem(b - 1).increaseQuant();
            }   
         }
         
         else if (choose == 7)
         {
            GroceryList ha = new GroceryList(one.sortQuant());
            System.out.printf("Groceries Sorted by Quantity: \n" + ha);   
         }
         
         else if (choose == 8)
         {
            GroceryList ba = new GroceryList(one.sortName());
            System.out.printf("Groceries Sorted by Name: \n " + ba);   
         }
      
         else if (choose < 1 || choose > 10)
         {
            
         }
 
      
      
      } while (choose != 9);
   
      
      input.close();
   
      System.out.println("Thanks for shopping with us.");
   
   
   
   

   
  
   
   
   
   }
   
}    
