import java.util.ArrayList;
/**
*
* Creates an ArrayList of temperatures and has methods to access lowest,
* highest, lowest min., and highest max. temperatures.
*
* @author Caleb Johnson - COMP1210.
* @version 9/29/20.
*/
public class Temperatures
{
      // Fields - instance variables:

   private ArrayList<Integer> temperatures;
   
      // Construtor:

   /**
   * @param temperaturesIn for temp input
   */
   public Temperatures(ArrayList<Integer> temperaturesIn)
   {
      temperatures = temperaturesIn;
   }
   
      // Methods:
      
      /**
      * @return lowest temp
      */
   public int getLowTemp()
   {
      if (temperatures.isEmpty())
      {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++)
      {
         if (temperatures.get(i) < low)
         {
            low = temperatures.get(i);
         }
      }
      return low;
   }
      
      /**
      * @return highest temp
      */
   public int getHighTemp()
   {
      if (temperatures.isEmpty())
      {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp : temperatures)
      {
         if (temp > high)
         {
            high = temp;
         }
      }
      return high;
   }
      
      /**
      * @param lowIn for low temp
      * @return lowest minimum temp
      */
   public int lowerMinimum(int lowIn)
   {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
      
      /**
      * @param highIn for high temp
      * @return highest max temp
      */
   public int higherMaximum(int highIn)
   {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
      
      /**
      * @return String output
      */
   public String toString()
   {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }
}