import java.util.Scanner;
   /**
   *
   * Gets user input of their name, age, and gender using the Scanner class.
   * Program uses input to calculate age in minutes and centuries.
   * It also calculates max heart rate based on age and gender.
   *
   * Activity_02 AgeStatistics.
   * @author Caleb Johnson - COMP1210.
   * @version 8/29/20
   */
public class AgeStatistics {

   /**
   * Converts user input into calculated ages and max heart rate.
   * @param args Command line arguments - not used.
   */
   public static void main(String[] args) {
   
      // Defines variables:
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
      
      // Prompts user for their name:
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
      
      // Prompts user for their age:
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      
      // Prompts user for their biological gender:
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt();
      
      // Converts age to minutes:
      System.out.println("\tYour age in minutes is "
         + ageInYears * 525600 + " minutes.");
         
      // Converts age to centuries:
      System.out.println("\tYour age in centuries is "
         + (double) ageInYears / 100 + " centuries.");
      
      // Displays max heart rate:
      System.out.print("Your max heart rate is ");
      
      // Calculates max BPM if female:
      if (gender == 1) { 
         maxHeartRate = 209 - (0.7 * ageInYears);
      }
      // Calculates max BPM if male:
      else {
         maxHeartRate = 214 - (0.8 * ageInYears);
      }
      System.out.println(maxHeartRate + " beats per minute.");
   }
}