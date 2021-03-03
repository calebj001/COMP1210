import java.io.FileNotFoundException;
/**
* This is the driver class that contains the main method to run all the DB
* related classes.
*
* @author Caleb Johnson - COMP1210
* @version 11/12/20
*/
public class DBPart2
{
   /**
   * Main method that runs all DB classes and uses a file name as a
   * Command Line Argument to create the DBList.
   * @param args Command line arguments are used
   * @throws FileNotFoundException for WebCat to love me
   */
   public static void main(String[] args) throws FileNotFoundException
   {
      if (args.length == 0)
      {
         System.out.println("File name expected as command line argument."
                           + "\nProgram ending.");
      }
      else
      {
         DBList myList = new DBList();
         myList.readFile(args[0]);
         System.out.print(myList.generateReport()
                         + myList.generateReportByName()
                         + myList.generateReportByMonthlyCost());
      }
   }
}