/**
* InvalidCategoryException for DBList.
*
* @author Caleb Johnson - COMP1210
* @version 11/20/20
*/
public class InvalidCategoryException extends Exception
{
   /**
   * Constructs a new InvalidCategoryException error message.
   * @param categoryIn for invalid category
   */
   public InvalidCategoryException(String categoryIn)
   {
      super("For category: " + categoryIn);
   }
}