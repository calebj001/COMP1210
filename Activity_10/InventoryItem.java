/**
* Creates an object that represents an inventory item in a store. This class
* will be the superclass for other classes for this assignment.
*
* @author Caleb Johnson - COMP1210
* @version 11/03/20
*/
public class InventoryItem
{
   // variables
   protected String name;
   protected double price;
   private static double taxRate = 0;
   
   // constructor
   
   /**
   * Constructs an inventory item object.
   * @param nameIn for name
   * @param priceIn for price
   */
   public InventoryItem(String nameIn, double priceIn)
   {
      name = nameIn;
      price = priceIn;
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
   * Returns the total cost with tax rate and price.
   * @return totalCost for total cost of item with tax
   */
   public double calculateCost()
   {
      double totalCost = price * (1 + taxRate);
      return totalCost;
   }
   
   /**
   * Mutator method for taxRate.
   * @param taxRateIn for taxRate
   */
   public static void setTaxRate(double taxRateIn)
   {
      taxRate = taxRateIn;
   }
   
   /**
   * Returns a String representation with name and price with tax.
   * @return String for String representation
   */
   public String toString()
   {
      return name + ": $" + calculateCost();
   }

}