// Name : Godwin Djossou
// Class : CIST 1400-004
// Colleagues : NAME/EMAIL OF ANYONE YOU WORKED WITH, INCLUDING TUTORS 
// Resources : Canvas Document

import java.util.Random;
public class Die {

   private final int MIN_FACES = 4;
   private int numFaces;
   private int faceValue;
   
   public Die () {
      this.numFaces = 6;
      this.faceValue = 1;
   
   }
   
   public Die(int faces) {
      this.faceValue = 1;
      if (faces >= MIN_FACES)
      {
         this.setNumFaces(faces);
      }
      else
      {
         this.numFaces = 6;
      }
   }
   
   public int getNumFaces() {
      return this.numFaces;
   }
   
   public int getFaceValue() {
      return this.faceValue;
   }
   
   public void setNumFaces(int nfaces) {
      if (nfaces >= MIN_FACES)
      {
         this.numFaces = nfaces;
         if (faceValue >= 1 && faceValue <= numFaces)
         {
            this.faceValue = this.faceValue;   
         }
         else
         {
            this.faceValue = 1;
         }
      }
   }
   
   public void setFaceValue(int fvalue) {
      if (fvalue >= 1 && fvalue <= numFaces)
      {
         this.faceValue = fvalue;
      }
   }
   
   public int roll() {
      Random one = new Random();
      int two = 1 + one.nextInt(numFaces);
      this.faceValue = two;
      
      return two;
   }
   
   @Override
   public String toString() {
      return String.format("Die has %d sides and current value is %d", this.getNumFaces(), this.getFaceValue());
   }

   @Override
   public boolean equals(Object one) {
      boolean result = false;
      if (one instanceof Die)
      {
         Die three = (Die) one;
         if (
            this.getNumFaces() == three.getNumFaces()
            &&
            this.getFaceValue() == three.getFaceValue()
            )
            {
               result = true;
            }  
         
      }
      return result;
   
   
   
   
   
   
   
   }








}