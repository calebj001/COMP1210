import java.util.Scanner;
/**
*
* Program accepts user input as a String object "message". It then converts
* this "message" into various other versions of the original input
* (as selected by the user) and prints the converted text at the end.
* 
* @author Caleb Johnson - COMP1210.
* @version 9/8/20.
*/
public class MessageConverter {

   /**
   * Converts user input into other versions of that same input
   * and prints it at the end.
   *
   * @param args Command line arguments - not used.
   */
   public static void main(String[] args) {
   
      // scanner created to accept user input:
      Scanner userInput = new Scanner(System.in);
      
      // variables created:
      String message = "";
      int outputType;
      String result = "";
      
      // prompts user to input message they would like to be converted:
      System.out.print("Type in a message and press enter:\n\t> ");
      message = userInput.nextLine();
      
      // prompts user to select conversion type with an integer value:
      System.out.print("\nOutput types:"
         + "\n\t0: As is"
         + "\n\t1: Trimmed"
         + "\n\t2: lower case"
         + "\n\t3: UPPER CASE"
         + "\n\t4: v_w_ls r_pl_c_d"
         + "\n\t5: Without first and last character"
         + "\nEnter your choice: ");
      
      outputType = Integer.parseInt(userInput.nextLine());
      
      if (outputType == 0) { // as is
         // leaves as is
         result = message;
         
         // prints unchanged string:
         System.out.println("\n" + result);
      }
      
      else if (outputType == 1) { // trimmed
         // trims any leading or trailing whitespace
         result = message.trim();
         
         // prints converted string:
         System.out.println("\n" + result);
      }
      
      else if (outputType == 2) { // lower case
         // converts to all lower case:
         result = message.toLowerCase();
         
         // prints converted string:
         System.out.println("\n" + result);
      }
      
      else if (outputType == 3) { // UPPER CASE
         // converts to all upper case:
         result = message.toUpperCase();
         
         // prints converted string:
         System.out.println("\n" + result);
      }
      
      else if (outputType == 4) { // replace vowels
         // replaces lower case vowels:
         result = message.replace('a', '_');
         result = result.replace('e', '_');
         result = result.replace('i', '_');
         result = result.replace('o', '_');
         result = result.replace('u', '_');
         
         // replaces upper case vowels:
         result = result.replace('A', '_');
         result = result.replace('E', '_');
         result = result.replace('I', '_');
         result = result.replace('O', '_');
         result = result.replace('U', '_');
         
         // prints converted string:
         System.out.println("\n" + result);
      }
      
      else if (outputType == 5) { // without first and last char.
         // removes first and last char of string:
         result = message.substring(1, message.length() - 1);
         
         // prints converted string:
         System.out.println("\n" + result);
      }
      
      else { // invalid input
         // prints error message for invalid input:
         System.out.println("\nError: Invalid choice input.");
      }
   }
   
}