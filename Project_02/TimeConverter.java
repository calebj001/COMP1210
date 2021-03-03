import java.util.Scanner;
/**
* User inputs a total raw time in seconds, which the program uses to calculate
* and display the combined time in days, hours, minutes, and remaining seconds.
* 
* @author Caleb Johnson - COMP1210.
* @version 9/4/20.
*/
public class TimeConverter {

   /**
   * Calculates and displays combined raw time in days, hours, 
   * minutes, and seconds.
   *
   * @param args Command line arguments - not used.
   */
   public static void main(String[] args) {
   
      // Scanner created to accept user input:
      Scanner userInput = new Scanner(System.in);
      
      // Variables created:
      int rawTime;
      int days;
      int hours;
      int minutes;
      int seconds;
      
      // Prompts user to enter raw time in seconds:
      System.out.print("Enter the raw time measurement"
         + " in seconds: ");
      rawTime = userInput.nextInt();
      
      // Corrects user if input is negative:
      if (rawTime < 0) {
         System.out.println("Measurement must be non-negative!");
      }
      
      else {
         // Calculates combined days, hours, minutes, and seconds:
         days = rawTime / 86400;
         hours = (rawTime % 86400) / 3600;
         minutes = ((rawTime % 86400) % 3600) / 60;
         seconds = rawTime % 60;
         
         // Displays each calculated time measurement:
         System.out.println("\nMeasurement by combined days, hours, minutes,"
            + " seconds:");
         System.out.println("\tdays: " + days);
         System.out.println("\thours: " + hours);
         System.out.println("\tminutes: " + minutes);
         System.out.println("\tseconds: " + seconds);
         
         // Displays combined time measurements:
         System.out.println("\n" + rawTime + " seconds = " + days + " days, "
            + hours + " hours, " + minutes + " minutes, " + seconds
            + " seconds");
      }
   }
   
}