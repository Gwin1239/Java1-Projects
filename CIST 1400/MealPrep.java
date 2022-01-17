// Name : Godwin Djossou
// Class : CIST 1400-004
// Colleagues : NAME/EMAIL OF ANYONE YOU WORKED WITH, INCLUDING TUTORS 
// Resources : Canvas Document

import java.util.Scanner;

public class MealPrep
{
   public static void main(String[] args) {
   
      System.out.println("Welcome to the Meal Prep Program. Let's see what you can make.");   
      System.out.println("Do you have any meat?");
      Scanner one = new Scanner(System.in);
      String selection = one.nextLine();
      selection = selection.toUpperCase();
      if (selection.equals("YES") || (selection.equals("Y")))
      {
         System.out.println("Do you have beef, chicken, or other meat?");
         String selection1 = one.nextLine();
         selection1 = selection1.toUpperCase();
         if (selection1.equals("BEEF"))
         {
            System.out.println("Do you have steak, ground, or roast?");
            String selection2 = one.nextLine();
            selection2 = selection2.toUpperCase();
            if (selection2.equals("STEAK"))
            {
               System.out.println("Do you have potatoes?");
               String selection3 = one.nextLine();
               selection3 = selection3.toUpperCase();
               if (selection3.equals("YES") || (selection3.equals("Y")))
               {
                  System.out.println("Do you have salad?");
                  String selection4 = one.nextLine();
                  selection4 = selection4.toUpperCase();
                  if (selection4.equals("YES") || (selection4.equals("Y")))
                  {
                     System.out.println("You should make steak, baked potato and salad.");
                  }
                  else if (selection4.equals("NO") || (selection4.equals("N")))
                  {
                     System.out.println("Do you have fruit?");
                     String selection5 = one.nextLine();
                     selection5 = selection5.toUpperCase();
                     if (selection5.equals("YES") || (selection5.equals("Y")))
                     {
                        System.out.println("You should make steak, baked potato and fruit.");
                     }
                     else if (selection5.equals("NO") || (selection5.equals("N")))
                     {
                        System.out.println("You should make steak and potato hash.");
                     }
                     else
                     {
                        System.out.println("Invalid Response.");
                     }
                  }
                  else
                  {
                     System.out.println("Invalid Response.");
                  }
               }
               else if (selection3.equals("NO") || (selection3.equals("N")))
               {
                  System.out.println("Do you have salad?");
                  String selection4 = one.nextLine();
                  selection4 = selection4.toUpperCase();
                  if (selection4.equals("YES") || (selection4.equals("Y")))
                  {
                     System.out.println("You should make steak salad.");
                  }
                  else if (selection4.equals("NO") || (selection4.equals("N")))
                  {
                     System.out.println("You should make a steak sandwich.");
                  }
                  else
                  {
                     System.out.println("Invalid Response.");
                  }
               }
               else 
               {
                  System.out.println("Invalid Response.");
               } 
            }
            else if (selection2.equals("GROUND"))
            {
               System.out.println("Do you have buns?");
               String selection3 = one.nextLine();
               selection3 = selection3.toUpperCase();
               if (selection3.equals("YES") || (selection3.equals("Y")))
               {
                  System.out.println("You should make hamburgers.");
               }
               else if (selection3.equals("NO") || (selection3.equals("N")))
               {
                  System.out.println("Do you have rice?");
                  String selection4 = one.nextLine();
                  selection4 = selection4.toUpperCase();
                  if (selection4.equals("YES") || (selection4.equals("Y")))
                  {
                     System.out.println("You should make casserole.");
                  }
                  else if (selection4.equals("NO") || (selection4.equals("N")))
                  {
                     System.out.println("You should make chili.");
                  }
                  else
                  {
                     System.out.println("Invalid Response.");
                  }
               }
               else
               {
                  System.out.println("Invalid Response.");
               }
            }
            else if (selection2.equals("ROAST"))
            {
               System.out.println("Do you have potatoes?");
               String selection3 = one.nextLine();
               selection3 = selection3.toUpperCase();
               if (selection3.equals("YES") || (selection3.equals("Y")))
               {
                  System.out.println("Do you have vegetables?");
                  String selection4 = one.nextLine();
                  selection4 = selection4.toUpperCase();
                  if (selection4.equals("YES") || (selection4.equals("Y")))
                  {
                     System.out.println("You should make pot roast and veggies with mashed potatoes.");
                  }
                  else if (selection4.equals("NO") || (selection4.equals("N")))
                  {
                     System.out.println("You should make roasted potatoes and meat.");
                  }
                  else
                  {
                     System.out.println("Invalid Response.");
                  }
               }
               else if (selection3.equals("NO") || (selection3.equals("N")))
               {
                  System.out.println("Do you have vegetables?");
                  String selection4 = one.nextLine();
                  selection4 = selection4.toUpperCase();
                  if (selection4.equals("YES") || (selection4.equals("Y")))
                  {
                     System.out.println("You should make meat and veggie soup.");
                  }
                  else if (selection4.equals("NO") || (selection4.equals("N")))
                  {
                     System.out.println("You should make pot roast.");
                  }
                  else
                  {
                     System.out.println("Invalid Response.");
                  }
               }
               else
               {
                  System.out.println("Invalid Response");
               }
            }
            else
            {
               System.out.println("Invalid Response.");
            }
            
         }
         else if (selection1.equals("CHICKEN"))
         {
            System.out.println("Do you have whole or pieces?");
            String selection2 = one.nextLine();
            selection2 = selection2.toUpperCase();
            if (selection2.equals("WHOLE"))
            {
               System.out.println("Do you have pasta?");
               String selection3 = one.nextLine();
               selection3 = selection3.toUpperCase();
               if (selection3.equals("YES") || (selection3.equals("Y")))
               {
                  System.out.println("You should make chicken pasta casserole.");
               }
               else if (selection3.equals("NO") || (selection3.equals("N"))) 
               {
                  System.out.println("Do you have rice?");
                  String selection4 = one.nextLine();
                  selection4 = selection4.toUpperCase();
                  if (selection4.equals("YES") || (selection4.equals("Y")))
                  {
                     System.out.println("Do you have vegetables?");
                     String selection5 = one.nextLine();
                     selection5 = selection5.toUpperCase();
                     if (selection5.equals("YES") || (selection5.equals("Y")))
                     {
                        System.out.println("You should make stir fry.");
                     }
                     else if (selection5.equals("NO") || (selection5.equals("N")))
                     {
                        System.out.println("You should make chicken rice casserole.");
                     }
                     else
                     {
                        System.out.println("Invalid Response.");
                     }
                  }
                  else if (selection4.equals("NO") || (selection4.equals("N")))
                  {
                     System.out.println("You should make smoked chicken.");
                  }
                  else
                  {
                     System.out.println("Invalid Response.");
                  }
               }
               else
               {
                  System.out.println("Invalid Response.");
               }
            }
            else if (selection2.equals("PIECES"))
            {
               System.out.println("Do you have vegetables?");
               String selection3 = one.nextLine();
               selection3 = selection3.toUpperCase();
               if (selection3.equals("YES") || (selection3.equals("Y")))
               {
                  System.out.println("You should make grilled chicken & veggies.");
               }
               else if (selection3.equals("NO") || (selection3.equals("N"))) 
               {
                  System.out.println("Do you have pasta?");
                  String selection4 = one.nextLine();
                  selection4 = selection4.toUpperCase();
                  if (selection4.equals("YES") || (selection4.equals("Y")))
                  {
                     System.out.println("You should make chicken piccata.");
                  }
                  else if (selection4.equals("NO") || (selection4.equals("N")))
                  {
                     System.out.println("You should make fried chicken.");
                  }
                  else
                  {
                     System.out.println("Invalid Response.");
                  } 
               }
               else
               {
                  System.out.println("Invalid Response.");
               }
            }
            else
            {
               System.out.println("Invalid Response.");
            }
         }
         else if (selection1.equals("OTHER MEAT"))
         {
            System.out.println("Do you have eggs?");
            String selection2 = one.nextLine();
            selection2 = selection2.toUpperCase();
            if (selection2.equals("YES") || (selection2.equals("Y")))
            {
               System.out.println("You should make meat and eggs.");
            }
            else if (selection2.equals("NO") || (selection2.equals("N")))
            {
               System.out.println("Do you have vegetables?");
               String selection3 = one.nextLine();
               selection3 = selection3.toUpperCase();
               if (selection3.equals("YES") || (selection3.equals("Y")))
               {
                  System.out.println("You should make meat and veggies.");
               }
               else if (selection3.equals("NO") || (selection3.equals("N"))) 
               {
                  System.out.println("Do you have pasta?");
                  String selection4 = one.nextLine();
                  selection4 = selection4.toUpperCase();
                  if (selection4.equals("YES") || (selection4.equals("Y")))
                  {
                     System.out.println("You should make meat & pasta.");
                  }
                  else if (selection4.equals("NO") || (selection4.equals("N"))) 
                  {
                     System.out.println("You should make just meat!");
                  }
                  else
                  {
                     System.out.println("Invalid Response.");
                  }
               }
               else
               {
                  System.out.println("Invalid Response.");
               }
            }
            else
            {
               System.out.println("Invalid Response.");
            }
         }
         else 
         {
            System.out.println("Invalid Response.");
         }
      }
      else if (selection.equals("NO") || (selection.equals("N")))
      {
         System.out.println("Do you have any vegetables?");
         String selection1 = one.nextLine();
         selection1 = selection1.toUpperCase();
         if (selection1.equals("YES") || (selection1.equals("Y")))
         {
            System.out.println("Do you have eggplants?");
            String selection2 = one.nextLine();
            selection2 = selection2.toUpperCase();
            if (selection2.equals("YES") || (selection2.equals("Y")))
            {
               System.out.println("Do you have tomatoes?");
               String selection3 = one.nextLine();
               selection3 = selection3.toUpperCase();
               if (selection3.equals("YES") || (selection3.equals("Y")))
               {
                  System.out.println("You should make eggplant parmesan.");
               }
               else if (selection3.equals("NO") || (selection3.equals("N")))
               {
                  System.out.println("You should make roasted eggplant.");
               }
               else 
               {
                  System.out.println("Invalid Response.");
               }
            }
            else if (selection2.equals("NO") || (selection2.equals("N")))
            {
               System.out.println("You should make vegetable soup.");
            }
            else
            {
               System.out.println("Invalid Response.");
            }
         }
         else if (selection1.equals("NO") || (selection1.equals("N")))
         {
            System.out.println("Do you have eggs?");
            String selection2 = one.nextLine();
            selection2 = selection2.toUpperCase();
            if (selection2.equals("YES") || (selection2.equals("Y")))
            {
               System.out.println("Do you have onions and peppers?");
               String selection3 = one.nextLine();
               selection3 = selection3.toUpperCase();
               if (selection3.equals("YES") || (selection3.equals("Y")))
               {
                  System.out.println("You should make a frittata.");
               }
               else if (selection3.equals("NO") || (selection3.equals("N")))
               {
                  System.out.println("You should make an omelette.");
               }
               else
               {
                  System.out.println("Invalid Response.");
               }
            }  
            else if (selection2.equals("NO") || (selection2.equals("N")))
            {
               System.out.println("Do you have bread?");
               String selection3 = one.nextLine();
               selection3 = selection3.toUpperCase();
               if (selection3.equals("YES") || (selection3.equals("Y")))
               {
                  System.out.println("You should make a PB & J sandwich.");
               }
               else if (selection3.equals("NO") || (selection3.equals("N")))
               {
                  System.out.println("Your cupboard is bare!");
               }
               else
               {
                  System.out.println("Invalid Response.");
               }
            }
            else 
            {
               System.out.println("Invalid Response.");
            }
         }
         else
         {
            System.out.println("Invalid Response.");
         }
         

      }
      else 
      {
         System.out.println("Invalid Response.");
      }
   
  
   }
}