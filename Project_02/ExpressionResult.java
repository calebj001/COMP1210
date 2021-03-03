import java.util.Scanner;
/**
*
* Program prompts user to define variables 'x', 'y', and 'z'.
* Variable values are used to solve a slightly complex function,
* and the calculated result is displayed at the end.
* 
* @author Caleb Johnson - COMP1210.
* @version 9/2/20.
*/
public class ExpressionResult {

   /**
   * Program uses user input to solve an equation.
   * An if-else statement is used to determine if the answer is undefined.
   * @param args Command line arguments - not used.
   */
   public static void main(String[] args) {
   
      // Scanner created to accept user input:
      Scanner userInput = new Scanner(System.in);
      
      // Variables created:
      double x;
      double y;
      double z;
      double result;
      
      // Equation printed and user is prompted to add values to variables:
      System.out.println("result = (x - 1.1) (2y + 2.2) (4z + 4.4)"
         + " / xyz");
      System.out.print("\tx = ");
      x = userInput.nextDouble();
      System.out.print("\ty = ");
      y = userInput.nextDouble();
      System.out.print("\tz = ");
      z = userInput.nextDouble();
      
      // Displays the result as "undefined" if denominator = 0:
      if ((x * y * z) == 0) {
         System.out.println("result is \"undefined\""); 
      }
      // Calculates and displays the solution to the equation:
      else  {
         result = (((x - 1.1) * (2 * y + 2.2) * (4 * z + 4.4))
            / (x * y * z));
         System.out.println("result = " + result);
      }  
   }
}