import org.junit.Assert;
import org.junit.Test;

/** 
* Tests the SpherocylinderList class.
*
* @author Caleb Johnson - COMP1210
* @version 10/30/20
*/
public class SpherocylinderListTest
{

   /** Tests the getName(). **/
   @Test public void getNameTest()
   {
      Spherocylinder[] test = new Spherocylinder [5];
      SpherocylinderList myList
         = new SpherocylinderList("Test List", test, 0);
         
      Assert.assertEquals("Test List", myList.getName());
   }
   
   /** Tests the numberOfSpherocylinder() and addSpherocylinder(). **/
   @Test public void numberOfSpherocylindersTest()
   {
      Spherocylinder[] test = new Spherocylinder [5];
      
      SpherocylinderList myList
         = new SpherocylinderList("Test List", test, 0);
         
      myList.addSpherocylinder("Small Example", 0.5, 0.25);
      myList.addSpherocylinder("Medium Example", 10.8, 10.1);
      myList.addSpherocylinder("Large Example", 98.32, 99.0);
      
      Assert.assertEquals(3, myList.numberOfSpherocylinders());
   }
   
    /** Tests the totalSurfaceArea() and averageSurfaceArea(). **/
   @Test public void averageSurfaceAreaTest()
   {
      Spherocylinder[] test = new Spherocylinder [5];
      
      SpherocylinderList myList
         = new SpherocylinderList("Test List", test, 0);
         
      myList.addSpherocylinder("Small Example", 0.5, 0.25);
      myList.addSpherocylinder("Medium Example", 10.8, 10.1);
      myList.addSpherocylinder("Large Example", 98.32, 99.0);
      
      Assert.assertEquals(184790.426, myList.totalSurfaceArea(), 0.001);
      Assert.assertEquals(61596.809, myList.averageSurfaceArea(), 0.001);
      
      SpherocylinderList myList2
         = new SpherocylinderList("Test List2", test, 0);
      
      Assert.assertEquals(0.0, myList2.totalSurfaceArea(), 0.01);
      Assert.assertEquals(0.0, myList2.averageSurfaceArea(), 0.01);
         
   }
   
/** Tests the totalSurfaceArea() and averageSurfaceArea(). **/
   @Test public void averageVolumeTest()
   {
      Spherocylinder[] test = new Spherocylinder [5];
      
      SpherocylinderList myList
         = new SpherocylinderList("Test List", test, 0);
         
      myList.addSpherocylinder("Small Example", 0.5, 0.25);
      myList.addSpherocylinder("Medium Example", 10.8, 10.1);
      myList.addSpherocylinder("Large Example", 98.32, 99.0);
      
      Assert.assertEquals(6996733.041, myList.totalVolume(), 0.001);
      Assert.assertEquals(2332244.347, myList.averageVolume(), 0.001);
      
      SpherocylinderList myList2
         = new SpherocylinderList("Test List2", test, 0);
      
      Assert.assertEquals(0.0, myList2.totalVolume(), 0.01);
      Assert.assertEquals(0.0, myList2.averageVolume(), 0.01);
   }

   /** Tests the toString(). **/
   @Test public void toStringTest()
   {
      Spherocylinder[] test = new Spherocylinder [5];
      
      SpherocylinderList myList
         = new SpherocylinderList("Test List", test, 0);
         
      myList.addSpherocylinder("Small Example", 0.5, 0.25);
      myList.addSpherocylinder("Medium Example", 10.8, 10.1);
      myList.addSpherocylinder("Large Example", 98.32, 99.0);
      
      Assert.assertEquals("----- Summary for Test List -----"
                         + "\nNumber of Spherocylinders: 3\nTotal Surface "
                         + "Area: 184,790.426\nTotal Volume: 6,996,733.041"
                         + "\nAverage Surface Area: 61,596.809\nAverage "
                         + "Volume: 2,332,244.347", myList.toString());
   }
   
   /** Tests the getList(). **/
   @Test public void getListTest()
   {
      Spherocylinder[] test = new Spherocylinder [5];
      
      SpherocylinderList myList
         = new SpherocylinderList("Test List", test, 0);
         
      Assert.assertArrayEquals(test, myList.getList());
   }
   
    /** Tests findSpherocylinder(). **/
   @Test public void findSpherocylinderTest()
   {
      Spherocylinder small = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder medium = new Spherocylinder("Medium Example", 10.8, 10.1);
      Spherocylinder large = new Spherocylinder("Large Example", 98.32, 99.0);
      
      Spherocylinder[] test = {medium, small, large};
      
      SpherocylinderList myList
         = new SpherocylinderList("Test List", test, 3);
         
      Assert.assertEquals(large, myList.findSpherocylinder("Large Example"));
      Assert.assertEquals(null, myList.findSpherocylinder("Bad"));
   }
   
    /** Tests editSpherocylinder(). **/
   @Test public void editSpherocylinderTest()
   {
      Spherocylinder small = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder medium = new Spherocylinder("Medium Example", 10.8, 10.1);
      Spherocylinder large = new Spherocylinder("Large Example", 98.32, 99.0);
      
      Spherocylinder[] test = {medium, small, large};
      
      SpherocylinderList myList
         = new SpherocylinderList("Test List", test, 3);
         
      Spherocylinder largeNew
            = new Spherocylinder("Large Example", 100, 100);
            
      Assert.assertEquals(true,
                         myList.editSpherocylinder("Large Example", 100, 100));
      Assert.assertEquals(false, myList.editSpherocylinder("Bad", 1.0, 10.0));
   }

   
     /** Tests deleteSpherocylinder(). **/
   @Test public void deleteSpherocylinderTest()
   {
      Spherocylinder small = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder medium = new Spherocylinder("Medium Example", 10.8, 10.1);
      Spherocylinder large = new Spherocylinder("Large Example", 98.32, 99.0);
      
      Spherocylinder[] test = {large, small, medium};
      
      SpherocylinderList myList
         = new SpherocylinderList("Test List", test, 3);
         
      Assert.assertEquals(large, myList.deleteSpherocylinder("Large Example"));
      Assert.assertEquals(null, myList.deleteSpherocylinder("Bad"));
   }
   
     /** Tests findSpherocylinderWithLargestVolume(). **/
   @Test public void findSpherocylinderWithLargestVolumeTest()
   {
      Spherocylinder small = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder medium = new Spherocylinder("Medium Example", 10.8, 10.1);
      Spherocylinder large = new Spherocylinder("Large Example", 98.32, 99.0);
      
      Spherocylinder[] test = {medium, small, large};
      
      SpherocylinderList myList
         = new SpherocylinderList("Test List", test, 3);
         
      Assert.assertEquals(large,
                         myList.findSpherocylinderWithLargestVolume());
         
      Spherocylinder[] test2 = new Spherocylinder [5];
      
      SpherocylinderList myList2
         = new SpherocylinderList("Test List 2", test2, 0);
      Assert.assertEquals(null,
                         myList2.findSpherocylinderWithLargestVolume());
   }

}
