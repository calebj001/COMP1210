     /**
* Creates an object that represents an online text item (such as an ebook).
* This class inherits from the InventoryItem class. It differs in that it is an
* abstract class and does not take into account tax rate.
*
* @author Caleb Johnson - COMP1210
* @version 11/03/20
*/
public class OnlineBook extends OnlineTextItem
{
   // variables
   
   protected String author;
   
   // constructor
   
   /**
   * Constructs an online book object.
   * @param nameIn for name
   * @param priceIn for price
   */
   public OnlineBook(String nameIn, double priceIn)
   {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
   
   // methods
   
   /**
   * Mutator method for author.
   * @param authorIn for author
   */
   public void setAuthor(String authorIn)
   {
      author = authorIn;
   }
   
   /**
   * Overrides super.toString() to contain author's name, book name, and price.
   * @return String for String representation
   */
   public String toString()
   {
      return name + " - " + author + ": $" + calculateCost();
   }

}