// Name : Godwin Djossou
// Class : CIST 1400-004
// Colleagues : NAME/EMAIL OF ANYONE YOU WORKED WITH, INCLUDING TUTORS 
// Resources : Canvas Document

public class Item {

   private String item;
   private int quantity;
   private static final int MIN = 1;
   private static final int MAX = 20;
   
   public Item() {
      this.item = "none";
      this.quantity = MIN;
   }
    
   public Item(String n, int q) {
      if (n.length() > 0)
      {
         this.item = n;
      }
      else
      {
         this.item = "none";  
      }
       
      if (q >= MIN && q <= MAX) 
      {
         this.quantity = q;
      }
      else
      {
         this.quantity = MIN;  
      }
   }
    
   public String getItem() {
      return this.item;
   }
    
   public int getQuantity() {
      return this.quantity;
   }
    
   public void increaseQuant() {
      if (quantity < MAX) 
      {
         this.quantity += 1;
      }
   }
    
   public void setItem(String n) {
      if (n.length() > 0)
      {
         this.item = n;
      }
   }
    
   public void setQuantity(int q) {
      if (q >= MIN && q <= MAX)
      {
         this.quantity = q;
      }
   }
    
   @Override
    public String toString() {
      return String.format(this.item + " : " + this.quantity);
   }
    
   @Override
   public boolean equals(Object o) {
      boolean result = false;
      if (o instanceof Item) 
      {
         Item two = (Item) o;
         if (this.getQuantity() == two.getQuantity() 
            &&
            this.getItem().toLowerCase().equals(two.getItem().toLowerCase())
         ) 
         {
            result = true;
         }
      
      }
      return result;
   }










}