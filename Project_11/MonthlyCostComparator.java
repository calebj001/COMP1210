import java.util.Comparator;
/**
* This class orders database objects in order of highest ot lowest cost
* using the Comparator interface.
*
* @author Caleb Johnson - COMP1210
* @version 11/11/20
*/
public class MonthlyCostComparator implements Comparator<DB>
{
   /**
   * Compares DB's based on monthly cost.
   * @param db1 for DB obj
   * @param db2 for DB obj
   * @return int for value based on >, <, or =
   */
   public int compare(DB db1, DB db2)
   {
      if (db1.monthlyCost() > db2.monthlyCost())
      {
         return -1; // if greater, move up the list
      }
      else if (db1.monthlyCost() < db2.monthlyCost())
      {
         return 1; // if lesser, move down the list
      }
      else
      {
         return 0; // if equal, do nothing
      } 
   }
}