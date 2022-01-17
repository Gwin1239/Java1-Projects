// Name : Godwin Djossou
// Class : CIST1400-004   Lab Section
// Colleagues : NAME/EMAIL OF ANYONE YOU WORKED WITH, INCLUDING TUTORS
// Resources : SUFFICIENT INFORMATION AND CREDIT GIVEN TO ANY RESOURCES
//                BEYOND THOSE DIRECTLY PROVIDED BY YOUR INSTRUCTOR.

// The purpose of this program is to determine amount of fence needed
public class Fence
{
    public static void main(String[] args)
    {
        // declare variables
        
        // ***** gate required every how many feet and this value DOES NOT CHANGE
        final int gate = 150;
        
        // ***** declare variables for length, width, and house width;
         int yardLength;
         int yardWidth;
         int houseWidth;
         
        // ***** declare total number of feet needed and total number of yards needed;
         int totalFeet = 440;
         double totalYards = 440/3.0;
         
        // ***** declare variable for amount of fence needed
        double fenceYards;
         
        // ***** fill in values for the yard's dimensions
        yardLength = 100;
        yardWidth = 120;
        houseWidth = 75;
        // ***** Compute the total perimeter (in feet) to be fenced
       
        int totalPerimeter = totalFeet-houseWidth;
        

        // ***** Compute the amount of fence needed in yards
        
        fenceYards = totalPerimeter/3.0;
                  
        // ***** Print the dimensions of the yard and house and the amount of fence needed
        
       System.out.println("A yard that is " +yardLength+ " feet long and " +yardWidth+ " feet wide with a house that is " +houseWidth+ " feet wide has " +totalPerimeter+ " feet to cover and requires " +fenceYards+ " yards of fence.");
        
        // ******* Print the number of gates required.
      System.out.println("You will need to have 2 gates.");
        
    }
}

