import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
/**
* This program accepts coded ticket information as input that includes the
* price, discount, time, date, section, row, seat, followed by the description.
* It pulls out the information as substrings, and then formats the various
* information and prints it in a neat and ordered array. A random number
* generator is used to generate a completely random prize number that is
* displayed alongside the other information each time the program is executed.
* 
* @author Caleb Johnson - COMP1210.
* @version 9/10/20.
*/
public class TicketCode {

   /**
   * Converts ticket code input into all the necessary information about the
   * show that the ticket is for. All info, along with a randomly generated
   * prize number, are printed in an array for easy viewing.
   *
   * @param args Command line arguments - not used.
   */
   public static void main(String[] args) {
      // creates Scanner to accept userInput:
      Scanner userInput = new Scanner(System.in);
      // creates DF for price and cost:
      DecimalFormat pf = new DecimalFormat("$#,##0.00");
      // creates DF for discount:
      DecimalFormat df = new DecimalFormat("0%");
      // creates DF for prize:
      DecimalFormat prizeF = new DecimalFormat("000");
      // creates Random generator for prize #:
      Random gen = new Random();
      
      // creates variables:
      String ticketCode, hour, minute, month, day, year, section, row,
         seat, description;
      double price, discount, dCost, cost;
      int prize;
         
      // prompts user to enter 26 char ticket code:
      System.out.print("Enter ticket code: ");
      ticketCode = userInput.nextLine().trim();
      
      if (ticketCode.length() < 26) { // invalid input if less than 26 char:
         // prints error message if input is invalid:
         System.out.println("\nInvalid ticket code."
            + "\nTicket code must have at least 26 characters.");
      }
      
      else { // valid input:
         // pulls price from ticket and converts to double:
         price = Double.parseDouble(ticketCode.substring(0, 5)) / 100;
         // pulls discount from ticket and converts to double:
         discount = Double.parseDouble(ticketCode.substring(5, 7)) * 0.01;
         // calculates actual cost from price and discount:
         dCost = (price * (discount));
         cost = price - dCost;
         // pulls time from ticket and converts to substrings: 
         hour = ticketCode.substring(7, 9);
         minute = ticketCode.substring(9, 11);
         // pulls date from ticket and converts to substrings:
         month = ticketCode.substring(11, 13);
         day = ticketCode.substring(13, 15);
         year = ticketCode.substring(15, 19);
         // pulls section, row, and seat from ticket and converts to substring:
         section = ticketCode.substring(19, 21);
         row = ticketCode.substring(21, 23);
         seat = ticketCode.substring(23, 25);
         // pulls description from ticket and converts to a substring:
         description = ticketCode.substring(25, (ticketCode.length()));
         // generates a prize number between 1 - 999:
         prize = (int) gen.nextInt(999);
         
         // prints all calculated and converted data in an array.
         
         // prints line 1:
         System.out.println("\nDescription: " + description
            + "   Date: " + month + "/" + day + "/" + year
            + "   Time: " + hour + ":" + minute);
         // prints line 2:
         System.out.println("Section: " + section
            + "   Row: " + row
            + "   Seat: " + seat);
         // prints line 3:
         System.out.println("Price: " + pf.format(price)
            + "   Discount: " + df.format(discount)
            + "   Cost: " + pf.format(cost));
         // prints line 4:
         System.out.println("Prize Number: " + prizeF.format(prize));
      }
      
   }
}
