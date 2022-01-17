// Name : Godwin Djossou
// Class : CIST 1400-004
// Colleagues : NAME/EMAIL OF ANYONE YOU WORKED WITH, INCLUDING TUTORS 
// Resources : Canvas Document
import java.util.Arrays;

public class GroceryList {

   private int count;
   private Item[] list;
   private static final int MAX = 30;
   
   public GroceryList() {
      this.count = 0;
      this.list = new Item[MAX];
   }
   
   public GroceryList(Item[] source) {
      this.count = 0;
      this.list = new Item[MAX];
      for (int i = 0; i < source.length; i++) 
      {
         if (source[i] != null)
         {
            list[count] = source[i];
            count++;
         }
      }
   }
   
   public int getCount() {
      return this.count;
   }
   
   public void addItem(Item m) {
      if (count < MAX) 
      {
         this.list[count] = m;
         count++;
      } 
   }
   
   public void deleteItem(int p) {
      
      if (p >= 1 && p <= count && count > 0)
      {
         for (int i = p - 1; i < count - 1; i++) 
         {
            list[i] = list[i + 1];
         }
         count--; 
      
      }

   }
   
   public Item[] sortName() {
      //Item one;
      //Item [] two;
      //two = new Item[MAX];
      Item[] one = new Item[this.count];
      for (int pos = 0; pos < this.count; pos++) 
      {
         one[pos] = list[pos];
      }
      
      
      
      if (count > 0) 
      {
         for (int p = 0; p < one.length - 1; p++) 
         {
            for (int i = 0; i < one.length - 1 - p; i++) 
            {
               if (one[i].getItem().compareTo(one[i + 1].getItem()) > 0) 
               {
                  Item two = one[i];
                  one[i] = one[i + 1];
                  one[i + 1] = two;
               }
            }
         }
      }
      return one;
   }



   public Item getItem(int pos) {
      if (pos >= 0 && pos < count)
      {
         
         return list[pos];
      }
      else
      {
         return null;
      }
   }
   
   public Item[] sortQuant() {
      //Item one;
      Item[] one = new Item[this.count];
      for (int pos = 0; pos < this.count; pos++) 
      {
         one[pos] = list[pos];
      }
      
      if (count > 0) 
      {
         for (int p = 0; p < one.length - 1; p++) 
         {
            for (int i = 0; i < one.length - 1 - p; i++) 
            {
               if (one[i].getQuantity() < one[i + 1].getQuantity()) 
               {
                  Item two = one[i];
                  one[i] = one[i + 1];
                  one[i + 1] = two;
               }
            }
         }
      }
      return one;
   }
   
   @Override
   public String toString() {
      String str = "";

      for (int a = 0; a < count; a++)
      {
         str += ((a + 1) + ". " + list[a].toString() + "\n");
      }
  
      return str;
   }
   
   @Override
   public boolean equals(Object o) {
      boolean result = false;
      if (o instanceof GroceryList) 
      {
         GroceryList two = (GroceryList) o;
         if (this.getCount() == two.getCount() 
            &&
            Arrays.equals(this.sortName(), two.sortName())
         ) 
         {
            result = true;
         }
      
      }
      return result;
   }




}