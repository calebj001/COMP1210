import org.junit.Assert;
import org.junit.Test;

/**
* Tests the DistributedDB class.
*
* @author Caleb Johnson - COMP 1210 
* @version 11/06/20
*/
public class DistributedDBTest
{

   private DistributedDB test
         = new DistributedDB("Database Two", 2000.0, 7.5, 100, 12.0);
        
   /** Tests getName() and setName(). **/
   @Test public void getNameTest()
   {     
      test.setName("Test");
   
      Assert.assertEquals("Test", test.getName());
   }
   
   /** Tests getBaseCost() and setBaseCost(). **/
   @Test public void getBaseCostTest()
   {
      test.setBaseCost(6.00);
   
      Assert.assertEquals(6.00, test.getBaseCost(), 0.01);
   }
   
   /** Tests getDbStorage() and setDbStorage(). **/
   @Test public void getDbStorageTest()
   {     
      test.setDbStorage(6.00);
   
      Assert.assertEquals(6.00, test.getDbStorage(), 0.01);
   }
   
   /** Tests getCount() and resetCount(). **/
   @Test public void getCountTest()
   { 
      test.resetCount();
      Assert.assertEquals(0, test.getCount());
      
      DistributedDB test2
         = new DistributedDB("Database Two", 2000.0, 7.5, 100, 12.0);
      Assert.assertEquals(1, test2.getCount());
   }
   
    /** Tests getNumberOfUsers() and setNumberOfUsers(). **/
   @Test public void getNumberOfUsersTest()
   {     
      test.setNumberOfUsers(5);
   
      Assert.assertEquals(5, test.getNumberOfUsers(), 0);
   }
   
    /** Tests getCostPerUser() and setCostPerUser(). **/
   @Test public void getCostPerUserTest()
   {     
      test.setCostPerUser(10.50);
   
      Assert.assertEquals(10.50, test.getCostPerUser(), 0.01);
   }
   
   /** Tests userCost(). **/
   @Test public void userCostTest()
   {
      Assert.assertEquals(1200.00, test.userCost(), 0.01);
   }
   
    /** Tests getCostFactor(). **/
   @Test public void getCostFactorTest()
   {
      Assert.assertEquals(1.1, test.getCostFactor(), 0.1);
   }
   
   /** Tests monthlyCost(). **/
   @Test public void monthlyCostTest()
   {
      Assert.assertEquals(3320.00, test.monthlyCost(), 0.01);
   }
   
   /** Test toString(). **/
   @Test public void toStringTest()
   {
      Assert.assertEquals("Database Two (class DistributedDB) Monthly Cost: "
                         + "$3,320.00\nStorage: 7.500 TB\nBase Cost: $2,000.00"
                         + "\nNumber of Users: 100\nCost per User: $12.00\n"
                           + "User Cost: $1,200.00\nCost Factor: 1.1",
                              test.toString());
   }
}
