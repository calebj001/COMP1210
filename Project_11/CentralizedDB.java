import java.text.DecimalFormat;
/**
* Inherits the DB class to create a database stored, located, and maintained
* at a single location (for a centralized computing system).
*
* @author Caleb Johnson - COMP 1210 
* @version 11/06/20
*/
public class CentralizedDB extends DB
{
   // fields
   
   private double license;
   
   // constructor
   
   /**
   * Constructs a CentralizedDB object.
   * @param nameIn for name
   * @param baseCostIn for baseCost
   * @param storageIn for storage
   * @param licenseIn for license
   */
   public CentralizedDB(String nameIn, double baseCostIn, double storageIn,
                     double licenseIn)
   {
      super(nameIn, baseCostIn, storageIn);
      license = licenseIn;
   }
   
   // methods
   
   /**
   * Accessor method for license.
   * @return license for license
   */
   public double getLicense()
   {
      return license;
   }
   
   /**
   * Mutator method for license.
   * @param licenseIn for license
   */
   public void setLicense(double licenseIn)
   {
      license = licenseIn;
   }
   
   /** 
   * Calculates for monthly cost.
   * @return monthlyCost for monthly cost
   **/
   public double monthlyCost()
   {
      double monthlyCost = 0;
      monthlyCost = getBaseCost() + getLicense();
      return monthlyCost;
   }
   
   /**
   * Returns a String representation of the CentralizedDB object.
   * @return output for String CentralizedDB
   */
   public String toString()
   {
      DecimalFormat moneyFormat = new DecimalFormat("$#,##0.00");
      
      String output = super.toString();
      
      output += "\nLicense: " + moneyFormat.format(license);
      
      return output;
   }
}