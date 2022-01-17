// Name : Godwin Djossou
// Class : CIST 1400-004
// Colleagues : NAME/EMAIL OF ANYONE YOU WORKED WITH, INCLUDING TUTORS 
// Resources : Canvas Document

public class Pedometer {

   private int steps;
   private double strideLength;
   private final int feetpermile = 5280;
   private final double feetperkm = 3280.84;
   
   public Pedometer() {
      this.steps = 0;
      this.strideLength = 0;
   }

   public Pedometer(int s) {
      this.setSteps(s);
   }
   
   public Pedometer(int s, double sl) {
      this.setSteps(s);
      this.setStrideLength(sl);
   }
   
   public int getSteps() {
      return this.steps;
   }
   
   public double getStrideLength() {
      return this.strideLength;
   }
   
   public void setSteps(int s) {
      if (s >= 0) 
      {
         this.steps = s;
      }
   }
   
   public void setStrideLength(double sl) 
   {
      if (sl > 0) 
      {
         this.strideLength = sl;
      }
   }
   
   public void step() 
   {
      steps++;
   }

   public void addSteps(int moreSteps) 
   {
      if (moreSteps > 0) 
      {
         this.steps = this.steps + moreSteps;
      }
   }
   
   public double caloriesBurned(double weight) 
   {
      double x = 0.0;
      if (weight <= 0) 
      {
         x = steps * 0;
      }
      if (weight > 0 && weight <= 150) 
      {
         x = steps * 0.05;
      }
      if (weight > 150 && weight <= 200) 
      {
         x = steps * 0.10;
      }
      if (weight > 200 && weight <= 250) 
      {
         x = steps * 0.17;
      }
      if (weight > 250 && weight <= 300) 
      {
         x = steps * 0.23;
      }
      if (weight > 300 && weight <= 350) 
      {
         x = steps * 0.31;
      }
      if (weight > 350) 
      {
         x = steps * 0.51;
      }
      return x;
      
   } 
   
   public void reset() {
      this.steps = 0;
   }
   
   public double miles() {
      double m = (steps * strideLength) / feetpermile;
      return m;
   }

   public double kilometers() {
      double k = (steps * strideLength) / feetperkm;
      return k;
   }


   @Override
   public String toString() {
      return String.format("%d steps / %.3f stride length", this.getSteps(), this.getStrideLength());
   }

   @Override
   public boolean equals(Object one) {
      boolean result = false;
      if (one instanceof Pedometer) 
      {
         Pedometer two = (Pedometer) one;
         if (this.getSteps() == two.getSteps() 
            &&
            this.getStrideLength() == two.getStrideLength()
         ) 
         {
            result = true;
         }
      
      }
      return result;
   }



}