/**
* Creates an object that represents an online text item (such as an ebook).
* This class inherits from the InventoryItem class. It differs in that it is an
* abstract class and does not take into account tax rate.
*
* @author Caleb Johnson - COMP1210
* @version 11/03/20
*/
public abstract class OnlineTextItem extends InventoryItem
{
   // constructor
   
   /**
   * Constructs an online text item.
   * @param nameIn for name
   * @param priceIn for price
   */
   public OnlineTextItem(String nameIn, double priceIn)
   {
      super(nameIn, priceIn);
   }
   
   // methods
   
   /**
   * Overrides the superclass cost.
   * @return price for price
   */
   public double calculateCost()
   {
      return price;
   }
}
