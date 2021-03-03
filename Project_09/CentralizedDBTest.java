import org.junit.Assert;
import org.junit.Test;

/**
* Tests the CentralizedDB class.
*
* @author Caleb Johnson - COMP 1210 
* @version 11/06/20
*/

public class CentralizedDBTest
{

   private CentralizedDB test
         = new CentralizedDB("Database One", 1200, 5, 1500);
        
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
      CentralizedDB test1
         = new CentralizedDB("Database One", 1200, 5, 1500);
         
      test.resetCount();
      Assert.assertEquals(0, test.getCount());
      
      CentralizedDB test2
         = new CentralizedDB("Database One", 1200, 5, 1500);
      
      Assert.assertEquals(1, test1.getCount());
   }
   
    /** Tests getLicense() and setLicense(). **/
   @Test public void getLicenseTest()
   {     
      test.setLicense(12.40);
   
      Assert.assertEquals(12.40, test.getLicense(), 0.01);
   }
   
   /** Tests monthlyCost(). **/
   @Test public void monthlyCostTest()
   {
      Assert.assertEquals(2700.00, test.monthlyCost(), 0.01);
   }
   
   /** Test toString(). **/
   @Test public void toStringTest()
   {
      Assert.assertEquals("Database One (class CentralizedDB) Monthly Cost: "
                         + "$2,700.00\nStorage: 5.000 TB\nBase Cost: $1,200.00"
                         + "\nLicense: $1,500.00", test.toString());
   }


}
