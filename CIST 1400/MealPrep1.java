import java.util.Scanner;
public class MealPrep1
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to the Meal Prep Program. Let's see what you can make.");   
    System.out.println("Do you have any meat?");
    Scanner one = new Scanner (System.in);
    String selection = one.nextLine();
    selection = selection.toUpperCase();
    if ( selection.equals("YES") ) {
    System.out.println("Do you have beef, chicken, or other meat?");
    String selection1 = one.nextLine();
    selection1 = selection1.toUpperCase();
      if ( selection1.equals("BEEF") ) {
      System.out.println("Do you have steak, ground, or roast?");
         String selection2 = one.nextLine();
         selection2 = selection2.toUpperCase();
         if ( selection2.equals("STEAK") ) {
         System.out.println("Do you have potatoes?");
            String selection3 = one.nextLine();
            selection3 = selection3.toUpperCase();
            if ( selection3.equals("YES") ) {
            System.out.println("Do you have Salad?");
               String selection4 = one.nextLine();
               selection4 = selection4.toUpperCase();
               if ( selection4.equals("YES") ) {
               System.out.println("You should make Steak, Baked Potato and Salad.");
               }
               if ( selection4.equals("Y") ) {
               System.out.println("You should make Steak, Baked Potato and Salad.");
               }
               if ( selection4.equals("NO") ) {
               System.out.println("Do you have fruit?");
                   String selection5 = one.nextLine();
                   selection5 = selection5.toUpperCase();
                   if ( selection5.equals("YES") ) {
                   System.out.println("You should make Steak, Baked Potato and Fruit.");
                   }
                   if ( selection5.equals("Y") ) {
                   System.out.println("You should make Steak, Baked Potato and Fruit.");
                   }
                   if ( selection5.equals("NO") ) {
                   System.out.println("You should make Steak and Potato Hash.");
                   }
                   if ( selection5.equals("N") ) {
                   System.out.println("You should make Steak and Potato Hash.");
                   }
                  
               }
               if ( selection4.equals("N") ) {
               System.out.println("Do you have fruit?");
                  String selection5 = one.nextLine();
                   selection5 = selection5.toUpperCase();
                   if ( selection5.equals("YES") ) {
                   System.out.println("You should make Steak, Baked Potato and Fruit.");
                   }
                   if ( selection5.equals("Y") ) {
                   System.out.println("You should make Steak, Baked Potato and Fruit.");
                   }
                   if ( selection5.equals("NO") ) {
                   System.out.println("You should make Steak and Potato Hash.");
                   }
                   if ( selection5.equals("N") ) {
                   System.out.println("You should make Steak and Potato Hash.");
                   }
               }
            
            }
            if ( selection3.equals("Y") ) {
            System.out.println("Do you have Salad?");
               String selection4 = one.nextLine();
               selection4 = selection4.toUpperCase();
               if ( selection4.equals("YES") ) {
               System.out.println("You should make Steak, Baked Potato and Salad.");
               }
               if ( selection4.equals("Y") ) {
               System.out.println("You should make Steak, Baked Potato and Salad.");
               }
               if ( selection4.equals("NO") ) {
               System.out.println("Do you have fruit?");
                   String selection5 = one.nextLine();
                   selection5 = selection5.toUpperCase();
                   if ( selection5.equals("YES") ) {
                   System.out.println("You should make Steak, Baked Potato and Fruit.");
                   }
                   if ( selection5.equals("Y") ) {
                   System.out.println("You should make Steak, Baked Potato and Fruit.");
                   }
                   if ( selection5.equals("NO") ) {
                   System.out.println("You should make Steak and Potato Hash.");
                   }
                   if ( selection5.equals("N") ) {
                   System.out.println("You should make Steak and Potato Hash.");
                   }
                  
               }
               if ( selection4.equals("N") ) {
               System.out.println("Do you have fruit?");
                  String selection5 = one.nextLine();
                   selection5 = selection5.toUpperCase();
                   if ( selection5.equals("YES") ) {
                   System.out.println("You should make Steak, Baked Potato and Fruit.");
                   }
                   if ( selection5.equals("Y") ) {
                   System.out.println("You should make Steak, Baked Potato and Fruit.");
                   }
                   if ( selection5.equals("NO") ) {
                   System.out.println("You should make Steak and Potato Hash.");
                   }
                   if ( selection5.equals("N") ) {
                   System.out.println("You should make Steak and Potato Hash.");
                   }
               }
            
            
            }
            if ( selection3.equals("NO") ) {
            System.out.println("Do you have Salad?");
               String selection4 = one.nextLine();
               selection4 = selection4.toUpperCase();
               if ( selection4.equals("YES") ) {
               System.out.println("You should make a Steak Salad.");
               }
               if ( selection4.equals("Y") ) {
               System.out.println("You should make a Steak Salad.");
               }
               if ( selection4.equals("NO") ) {
               System.out.println("You should make a Steak Sandwich.");
               }
               if ( selection4.equals("N") ) {
               System.out.println("You should make a Steak Sandwich.");
               }
            
            }
            if ( selection3.equals("N") ) {
            System.out.println("Do you have Salad?");
               String selection4 = one.nextLine();
               selection4 = selection4.toUpperCase();
               if ( selection4.equals("YES") ) {
               System.out.println("You should make a Steak Salad.");
               }
               if ( selection4.equals("Y") ) {
               System.out.println("You should make a Steak Salad.");
               }
               if ( selection4.equals("NO") ) {
               System.out.println("You should make a Steak Sandwich.");
               }
               if ( selection4.equals("N") ) {
               System.out.println("You should make a Steak Sandwich.");
               }
                      
            }
                    
         }
         if ( selection2.equals("GROUND") ) {
         System.out.println("Do you have buns?");
            String selection3 = one.nextLine();
            selection3 = selection3.toUpperCase();
            if ( selection3.equals("YES") ) {
            System.out.println("You should make hamburgers.");
            }
            if ( selection3.equals("Y") ) {
            System.out.println("You should make hamburgers.");
            }
            if ( selection3.equals("NO") ) {
            System.out.println("Do you have rice?");
               String selection4 = one.nextLine();
               selection4 = selection4.toUpperCase();
               if ( selection4.equals("YES") ) {
               System.out.println("You should make Casserole.");
               }
               if ( selection4.equals("Y") ) {
               System.out.println("You should make Casserole.");
               } 
               if ( selection4.equals("NO") ) {
               System.out.println("You should make Chili.");
               } 
               if ( selection4.equals("N") ) {
               System.out.println("You should make Chili.");
               }    
            }
            if ( selection3.equals("N") ) {
            System.out.println("Do you have rice?");
               String selection4 = one.nextLine();
               selection4 = selection4.toUpperCase();
               if ( selection4.equals("YES") ) {
               System.out.println("You should make Casserole.");
               }
               if ( selection4.equals("Y") ) {
               System.out.println("You should make Casserole.");
               } 
               if ( selection4.equals("NO") ) {
               System.out.println("You should make Chili.");
               } 
               if ( selection4.equals("N") ) {
               System.out.println("You should make Chili.");
               }
            }
            
         }
         if ( selection2.equals("ROAST") ) {
         System.out.println("Do you have potatoes?");
            String selection3 = one.nextLine();
            selection3 = selection3.toUpperCase();
            if ( selection3.equals("YES") ) {
            System.out.println("Do you have vegetables?");
               String selection4 = one.nextLine();
               selection4 = selection4.toUpperCase();
               if (selection4.equals("YES") ) {
               System.out.println("You should make pot roast and veggies with mashed potatoes.");
               }
               if (selection4.equals("Y") ) {
               System.out.println("You should make pot roast and veggies with mashed potatoes.");
               }
               if (selection4.equals("NO") ) {
               System.out.println("You should make roast potatoes and meat.");
               }
               if (selection4.equals("N") ) {
               System.out.println("You should make roast potatoes and meat.");
               }
            }
            if ( selection3.equals("Y") ) {
            System.out.println("Do you have vegetables?");
               String selection4 = one.nextLine();
               selection4 = selection4.toUpperCase();
               if (selection4.equals("YES") ) {
               System.out.println("You should make pot roast and vegetables with mashed potatoes.");
               }
               if (selection4.equals("Y") ) {
               System.out.println("You should make pot roast and vegetables with mashed potatoes.");
               }
               if (selection4.equals("NO") ) {
               System.out.println("You should make roast potatoes and meat.");
               }
               if (selection4.equals("N") ) {
               System.out.println("You should make roast potatoes and meat.");
               }
            }
         
            if ( selection3.equals("NO") ) {
            System.out.println("Do you have vegetables?");
               String selection4 = one.nextLine();
               selection4 = selection4.toUpperCase();
               if (selection4.equals("YES") ) {
               System.out.println("You should make meat and veggie soup.");
               }
               if (selection4.equals("Y") ) {
               System.out.println("You should make meat and veggie soup.");
               }
               if (selection4.equals("NO") ) {
               System.out.println("You should make pot roast.");
               }
               if (selection4.equals("N") ) {
               System.out.println("You should make pot roast.");
               }
            }
            if ( selection3.equals("N") ) {
            System.out.println("Do you have vegetables?");
               String selection4 = one.nextLine();
               selection4 = selection4.toUpperCase();
               if (selection4.equals("YES") ) {
               System.out.println("You should make meat and veggie soup.");
               }
               if (selection4.equals("Y") ) {
               System.out.println("You should make meat and veggie soup.");
               }
               if (selection4.equals("NO") ) {
               System.out.println("You should make pot roast.");
               }
               if (selection4.equals("N") ) {
               System.out.println("You should make pot roast.");
               }
            }
         
         }
     
      }
      
      if ( selection1.equals("CHICKEN") ) {
      System.out.println("Do you have whole or pieces?");
         String selection2 = one.nextLine();
         selection2 = selection2.toUpperCase();
         if ( selection2.equals("WHOLE") ) {
         System.out.println("Do you have pasta?");
            String selection3 = one.nextLine();
            selection3 = selection3.toUpperCase();
            if ( selection3.equals("YES") ) {
            System.out.println("You should make chicken pasta casserole.");
            
            }
            if ( selection3.equals("Y") ) {
            System.out.println("You should make chicken pasta casserole.");
            
            }
            if ( selection3.equals("NO") ) {
            System.out.println("Do you have rice?");
               String selection4 = one.nextLine();
               selection4 = selection4.toUpperCase();
               if ( selection4.equals("YES") ) {
               System.out.println("Do you have vegetables?");
               
               }
               if ( selection4.equals("Y") ) {
               System.out.println("Do you have vegetables?");
               
               }
               if ( selection4.equals("NO") ) {
               System.out.println("You should make smoked chicken.");
               
               }
               if ( selection4.equals("N") ) {
               System.out.println("You should make smoked chicken.");
               
               }
            
            }
            if ( selection3.equals("N") ) {
            System.out.println("Do you have rice?");
               String selection4 = one.nextLine();
               selection4 = selection4.toUpperCase();
               if ( selection4.equals("YES") ) {
               System.out.println("Do you have vegetables?");
                  String selection5 = one.nextLine();
                  selection5 = selection5.toUpperCase();
                  if (selection5.equals("YES") ) {
                  System.out.println("You should make stir fry.");
                  }
                  if (selection5.equals("Y") ) {
                  System.out.println("You should make stir fry.");
                  }
                  if (selection5.equals("NO") ) {
                  System.out.println("You should make chicken rice casserole.");
                  }
                  if (selection5.equals("N") ) {
                  System.out.println("You should make chicken rice casserole.");
                  }
               
               }
               if ( selection4.equals("Y") ) {
               System.out.println("Do you have vegetables?");
                  String selection5 = one.nextLine();
                  selection5 = selection5.toUpperCase();
                  if (selection5.equals("YES") ) {
                  System.out.println("You should make stir fry.");
                  }
                  if (selection5.equals("Y") ) {
                  System.out.println("You should make stir fry.");
                  }
                  if (selection5.equals("NO") ) {
                  System.out.println("You should make chicken rice casserole.");
                  }
                  if (selection5.equals("N") ) {
                  System.out.println("You should make chicken rice casserole.");
                  }
               
               }
               if ( selection4.equals("NO") ) {
               System.out.println("You should make smoked chicken.");
               
               }
               if ( selection4.equals("N") ) {
               System.out.println("You should make smoked chicken.");
               
               }
            
            }
         
         }
         
         if ( selection2.equals("PIECES") ) {
         System.out.println("Do you have vegetables?");
            String selection3 = one.nextLine();
            selection3 = selection3.toUpperCase();
            if (selection3.equals("YES") ) {
            System.out.println("You should make grilled chicken and veggies.");
            }
            if (selection3.equals("Y") ) {
            System.out.println("You should make grilled chicken and veggies.");
            }
            if (selection3.equals("NO") ) {
            System.out.println("Do you have pasta?");
               String selection4 = one.nextLine();
               selection4 = selection4.toUpperCase();
               if (selection4.equals("YES") ) {
               System.out.println("You should make chicken piccata.");
               }
               if (selection4.equals("Y") ) {
               System.out.println("You should make chicken piccata.");
               }
               if (selection4.equals("NO") ) {
               System.out.println("You should make fried chicken.");
               }
               if (selection4.equals("N") ) {
               System.out.println("You should make fried chicken.");
               }
            }
            if (selection3.equals("N") ) {
            System.out.println("Do you have pasta?");
               String selection4 = one.nextLine();
               selection4 = selection4.toUpperCase();
               if (selection4.equals("YES") ) {
               System.out.println("You should make chicken piccata.");
               }
               if (selection4.equals("Y") ) {
               System.out.println("You should make chicken piccata.");
               }
               if (selection4.equals("NO") ) {
               System.out.println("You should make fried chicken.");
               }
               if (selection4.equals("N") ) {
               System.out.println("You should make fried chicken.");
               }
            }
         
         }
         
         
      }
      //
      if ( selection1.equals("OTHER MEAT") ) {
      System.out.println("Do you have eggs?");
         String selection2 = one.nextLine();
         selection2 = selection2.toUpperCase();
         if ( selection2.equals("YES") ) {
         System.out.println("You should make meat and eggs.");
         }
         if ( selection2.equals("Y") ) {
         System.out.println("You should make meat and eggs.");
         }
         if ( selection2.equals("NO") ) {
         System.out.println("Do you have vegetables?");
            String selection3 = one.nextLine();
            selection3 = selection3.toUpperCase();
            if ( selection3.equals("YES") ) {
            System.out.println("You should make meat and veggies.");
            }
            if ( selection3.equals("Y") ) {
            System.out.println("You should make meat and veggies.");
            }
            if ( selection3.equals("NO") ) {
            System.out.println("Do you have pasta?");
               String selection4 = one.nextLine();
               selection4 = selection4.toUpperCase();
               if ( selection4.equals("YES") ) {
               System.out.println("You should make meat and pasta.");
               }
               if ( selection4.equals("Y") ) {
               System.out.println("You should make meat and pasta.");
               }
               if ( selection4.equals("NO") ) {
               System.out.println("You should make just meat!");
               }
               if ( selection4.equals("N") ) {
               System.out.println("You should make just meat!");
               }
            }
            if ( selection3.equals("N") ) {
            System.out.println("Do you have pasta?");
               String selection4 = one.nextLine();
               selection4 = selection4.toUpperCase();
               if ( selection4.equals("YES") ) {
               System.out.println("You should make meat and pasta.");
               }
               if ( selection4.equals("Y") ) {
               System.out.println("You should make meat and pasta.");
               }
               if ( selection4.equals("NO") ) {
               System.out.println("You should make just meat!");
               }
               if ( selection4.equals("N") ) {
               System.out.println("You should make just meat!");
               }
            }
         }
         if ( selection2.equals("N") ) {
         System.out.println("Do you have vegetables?");
            String selection3 = one.nextLine();
            selection3 = selection3.toUpperCase();
            if ( selection3.equals("YES") ) {
            System.out.println("You should make meat and veggies.");
            }
            if ( selection3.equals("Y") ) {
            System.out.println("You should make meat and veggies.");
            }
            if ( selection3.equals("NO") ) {
            System.out.println("Do you have pasta?");
               String selection4 = one.nextLine();
               selection4 = selection4.toUpperCase();
               if ( selection4.equals("YES") ) {
               System.out.println("You should make meat and pasta.");
               }
               if ( selection4.equals("Y") ) {
               System.out.println("You should make meat and pasta.");
               }
               if ( selection4.equals("NO") ) {
               System.out.println("You should make just meat!");
               }
               if ( selection4.equals("N") ) {
               System.out.println("You should make just meat!");
               }
            }
            if ( selection3.equals("N") ) {
            System.out.println("Do you have pasta?");
               String selection4 = one.nextLine();
               selection4 = selection4.toUpperCase();
               if ( selection4.equals("YES") ) {
               System.out.println("You should make meat and pasta.");
               }
               if ( selection4.equals("Y") ) {
               System.out.println("You should make meat and pasta.");
               }
               if ( selection4.equals("NO") ) {
               System.out.println("You should make just meat!");
               }
               if ( selection4.equals("N") ) {
               System.out.println("You should make just meat!");
               }
            }
         }
         
      }
 
    }
    
 //other yes   
    if ( selection.equals("Y") ) {
    System.out.println("Do you have beef, chicken, or other meat?");
      String selection1 = one.nextLine();
      selection1 = selection1.toUpperCase();
      if ( selection1.equals("BEEF") ) {
      System.out.println("Do you have steak, ground, or roast?");
         String selection2 = one.nextLine();
         selection2 = selection2.toUpperCase();
         if ( selection2.equals("STEAK") ) {
         System.out.println("Do you have potatoes?");
            String selection3 = one.nextLine();
            selection3 = selection3.toUpperCase();
            if ( selection3.equals("YES") ) {
            System.out.println("Do you have Salad?");
               String selection4 = one.nextLine();
               selection4 = selection4.toUpperCase();
               if ( selection4.equals("YES") ) {
               System.out.println("You should make Steak, Baked Potato and Salad.");
               }
               if ( selection4.equals("Y") ) {
               System.out.println("You should make Steak, Baked Potato and Salad.");
               }
               if ( selection4.equals("NO") ) {
               System.out.println("Do you have fruit?");
                   String selection5 = one.nextLine();
                   selection5 = selection5.toUpperCase();
                   if ( selection5.equals("YES") ) {
                   System.out.println("You should make Steak, Baked Potato and Fruit.");
                   }
                   if ( selection5.equals("Y") ) {
                   System.out.println("You should make Steak, Baked Potato and Fruit.");
                   }
                   if ( selection5.equals("NO") ) {
                   System.out.println("You should make Steak and Potato Hash.");
                   }
                   if ( selection5.equals("N") ) {
                   System.out.println("You should make Steak and Potato Hash.");
                   }
                  
               }
               if ( selection4.equals("N") ) {
               System.out.println("Do you have fruit?");
                  String selection5 = one.nextLine();
                   selection5 = selection5.toUpperCase();
                   if ( selection5.equals("YES") ) {
                   System.out.println("You should make Steak, Baked Potato and Fruit.");
                   }
                   if ( selection5.equals("Y") ) {
                   System.out.println("You should make Steak, Baked Potato and Fruit.");
                   }
                   if ( selection5.equals("NO") ) {
                   System.out.println("You should make Steak and Potato Hash.");
                   }
                   if ( selection5.equals("N") ) {
                   System.out.println("You should make Steak and Potato Hash.");
                   }
               }
            
            }
            if ( selection3.equals("Y") ) {
            System.out.println("Do you have Salad?");
               String selection4 = one.nextLine();
               selection4 = selection4.toUpperCase();
               if ( selection4.equals("YES") ) {
               System.out.println("You should make Steak, Baked Potato and Salad.");
               }
               if ( selection4.equals("Y") ) {
               System.out.println("You should make Steak, Baked Potato and Salad.");
               }
               if ( selection4.equals("NO") ) {
               System.out.println("Do you have fruit?");
                   String selection5 = one.nextLine();
                   selection5 = selection5.toUpperCase();
                   if ( selection5.equals("YES") ) {
                   System.out.println("You should make Steak, Baked Potato and Fruit.");
                   }
                   if ( selection5.equals("Y") ) {
                   System.out.println("You should make Steak, Baked Potato and Fruit.");
                   }
                   if ( selection5.equals("NO") ) {
                   System.out.println("You should make Steak and Potato Hash.");
                   }
                   if ( selection5.equals("N") ) {
                   System.out.println("You should make Steak and Potato Hash.");
                   }
                  
               }
               if ( selection4.equals("N") ) {
               System.out.println("Do you have fruit?");
                  String selection5 = one.nextLine();
                   selection5 = selection5.toUpperCase();
                   if ( selection5.equals("YES") ) {
                   System.out.println("You should make steak, baked potato and fruit.");
                   }
                   if ( selection5.equals("Y") ) {
                   System.out.println("You should make steak, baked potato and fruit.");
                   }
                   if ( selection5.equals("NO") ) {
                   System.out.println("You should make steak and potato hash.");
                   }
                   if ( selection5.equals("N") ) {
                   System.out.println("You should make steak and potato hash.");
                   }
               }
            
            
            }
            
            if ( selection3.equals("NO") ) {
            System.out.println("Do you have salad?");
               String selection4 = one.nextLine();
               selection4 = selection4.toUpperCase();
               if ( selection4.equals("YES") ) {
               System.out.println("You should make a Steak Salad.");
               }
               if ( selection4.equals("Y") ) {
               System.out.println("You should make a Steak Salad.");
               }
               if ( selection4.equals("NO") ) {
               System.out.println("You should make a Steak Sandwich.");
               }
               if ( selection4.equals("N") ) {
               System.out.println("You should make a Steak Sandwich.");
               }
            
            
            }
            if ( selection3.equals("N") ) {
            System.out.println("Do you have salad?");
               String selection4 = one.nextLine();
               selection4 = selection4.toUpperCase();
               if ( selection4.equals("YES") ) {
               System.out.println("You should make a Steak Salad.");
               }
               if ( selection4.equals("Y") ) {
               System.out.println("You should make a Steak Salad.");
               }
               if ( selection4.equals("NO") ) {
               System.out.println("You should make a Steak Sandwich.");
               }
               if ( selection4.equals("N") ) {
               System.out.println("You should make a Steak Sandwich.");
               }
            
            
            }
            
         
         }
         if ( selection2.equals("GROUND") ) {
         System.out.println("Do you have buns?");
            String selection3 = one.nextLine();
            selection3 = selection3.toUpperCase();
            if ( selection3.equals("YES") ) {
            System.out.println("You should make hamburgers.");
            }
            if ( selection3.equals("Y") ) {
            System.out.println("You should make hamburgers.");
            }
            if ( selection3.equals("NO") ) {
            System.out.println("Do you have rice?");
               String selection4 = one.nextLine();
               selection4 = selection4.toUpperCase();
               if ( selection4.equals("YES") ) {
               System.out.println("You should make casserole.");
               }
               if ( selection4.equals("Y") ) {
               System.out.println("You should make casserole.");
               } 
               if ( selection4.equals("NO") ) {
               System.out.println("You should make chili.");
               } 
               if ( selection4.equals("N") ) {
               System.out.println("You should make chili.");
               }
            }
            if ( selection3.equals("N") ) {
            System.out.println("Do you have rice?");
               String selection4 = one.nextLine();
               selection4 = selection4.toUpperCase();
               if ( selection4.equals("YES") ) {
               System.out.println("You should make casserole.");
               }
               if ( selection4.equals("Y") ) {
               System.out.println("You should make casserole.");
               } 
               if ( selection4.equals("NO") ) {
               System.out.println("You should make chili.");
               } 
               if ( selection4.equals("N") ) {
               System.out.println("You should make chili.");
               }
            }
         }
         if ( selection2.equals("ROAST") ) {
         System.out.println("Do you have potatoes?");
            String selection3 = one.nextLine();
            selection3 = selection3.toUpperCase();
            if ( selection3.equals("YES") ) {
            System.out.println("Do you have vegetables?");
               String selection4 = one.nextLine();
               selection4 = selection4.toUpperCase();
               if (selection4.equals("YES") ) {
               System.out.println("You should make pot roast and vegetables with mashed potatoes.");
               }
               if (selection4.equals("Y") ) {
               System.out.println("You should make pot roast and vegetables with mashed potatoes.");
               }
               if (selection4.equals("NO") ) {
               System.out.println("You should make roast potatoes and meat.");
               }
               if (selection4.equals("N") ) {
               System.out.println("You should make roast potatoes and meat.");
               }
            }
            if ( selection3.equals("Y") ) {
            System.out.println("Do you have vegetables?");
               String selection4 = one.nextLine();
               selection4 = selection4.toUpperCase();
               if (selection4.equals("YES") ) {
               System.out.println("You should make pot roast and vegetables with mashed potatoes.");
               }
               if (selection4.equals("Y") ) {
               System.out.println("You should make pot roast and vegetables with mashed potatoes.");
               }
               if (selection4.equals("NO") ) {
               System.out.println("You should make roast potatoes and meat.");
               }
               if (selection4.equals("N") ) {
               System.out.println("You should make roast potatoes and meat.");
               }
            }
            if ( selection3.equals("NO") ) {
            System.out.println("Do you have vegetables?");
               String selection4 = one.nextLine();
               selection4 = selection4.toUpperCase();
               if (selection4.equals("YES") ) {
               System.out.println("You should make meat and veggie soup.");
               }
               if (selection4.equals("Y") ) {
               System.out.println("You should make meat and veggie soup.");
               }
               if (selection4.equals("NO") ) {
               System.out.println("You should make pot roast.");
               }
               if (selection4.equals("N") ) {
               System.out.println("You should make pot roast.");
               }
            }
            if ( selection3.equals("N") ) {
            System.out.println("Do you have vegetables?");
               String selection4 = one.nextLine();
               selection4 = selection4.toUpperCase();
               if (selection4.equals("YES") ) {
               System.out.println("You should make meat and veggie soup.");
               }
               if (selection4.equals("Y") ) {
               System.out.println("You should make meat and veggie soup.");
               }
               if (selection4.equals("NO") ) {
               System.out.println("You should make pot roast.");
               }
               if (selection4.equals("N") ) {
               System.out.println("You should make pot roast.");
               }
            }
         
         }
   
     
      }
      
      if ( selection1.equals("CHICKEN") ) {
      System.out.println("Do you have whole or pieces?");
         String selection2 = one.nextLine();
         selection2 = selection2.toUpperCase();
         if ( selection2.equals("WHOLE") ) {
         System.out.println("Do you have pasta?");
            String selection3 = one.nextLine();
            selection3 = selection3.toUpperCase();
            if ( selection3.equals("YES") ) {
            System.out.println("You should make chicken pasta casserole.");
            
            }
            if ( selection3.equals("Y") ) {
            System.out.println("You should make chicken pasta casserole.");
            
            }
            if ( selection3.equals("NO") ) {
            System.out.println("Do you have rice?");
               String selection4 = one.nextLine();
               selection4 = selection4.toUpperCase();
               if ( selection4.equals("YES") ) {
               System.out.println("Do you have vegetables?");
                  String selection5 = one.nextLine();
                  selection5 = selection5.toUpperCase();
                  if (selection5.equals("YES") ) {
                  System.out.println("You should make stir fry.");
                  }
                  if (selection5.equals("Y") ) {
                  System.out.println("You should make stir fry.");
                  }
                  if (selection5.equals("NO") ) {
                  System.out.println("You should make chicken rice casserole.");
                  }
                  if (selection5.equals("N") ) {
                  System.out.println("You should make chicken rice casserole.");
                  }
               
               }
               if ( selection4.equals("Y") ) {
               System.out.println("Do you have vegetables?");
                  String selection5 = one.nextLine();
                  selection5 = selection5.toUpperCase();
                  if (selection5.equals("YES") ) {
                  System.out.println("You should make stir fry.");
                  }
                  if (selection5.equals("Y") ) {
                  System.out.println("You should make stir fry.");
                  }
                  if (selection5.equals("NO") ) {
                  System.out.println("You should make chicken rice casserole.");
                  }
                  if (selection5.equals("N") ) {
                  System.out.println("You should make chicken rice casserole.");
                  }
               
               }
               if ( selection4.equals("NO") ) {
               System.out.println("You should make smoked chicken.");
               
               }
               if ( selection4.equals("N") ) {
               System.out.println("You should make smoked chicken.");
               
               }
            
            }
            if ( selection3.equals("N") ) {
            System.out.println("Do you have rice?");
               String selection4 = one.nextLine();
               selection4 = selection4.toUpperCase();
               if ( selection4.equals("YES") ) {
               
               
               }
               if ( selection4.equals("Y") ) {
               
               
               }
               if ( selection4.equals("NO") ) {
               System.out.println("You should make smoked chicken.");
               
               }
               if ( selection4.equals("N") ) {
               System.out.println("You should make smoked chicken.");
               
               }
            
            }
         
         }
         
         if ( selection2.equals("PIECES") ) {
         System.out.println("Do you have vegetables?");
            String selection3 = one.nextLine();
            selection3 = selection3.toUpperCase();
            if (selection3.equals("YES") ) {
            System.out.println("You should make grilled chicken and veggies.");
            }
            if (selection3.equals("Y") ) {
            System.out.println("You should make grilled chicken and veggies.");
            }
            if (selection3.equals("NO") ) {
            System.out.println("Do you have pasta?");
               String selection4 = one.nextLine();
               selection4 = selection4.toUpperCase();
               if (selection4.equals("YES") ) {
               System.out.println("You should make chicken piccata.");
               }
               if (selection4.equals("Y") ) {
               System.out.println("You should make chicken piccata.");
               }
               if (selection4.equals("NO") ) {
               System.out.println("You should make fried chicken.");
               }
               if (selection4.equals("N") ) {
               System.out.println("You should make fried chicken.");
               }
            }
            if (selection3.equals("N") ) {
            System.out.println("Do you have pasta?");
               String selection4 = one.nextLine();
               selection4 = selection4.toUpperCase();
               if (selection4.equals("YES") ) {
               System.out.println("You should make chicken piccata.");
               }
               if (selection4.equals("Y") ) {
               System.out.println("You should make chicken piccata.");
               }
               if (selection4.equals("NO") ) {
               System.out.println("You should make fried chicken.");
               }
               if (selection4.equals("N") ) {
               System.out.println("You should make fried chicken.");
               }
            }
         
         
         }
     
      }
      //
      if ( selection1.equals("OTHER MEAT") ) {
      System.out.println("Do you have eggs?");
         String selection2 = one.nextLine();
         selection2 = selection2.toUpperCase();
         if ( selection2.equals("YES") ) {
         System.out.println("You should make meat and eggs.");
         }
         if ( selection2.equals("Y") ) {
         System.out.println("You should make meat and eggs.");
         }
         if ( selection2.equals("NO") ) {
         System.out.println("Do you have vegetables?");
            String selection3 = one.nextLine();
            selection3 = selection3.toUpperCase();
            if ( selection3.equals("YES") ) {
            System.out.println("You should make meat and veggies.");
            }
            if ( selection3.equals("Y") ) {
            System.out.println("You should make meat and veggies.");
            }
            if ( selection3.equals("NO") ) {
            System.out.println("Do you have pasta?");
               String selection4 = one.nextLine();
               selection4 = selection4.toUpperCase();
               if ( selection4.equals("YES") ) {
               System.out.println("You should make meat and pasta.");
               }
               if ( selection4.equals("Y") ) {
               System.out.println("You should make meat and pasta.");
               }
               if ( selection4.equals("NO") ) {
               System.out.println("You should make just meat!");
               }
               if ( selection4.equals("N") ) {
               System.out.println("You should make just meat!");
               }
            }
            if ( selection3.equals("N") ) {
            System.out.println("Do you have pasta?");
               String selection4 = one.nextLine();
               selection4 = selection4.toUpperCase();
               if ( selection4.equals("YES") ) {
               System.out.println("You should make meat and pasta.");
               }
               if ( selection4.equals("Y") ) {
               System.out.println("You should make meat and pasta.");
               }
               if ( selection4.equals("NO") ) {
               System.out.println("You should make just meat!");
               }
               if ( selection4.equals("N") ) {
               System.out.println("You should make just meat!");
               }
            }
         }
         if ( selection2.equals("N") ) {
         System.out.println("Do you have vegetables?");
            String selection3 = one.nextLine();
            selection3 = selection3.toUpperCase();
            if ( selection3.equals("YES") ) {
            System.out.println("You should make meat and veggies.");
            }
            if ( selection3.equals("Y") ) {
            System.out.println("You should make meat and veggies.");
            }
            if ( selection3.equals("NO") ) {
            System.out.println("Do you have pasta?");
               String selection4 = one.nextLine();
               selection4 = selection4.toUpperCase();
               if ( selection4.equals("YES") ) {
               System.out.println("You should make meat and pasta.");
               }
               if ( selection4.equals("Y") ) {
               System.out.println("You should make meat and pasta.");
               }
               if ( selection4.equals("NO") ) {
               System.out.println("You should make just meat!");
               }
               if ( selection4.equals("N") ) {
               System.out.println("You should make just meat!");
               }
            }
            if ( selection3.equals("N") ) {
            System.out.println("Do you have pasta?");
               String selection4 = one.nextLine();
               selection4 = selection4.toUpperCase();
               if ( selection4.equals("YES") ) {
               System.out.println("You should make meat and pasta.");
               }
               if ( selection4.equals("Y") ) {
               System.out.println("You should make meat and pasta.");
               }
               if ( selection4.equals("NO") ) {
               System.out.println("You should make just meat!");
               }
               if ( selection4.equals("N") ) {
               System.out.println("You should make just meat!");
               }
               
            }
            
         }
     
     
      }

    
    }

    if ( selection.equals("NO") ) {
    System.out.println("Do you have any vegetables?");
      String selection2 = one.nextLine();
      selection2 = selection2.toUpperCase();
      if (selection2.equals("YES") ) {
      System.out.println("Do you have eggplants?");
         String selection3 = one.nextLine();
         selection3 = selection3.toUpperCase();
         if (selection3.equals("YES") ) {
         System.out.println("Do you have tomatoes?");
            String selection4 = one.nextLine();
            selection4 = selection4.toUpperCase();
            if (selection4.equals("YES") ) {
            System.out.println("You should make eggplant parmesan.");
            }
            if (selection4.equals("Y") ) {
            System.out.println("You should make eggplant parmesan.");
            }
            if (selection4.equals("NO") ) {
            System.out.println("You should make roasted eggplant.");
            }
            if (selection4.equals("N") ) {
            System.out.println("You should make roasted eggplant.");
            }
            
         }
         if (selection3.equals("Y") ) {
         System.out.println("Do you have tomatoes?");
            String selection4 = one.nextLine();
            selection4 = selection4.toUpperCase();
            if (selection4.equals("YES") ) {
            System.out.println("You should make eggplant parmesan.");
            }
            if (selection4.equals("Y") ) {
            System.out.println("You should make eggplant parmesan.");
            }
            if (selection4.equals("NO") ) {
            System.out.println("You should make roasted eggplant.");
            }
            if (selection4.equals("N") ) {
            System.out.println("You should make roasted eggplant.");
            }
         }
         if (selection3.equals("NO") ) {
         System.out.println("You should make vegetable soup.");
         }
         if (selection3.equals("N") ) {
         System.out.println("You should make vegetable soup.");
         }
      }
      if (selection2.equals("Y") ) {
      System.out.println("Do you have eggplants?");
         String selection3 = one.nextLine();
         selection3 = selection3.toUpperCase();
         if (selection3.equals("YES") ) {
         System.out.println("Do you have tomatoes?");
            String selection4 = one.nextLine();
            selection4 = selection4.toUpperCase();
            if (selection4.equals("YES") ) {
            System.out.println("You should make eggplant parmesan.");
            }
            if (selection4.equals("Y") ) {
            System.out.println("You should make eggplant parmesan.");
            }
            if (selection4.equals("NO") ) {
            System.out.println("You should make roasted eggplant.");
            }
            if (selection4.equals("N") ) {
            System.out.println("You should make roasted eggplant.");
            }
         }
         if (selection3.equals("Y") ) {
         System.out.println("Do you have tomatoes?");
            String selection4 = one.nextLine();
            selection4 = selection4.toUpperCase();
            if (selection4.equals("YES") ) {
            System.out.println("You should make eggplant parmesan.");
            }
            if (selection4.equals("Y") ) {
            System.out.println("You should make eggplant parmesan.");
            }
            if (selection4.equals("NO") ) {
            System.out.println("You should make roasted eggplant.");
            }
            if (selection4.equals("N") ) {
            System.out.println("You should make roasted eggplant.");
            }
         }
         if (selection3.equals("NO") ) {
         System.out.println("You should make vegetable soup.");
         }
         if (selection3.equals("N") ) {
         System.out.println("You should make vegetable soup.");
         }
      }
      if (selection2.equals("NO") ) {
      System.out.println("Do you have eggs?");
      }
      if (selection2.equals("N") ) {
      System.out.println("Do you have eggs?");
      } 
         
    }
    
    //other no
    if ( selection.equals("N") ) {
    System.out.println("Do you have any vegetables?");
      String selection2 = one.nextLine();
      selection2 = selection2.toUpperCase();
      if (selection2.equals("YES") ) {
      System.out.println("Do you have eggplants?");
         String selection3 = one.nextLine();
         selection3 = selection3.toUpperCase();
         if (selection3.equals("YES") ) {
         System.out.println("Do you have tomatoes?");
            String selection4 = one.nextLine();
            selection4 = selection4.toUpperCase();
            if (selection4.equals("YES") ) {
            System.out.println("You should make eggplant parmesan.");
            }
            if (selection4.equals("Y") ) {
            System.out.println("You should make eggplant parmesan.");
            }
            if (selection4.equals("NO") ) {
            System.out.println("You should make roasted eggplant.");
            }
            if (selection4.equals("N") ) {
            System.out.println("You should make roasted eggplant.");
            }
         }
         if (selection3.equals("Y") ) {
         System.out.println("Do you have tomatoes?");
            String selection4 = one.nextLine();
            selection4 = selection4.toUpperCase();
            if (selection4.equals("YES") ) {
            System.out.println("You should make eggplant parmesan.");
            }
            if (selection4.equals("Y") ) {
            System.out.println("You should make eggplant parmesan.");
            }
            if (selection4.equals("NO") ) {
            System.out.println("You should make roasted eggplant.");
            }
            if (selection4.equals("N") ) {
            System.out.println("You should make roasted eggplant.");
            }
         }
         if (selection3.equals("NO") ) {
         System.out.println("You should make vegetable soup.");
         }
         if (selection3.equals("N") ) {
         System.out.println("You should make vegetable soup.");
         }
      }
      if (selection2.equals("Y") ) {
      System.out.println("Do you have eggplants?");
         String selection3 = one.nextLine();
         selection3 = selection3.toUpperCase();
         if (selection3.equals("YES") ) {
         System.out.println("Do you have tomatoes?");
            String selection4 = one.nextLine();
            selection4 = selection4.toUpperCase();
            if (selection4.equals("YES") ) {
            System.out.println("You should make eggplant parmesan.");
            }
            if (selection4.equals("Y") ) {
            System.out.println("You should make eggplant parmesan.");
            }
            if (selection4.equals("NO") ) {
            System.out.println("You should make roasted eggplant.");
            }
            if (selection4.equals("N") ) {
            System.out.println("You should make roasted eggplant.");
            }
         }
         if (selection3.equals("Y") ) {
         System.out.println("Do you have tomatoes?");
         String selection4 = one.nextLine();
            selection4 = selection4.toUpperCase();
            if (selection4.equals("YES") ) {
            System.out.println("You should make eggplant parmesan.");
            }
            if (selection4.equals("Y") ) {
            System.out.println("You should make eggplant parmesan.");
            }
            if (selection4.equals("NO") ) {
            System.out.println("You should make roasted eggplant.");
            }
            if (selection4.equals("N") ) {
            System.out.println("You should make roasted eggplant.");
            }
         }
         if (selection3.equals("NO") ) {
         System.out.println("You should make vegetable soup.");
         }
         if (selection3.equals("N") ) {
         System.out.println("You should make vegetable soup.");
         }
      }
      if (selection2.equals("NO") ) {
      System.out.println("Do you have eggs?");
      }
      if (selection2.equals("N") ) {
      System.out.println("Do you have eggs?");
      }
    
    }

   
  }
}