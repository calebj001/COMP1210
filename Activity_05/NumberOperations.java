/**
*
*
* @author Caleb Johnson - COMP 1210
* @version 9/21/20
*/
public class NumberOperations {
   
   // Fields - instance variables:
   
   private int number;
   
   // Constructor:
   /**
   * @param numberIn Defines the number input
   */
   public NumberOperations(int numberIn) {
   
      number = numberIn;
   }
   
   // Methods:
   
   /**
   * @return returns number value
   */
   public int getValue() {
   
      
      return number; // calls number value
   }
   
   /**
   * @return Returns a string
   */
   public String oddsUnder() {
   
      String output = "";
      int i = 0;
      
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output; // returns odd numbers < initial number
   }
   
   /**
   * @return Returns a string
   */
   public String powersTwoUnder() {
      
      String output = "";
      int powers = 1;
      
      while (powers < number) {
         output += powers + "\t";
         powers = powers * 2;  
      }
      return output; // returns numbers that are mults of 2 < initial number
   }
   
   /**
   * @param compareNumber compares numbers
   * @return Returns an int
   */
   public int isGreater(int compareNumber) {
   
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      }
   }
   
   /**
   * @return Returns a string
   */
   public String toString() {
   
      return number + " "; // returns number followed by whitespace
   }
}