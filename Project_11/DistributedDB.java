import java.text.DecimalFormat;
/**
* Inherits the DB class to create a database consisting of multiple databases
* located in separate places that are all connected to each other so data
* stored in one location may be accessed and maintained in different locations.
*
* @author Caleb Johnson - COMP 1210 
* @version 11/06/20
*/
public class DistributedDB extends DB
{
   // fields
   
   protected int numUsers;
   protected double costPerUser;
   
   /** Constant for cost factor. **/
   public static final double COST_FACTOR = 1.1;
   
   // constructor
   
   /**
   * Constructs a DistrubutedDB object.
   * @param nameIn for name
   * @param baseCostIn for baseCost
   * @param storageIn for storage
   * @param numUsersIn for numUsers
   * @param costPerUserIn for costPerUser
   */
   public DistributedDB(String nameIn, double baseCostIn, double storageIn,
                     int numUsersIn, double costPerUserIn)
   {
      super(nameIn, baseCostIn, storageIn);
      numUsers = numUsersIn;
      costPerUser = costPerUserIn;
   }
   
   // methods
   
   /**
   * Accessor method for numUsers.
   * @return numUsers for numUsers
   */   
   public int getNumberOfUsers()
   {
      return numUsers;
   }
   
   /**
   * Mutator method for numUsers.
   * @param numUsersIn for numUsers
   */
   public void setNumberOfUsers(int numUsersIn)
   {
      numUsers = numUsersIn;
   }
   
   /**
   * Accessor method for costPerUser.
   * @return costPerUser for costPerUser
   */   
   public double getCostPerUser()
   {
      return costPerUser;
   }
   
   /**
   * Mutator method for costPerUser.
   * @param costPerUserIn for costPerUser
   */
   public void setCostPerUser(double costPerUserIn)
   {
      costPerUser = costPerUserIn;
   }
   
   /**
   * Calculates user cost.
   * @return UserCost for user cost
   */
   public double userCost()
   {
      double userCost = 0;
      userCost = getNumberOfUsers() * getCostPerUser();
      return userCost;
   }
   
   /**
   * Accessor metho for COST_FACTOR.
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
      monthlyCost = getBaseCost() + userCost() * DistributedDB.COST_FACTOR;
      return monthlyCost;
   }
   
   /**
   * Returns a String representation of the DistrubutedDB object.
   * @return output for String DistrubutedDB
   */
   public String toString()
   {
      DecimalFormat moneyFormat = new DecimalFormat("$#,##0.00");
      
      String output = super.toString();
      
      output += "\nNumber of Users: " + numUsers;
      output += "\nCost per User: " + moneyFormat.format(costPerUser);
      output += "\nUser Cost: " +  moneyFormat.format(userCost());
      output += "\nCost Factor: " + getCostFactor();
      
      return output;
   }
}