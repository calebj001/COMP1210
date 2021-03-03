/**
* Description.
*
* @author Caleb Johnson - COMP1210
* @version 10/26/20
*/
public class Scores
{
   // instance variables
   
   private int[] numbers;
   
   // constructor
   
   /**
   * Creates and Array of element type int.
   * @param numbersIn for Array of numbers
   */
   public Scores(int[] numbersIn)
   {
      numbers = numbersIn;
   }
   
   // methods
   
   /**
   * Uses Scores[] to create an Array of the even ints.
   * @return evens for Array of even numbers in Array
   */
   public int[] findEvens()
   {
      int numberEvens = 0;
      for (int i = 0; i < numbers.length; i++)
      {
         if (numbers[i] % 2 == 0)
         {
            numberEvens++;
         }
      }
      int[] evens = new int[numberEvens];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++)
      {
         if (numbers[i] % 2 == 0)
         {
            evens[count] = numbers[i];
            count++;
         }
      }
      return evens;
   }
   
    /**
    * Uses Scores[] to create an Array of the odd ints.
    * @return odds for Array of odd numbers in Array
    */
   public int[] findOdds()
   {
      int numberOdds = 0;
      
      for (int i = 0; i < numbers.length; i++)
      {
         if (numbers[i] % 2 != 0)
         {
            numberOdds++;
         }
      }
      
      int[] odds = new int[numberOdds];
      
      int count = 0;
      
      for (int i = 0; i < numbers.length; i++)
      {
         if (numbers[i] % 2 != 0)
         {
            odds[count] = numbers[i];
            count++;
         }
      }
      return odds;
   }
   
   /**
   * Calculates the average double value of the Scores[].
   * @return avg for average value of Array
   */
   public double calculateAverage()
   {
      int sum = 0;
      
      for (int i = 0; i < numbers.length; i++)
      {
         sum += numbers[i];
      }
      return (double) sum / (double) numbers.length;
   }
   
   /**
   * Returns the Array as a String.
   * @return result for Array as a String
   */
   public String toString()
   {
      String result = "";
      
      for (int i = 0; i < numbers.length; i++)
      {
         result += numbers[i] + "\t";
      }
      return result;
   }
   
   /**
   * Returns the reversed Array as a String.
   * @return result for reversed Array as a String
   */
   public String toStringInReverse()
   {
      String result = "";
      
      for (int i = numbers.length - 1; i >= 0; i--)
      {
         result += numbers[i] + "\t";
      }
      return result;
   }
}