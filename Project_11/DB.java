import java.text.DecimalFormat;
/**
* Creates an abstract database object and will be inherited by other classes
* to create more specific database objects.
*
* @author Caleb Johnson - COMP 1210 
* @version 11/06/20
*/
public abstract class DB implements Comparable<DB>
{
   // fields
   
   protected String name;
   protected double baseCost;
   protected double storage;
   protected static int count = 0;
   
   // constructor
   
   /**
   * Constructs a DB object.
   * @param nameIn for name
   * @param baseCostIn for baseCost
   * @param storageIn for storage
   */
   public DB(String nameIn, double baseCostIn, double storageIn)
   {
      name = nameIn;
      baseCost = baseCostIn;
      storage = storageIn;
      count++;
   }
   
   // methods
   
   /**
   * Accessor method for name.
   * @return name for name
   */
   public String getName()
   {
      return name;
   }
   
   /**
   * Mutator method for name.
   * @param nameIn for name
   */
   public void setName(String nameIn)
   {
      name = nameIn;
   }
   
    /**
   * Accessor method for baseCost.
   * @return baseCost for baseCost
   */
   public double getBaseCost()
   {
      return baseCost;
   }
   
   /**
   * Mutator method for baseCost.
   * @param baseCostIn for baseCost
   */
   public void setBaseCost(double baseCostIn)
   {
      baseCost = baseCostIn;
   }
   
    /**
   * Accessor method for storage.
   * @return storage for storage
   */
   public double getDbStorage()
   {
      return storage;
   }
   
   /**
   * Mutator method for storage.
   * @param storageIn for storage
   */
   public void setDbStorage(double storageIn)
   {
      storage = storageIn;
   }
   
   /**
   * Accessor method for count.
   * @return count for count
   */
   public static int getCount()
   {
      return count;
   }
   
   /** Resets count to 0. **/
   public static void resetCount()
   {
      count = 0;
   }
   
   /**
   * Returns a String representation of the DB object.
   * @return output for String DB
   */
   public String toString()
   {
      DecimalFormat moneyFormat = new DecimalFormat("$#,##0.00");
      DecimalFormat storageFormat = new DecimalFormat("0.000");
      
      String output = "";
      
      output += name + " (" + this.getClass() + ") " + "Monthly Cost: "
         + moneyFormat.format(monthlyCost());
      output += "\nStorage: " + storageFormat.format(storage) + " TB";
      output += "\nBase Cost: " + moneyFormat.format(baseCost);
      
      return output;
   }
   
   /** 
   * Abstract method for monthly cost.
   * @return monthlyCost for monthly cost
   **/
   public abstract double monthlyCost();
   
   /**
   * Compares 2 DB objects by name.
   * @param obj for DB being compared
   * @return int for value based on compared objs
   */
   public int compareTo(DB obj)
   {
      return this.getName().toLowerCase().compareTo(obj.getName()
                           .toLowerCase());
   }

}