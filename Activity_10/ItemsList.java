/**
* Creates an array of InventoryItems to demonstrate polymorphism concepts.
*
* @author Caleb Johnson - COMP1210
* @version 11/10/20
*/
public class ItemsList
{
   // fields
   
   private InventoryItem[] inventory;
   private int count;
   
   // constructer
   
   /** Constructs an ItemsList array object. **/
   public ItemsList()
   {
      inventory = new InventoryItem[20];
      count = 0;
   }
   
   // methods
   
   /**
   * Adds an InventoryItem to the ItemList.
   * @param itemIn for item being added
   */
   public void addItem(InventoryItem itemIn)
   {
      inventory[count] = itemIn;
      count++;
   }
   
   /**
   * Calculates the total cost of items in list.
   * @param electronicsSurcharge for the electronicsSurcharge
   * @return double for total cost
   */
   public double calculateTotal(double electronicsSurcharge)
   {  
      double total = 0;
      for (int i = 0; i < count; i++)
      {
         if (inventory[i] instanceof ElectronicsItem)
         {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         } else
         {
            total += inventory[i].calculateCost();
         }
      }
      return total;
   }
   
   /**
   * Iterates through the list and returns the item's toString().
   * @return output for String
   */
   public String toString()
   {
      String output = "All inventory: \n\n";
      
      for (int i = 0; i < count; i++)
      {
         output += inventory[i].toString() + "\n";
      }
      return output;
   }
}
