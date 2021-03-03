import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
/**
* This class creates an array of database objects and has methods for reading
* in a data file and generating reports.
*
* @author Caleb Johnson - COMP1210
* @version 11/11/20
**/
public class DBList
{
   // fields
   
   private DB[] arrayDB;
   private String[] invalidRecords;
   
   // constructor
   
   /** Constructs a DB[] and String []. **/
   public DBList()
   {
      arrayDB = new DB[0];
      invalidRecords = new String[0];
   }
   
   // methods
   
   /**
   * Accessor method for arrayDB.
   * @return arrayDB for arrayDB
   */
   public DB[] getDBArray()
   {
      return arrayDB;
   }
   
   /**
   * Accessor method for invalidRecords.
   * @return invalidRecords for invalidRecords
   */
   public String[] getInvalidRecordsArray()
   {
      return invalidRecords;
   }
   
   /**
   * Adds a DB object to arrayDB.
   * @param objIn for DB being added
   */
   public void addDB(DB objIn)
   {
      if (objIn != null)
      {
         arrayDB = Arrays.copyOf(getDBArray(), getDBArray().length + 1);
         arrayDB[getDBArray().length - 1] = objIn;
      }
   }
      
   /**
   * Adds a invalid record to invalidRecords.
   * @param recordIn for invalid record
   */
   public void addInvalidRecord(String recordIn)
   {
      if (recordIn != null)
      {
         invalidRecords = Arrays.copyOf(invalidRecords,
                              invalidRecords.length + 1);
         invalidRecords[invalidRecords.length - 1] = recordIn;
      }
   } 
   
   /**
   * Reads a data file as a String and creates DB objects, which is then adds
   * to arrayDB.
   * @param fileNameIn for the file name
   * @throws FileNotFoundException for WebCat to love me
   */
   public void readFile(String fileNameIn) throws FileNotFoundException
   {
      Scanner scan = new Scanner(new File(fileNameIn));
      
      while (scan.hasNext())
      {
         Scanner read = new Scanner(scan.nextLine().trim());
         read.useDelimiter(",");
         
         char catagory = read.next().toUpperCase().charAt(0);
         String name;
         double baseCost;
         double storage;
         double license;
         int numUsers;
         double costPerUser;
         switch(catagory)
         {
            case 'C':
               name = read.next();
               baseCost = Double.parseDouble(read.next().trim());
               storage = Double.parseDouble(read.next().trim());
               license = Double.parseDouble(read.next().trim());
               
               addDB(new CentralizedDB(name, baseCost, storage, license));
               break;
               
            case 'D':
               name = read.next();
               baseCost = Double.parseDouble(read.next().trim());
               storage = Double.parseDouble(read.next().trim());
               numUsers = Integer.parseInt(read.next().trim());
               costPerUser = Double.parseDouble(read.next().trim());
               
               addDB(new DistributedDB(name, baseCost, storage, numUsers,
                                      costPerUser));
               break;
               
            case 'H':
               name = read.next();
               baseCost = Double.parseDouble(read.next().trim());
               storage = Double.parseDouble(read.next().trim());
               numUsers = Integer.parseInt(read.next().trim());
               costPerUser = Double.parseDouble(read.next().trim());
               
               addDB(new HomogeneousDB(name, baseCost, storage, numUsers,
                                      costPerUser));
               break;
               
            case 'E':
               name = read.next();
               baseCost = Double.parseDouble(read.next().trim());
               storage = Double.parseDouble(read.next().trim());
               numUsers = Integer.parseInt(read.next().trim());
               costPerUser = Double.parseDouble(read.next().trim());
               
               addDB(new HeterogeneousDB(name, baseCost, storage, numUsers,
                                       costPerUser));
               break;
               
            default:
               String invalid = catagory + read.nextLine();
               addInvalidRecord(invalid);
         
         }
      }
   }
   
   /**
   * Processes arrayDB in original order from the file to produce the Monthly
   * Database Report and then returns the report as String.
   * @return output for Monthly Database Report
   */
   public String generateReport()
   {
      String output = "-------------------------------"
         + "\nMonthly Database Report"
         + "\n-------------------------------\n";
      for (DB db : arrayDB)
      {
         output += db.toString() + "\n\n";
      }
      return output;
   }
    
   /**
   * Sorts arrayDB in natural order, processes the arrayDB to produce the
   * Monthly Database Report (by Name) and returns it as a String.
   * @return output for Monthly Database Report
   */
   public String generateReportByName()
   {
      Arrays.sort(arrayDB);
      String output = "-----------------------------------------"
         + "\nMonthly Database Report (by Name)"
         + "\n-----------------------------------------\n";
      for (DB db : arrayDB)
      {
         output += db.toString() + "\n\n";
      }
      return output;
   }
    
   /**
   * Sorts arrayDB by montlh cost, processes the arrayDB to produce the
   * Monthly Database Report (by Monthly Cost) and returns it as a String.
   * @return output for Monthly Database Report
   */
   public String generateReportByMonthlyCost()
   {
      Arrays.sort(arrayDB, new MonthlyCostComparator());
      String output = "-------------------------------------------------"
         + "\nMonthly Database Report (by Monthly Cost)\n"
         + "-------------------------------------------------\n";
      for (DB db : getDBArray())
      {
         output += db.toString() + "\n\n";
      }
      return output;
   }

}