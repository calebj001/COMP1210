/**
* This class contains static methods for division funtions that return int
* and double values.
*
* @author Caleb Johnson - COMP1210
* @version 11/17/20
*/
public class Division
{
   /**
   * Divides numerator by denominator and returns an int value.
   * @param num for numerator
   * @param denom for denominator
   * @return int for num / denom
   */
   public static int intDivide(int num, int denom)
   {
      try
      {
         return num / denom;
      }
      catch (ArithmeticException e)
      {
         return 0;
      }
   }
   
   /**
   * Divides numerator by denominator and returns a double value.
   * @param num for numerator
   * @param denom for denominator
   * @return double for num / denom
   * @throws IllegalArgumentException if denom = 0
   */
   public static double decimalDivide(int num, int denom)
   {
      if (denom == 0)
      {
         throw new IllegalArgumentException("The denominator "
                              + "cannot be zero.");
      }
      try
      {
         return ((double) num / denom);
      }
      catch (ArithmeticException e)
      {
         return Double.POSITIVE_INFINITY;
      }
   }
}