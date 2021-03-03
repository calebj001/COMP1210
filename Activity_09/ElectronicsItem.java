/**
* Creates an object that represents an Electronics item in a store. This class
* inherits from the InventoryItem class. It differs in that it takes the
* shipping cost of the item into account when determining total cost.
*
* @author Caleb Johnson - COMP1210
* @version 11/03/20
*/
public class ElectronicsItem extends InventoryItem
{
   // variables
   protected double weight;
   
   /** Constant for price per pound to ship. **/
   public static final double SHIPPING_COST = 1.5;
   
   // constructor
   
   /**
   * Constructs an electronics item object.
   * @param nameIn for name
   * @param priceIn for price
   * @param weightIn for weight
   */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn)
   {
      super(nameIn, priceIn);
      weight = weightIn;
   }
   
   // methods
   
   /**
   * Returns the total cost taking into account shipping.
   * @return for total cost of item with shipping
   */
   public double calculateCost()
   {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}