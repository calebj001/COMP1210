import javax.swing.JOptionPane;
/**
* Driver class for Division.java that takes user input from JOptionPane
* and returns the divided value. Also contains the exception handling in case
* user enters an invalid parameter.
*
* @author Caleb Johnson - COMP1210
* @version 11/17/20
*/
public class DivisionDriver
{
   /**
   * Main method that acts as the driver for the Division class.
   * @param args Command Line Arguments - not used.
   */
   public static void main(String[] args)
   {
      String numInput
         = JOptionPane.showInputDialog("Enter the numerator:");
      String denomInput
         = JOptionPane.showInputDialog("Enter the denominator:");
         
      try
      {
         int num = Integer.parseInt(numInput);
         int denom = Integer.parseInt(denomInput);
         
         String result = "Integer division: \n"
            + Division.intDivide(num, denom)
            + "\n\nFloating point division: \n"
            + Division.decimalDivide(num, denom);
         
         JOptionPane.showMessageDialog(null, result,
                              "Result", JOptionPane.PLAIN_MESSAGE);
      }
      catch (NumberFormatException e)
      {
         JOptionPane.showMessageDialog(null,
                              "Invalid input: enter numerical integer values "
                              + "only.",
                              "Error", JOptionPane.ERROR_MESSAGE);
      }
      catch (IllegalArgumentException e)
      {
         JOptionPane.showMessageDialog(null, e,
                              "Error", JOptionPane.ERROR_MESSAGE);
      }
   }
}