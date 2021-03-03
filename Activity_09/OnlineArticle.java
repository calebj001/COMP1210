/**
* Creates an object that represents an online text item (such as an ebook).
* This class inherits from the InventoryItem class. It differs in that it is an
* abstract class and does not take into account tax rate.
*
* @author Caleb Johnson - COMP1210
* @version 11/03/20
*/
public class OnlineArticle extends OnlineTextItem
{
   // variables
   
   private int wordCount;
   
   // constructor
   
   /**
   * Constructs an online article object.
   * @param nameIn for name
   * @param priceIn for price
   */
   public OnlineArticle(String nameIn, double priceIn)
   {
      super(nameIn, priceIn);
      wordCount = 0;
   }
   
   // methods
   
   /**
   * Mutator method for wordCount.
   * @param wordCountIn for wordCount
   */
   public void setWordCount(int wordCountIn)
   {
      wordCount = wordCountIn;
   }
}