  /**
* Inherits the DistributedDB class to create a distributed database where all
* all different sites store data identically.
*
* @author Caleb Johnson - COMP 1210 
* @version 11/06/20
*/
public class HomogeneousDB extends DistributedDB
{
   // fields
   
   /** Constant for cost factor. **/
   public static final double COST_FACTOR = 1.2;
   
   // constructor
   
   /**
   * Constructs a HomogeneousDB object.
   * @param nameIn for name
   * @param baseCostIn for baseCost
   * @param storageIn for storage
   * @param numUsersIn for numUsers
   * @param costPerUserIn for costPerUser
   */
   public HomogeneousDB(String nameIn, double baseCostIn, double storageIn,
                     int numUsersIn, double costPerUserIn)
   {
      super(nameIn, baseCostIn, storageIn, numUsersIn, costPerUserIn);
   }
   
   /**
   * Accessor method for COST_FACTOR.
   * @return COST_FACTOR for cost factor
   */
   public double getCostFactor()
   {
      return COST_FACTOR;
   }
   
   /** 
   * Calculates for monthly cost.
   * @return monthlyCost for monthly cost
   **/
   public double monthlyCost()
   {
      double monthlyCost = 0;
      monthlyCost = getBaseCost() + userCost() * HomogeneousDB.COST_FACTOR;
      return monthlyCost;
   }
}
