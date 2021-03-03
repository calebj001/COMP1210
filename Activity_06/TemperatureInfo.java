import java.util.ArrayList;
import java.util.Scanner;
/**
*
* Program uses the Temperatures class to create the ArrayList of temperatures.
* This also allows the user to type various characters to access different
* values in the list.
*
* @author Caleb Johnson - COMP1210.
* @version 9/29/20.
*/
public class TemperatureInfo
{
   /**
   * Creates an ArrayList of user input temps using Temperatures class.
   * User navigates ArrayList with char inputs.
   *
   * @param args Command line arguments - not used.
   */
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      
      ArrayList<Integer> tempsList = new ArrayList<Integer>();
      
      String tempInput = "";
      do
      {
         System.out.print("Enter a temperature (or nothing to end list: ");
         tempInput = userInput.nextLine().trim();
         if (!tempInput.equals("")) 
         {
            tempsList.add(Integer.parseInt(tempInput));
         }
      } while (!tempInput.equals(""));
      
      Temperatures temps = new Temperatures(tempsList);
      
      char choice = 'E';
      do
      {
         System.out.print("Enter choice - "
            + "[L]ow temp, [H]igh temp, [P]rint, [E]nds: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice)
         {
            case 'L':
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
               
            case 'H':
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
               
            case 'P':
               System.out.println(temps);
               break;
               
            case 'E':
               System.out.println("\tDone");
               break;
               
            default:
               System.out.println("\tInvalid choice!");
         }
      } while (choice != 'E');
   }
}