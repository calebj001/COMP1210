import java.util.Scanner;
import java.text.DecimalFormat;
/**
* This program solves a complex math formula with user input and determines
* the number of characters before and after the decimal point by invoking
* String methods. It also re-formats the result to display no more than 6
* digits after the decimal point, and each group of 3 digits is separated by
* a comma in the traditional way.
* 
* @author Caleb Johnson - COMP1210.
* @version 9/9/20.
*/
public class FormulaSolver {

   /**
   * Solves the complex expression by using user input to define 'x'.
   * Displays # of characters to the left and right of the decimal point.
   * Displays formatted result (<= 6 digits after decimal point and commas
   * separating groups of 3 numbers before decimal point).
   *
   * @param args Command line arguments - not used.
   */
   public static void main(String[] args) {
      // creates new Scanner to accept user input:
      Scanner userInput = new Scanner(System.in);
      
      // creates variables:
      double x;
      double result;
   
      // prompts user to input a value for x:
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
   
      // solves equation, assigns value to result, and prints the value:
      result = (((6 * (Math.pow(x, 3))) - 4) * (Math.sqrt(Math.abs((7 
                                                                     * Math.pow(x, 3)) + (5 * Math.pow(x, 2)) + (3 * x) + 1))));
      System.out.println("Result: " + result);
      
      // stores result as a String variable:
      String sResult = Double.toString(result);
      
      // displays # of char's before and after the decimal:
      System.out.println("# of characters to left of decimal point: "
                        + sResult.indexOf('.'));
      System.out.println("# of characters to right of decimal point: "
                        + ((sResult.length() - sResult.indexOf('.')) - 1));
      
      // creates new DecimalFormat to format sResult:
      DecimalFormat df = new DecimalFormat("#,##0.0#####");
      
      // prints formatted result:
      System.out.println("Formatted Result: " + df.format(result));
   
      
   }
}