  /**
* Inherits the DistributedDB class to create a distributed database where
* different sites can use different schema and software to store databases
* differently than others.
*
* @author Caleb Johnson - COMP 1210 
* @version 11/06/20
*/
public class HeterogeneousDB extends DistributedDB
{
   // fields
   
   /** Constant for cost factor. **/
   public static final double COST_FACTOR = 1.3;
   
   // constructor
   
   /**
   * Constructs a HeterogeneousDB object.
   * @param nameIn for name
   * @param baseCostIn for baseCost
   * @param storageIn for storage
   * @param numUsersIn for numUsers
   * @param costPerUserIn for costPerUser
   */
   public HeterogeneousDB(String nameIn, double baseCostIn, double storageIn,
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
      monthlyCost = getBaseCost() + userCost() * HeterogeneousDB.COST_FACTOR;
      return monthlyCost;
   }
}
