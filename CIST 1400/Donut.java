// Name : Godwin Djossou
// Class : CIST 1400-004
// Colleagues : NAME/EMAIL OF ANYONE YOU WORKED WITH, INCLUDING TUTORS 
// Resources : SUFFICIENT INFORMATION AND CREDIT GIVEN TO ANY RESOURCES USED


public class Donut
{
    public static void main(String[] args)
    {
        
        /****** 
         * for now, we'll use our own value of PI (we'll learn about a built-in version later
         * this semester), so declare a variable to store PI and use the exact value listed in
         * the lab document. Declare the variable so that its value cannot change (i.e., make it
         * a constant/final variable.
         */
        final double pi = 3.1415926535;
        
        /****** 
         * declare double variables for major radius, minor radius, and number of donuts
         */
        double majorRadius = 2.75;
        double minorRadius = 0.3;
        int numberofDonuts = 13;
        
          
        /****** 
         *  declare a variable to store the volume of a single donut
         */
        double volumeofSingle;
         
        /****** 
         * declare a variable to store the volume of all of the donuts
         */
         
         double volumeofAll;
        /****** 
         * assign values to the major radius, minor radius, and number of donuts based on 
         * the values in the lab assignment document
         */
         
        
        
        /****** 
         * Compute the volume of a single donut into the previously declared variable
         */
         
        volumeofSingle = pi*minorRadius*minorRadius*2*pi*majorRadius;


        /****** 
         * Compute the volume of all of the donuts into the previously declared variable
         */
        volumeofAll = 13*pi*minorRadius*minorRadius*2*pi*majorRadius;
         
        /****** 
         * Print the required information as outlined in the lab document.
         * Make sure your output looks like the output in the assignment sheet, as this is how Web-CAT
         * will need to interpret the output.
         */
         System.out.println("A single donut with the major radius " +majorRadius+ " and and minor radius " +minorRadius+ " \n has a volume of " +volumeofSingle+ " while all the donuts have a volume of " +volumeofAll);
         
        
    }
}
