import org.junit.Assert;
import org.junit.Test;
/**
* This is a JUnit test for the Spherocylinder Class. It tests each method to
* make sure there are no errors in the code.
*
* @author Caleb Johnson - COMP1210
* @version 10/15/20
*/

public class SpherocylinderTest
{
   /** Tests the getLabel and setLabel methods. */
   @Test public void testSetLabel()
   {
      Spherocylinder test = new Spherocylinder("Ex 1", 0.10, 0.3);
      Assert.assertEquals("Ex 1", test.getLabel());
      
      test.setLabel("Ex 2");
      Assert.assertEquals("Ex 2", test.getLabel());
      
      Assert.assertFalse(test.setLabel(null));
   }
   
   /** Tests the getRadius and setRadius methods. */
   @Test public void testSetRadius()
   {
      Spherocylinder test = new Spherocylinder("Ex 3", 1.25, 1.5);
      Assert.assertEquals(1.25, test.getRadius(), 0.000001);
      
      test.setRadius(1.0);
      Assert.assertEquals(1.0, test.getRadius(), 0.000001);
      
      Assert.assertFalse(test.setRadius(-10.0));
   }
   
   /** Tests the getCylinderHeight and setCylinderHeight methods. */
   @Test public void testSetCylinderHeight()
   {
      Spherocylinder test = new Spherocylinder("Ex 4", 12.6, 0.2);
      Assert.assertEquals(0.2, test.getCylinderHeight(), 0.000001);
      
      test.setCylinderHeight(1.75);
      Assert.assertEquals(1.75, test.getCylinderHeight(), 0.000001);
      
      Assert.assertFalse(test.setCylinderHeight(-10.0));
   }

   /** Tests the circumference method. */
   @Test public void testCircumference()
   {
      Spherocylinder test = new Spherocylinder("Ex 5", 0.33, 1.5);
      Assert.assertEquals(2.0734511, test.circumference(), 0.000001);
   }
   
    /** Tests the surfaceArea method. */
   @Test public void testSurfaceArea()
   {
      Spherocylinder test = new Spherocylinder("Ex 6", 1.67, 13.8);
      Assert.assertEquals(179.848639, test.surfaceArea(), 0.000001);
   }
   
    /** Tests the surfaceArea method. */
   @Test public void testVolume()
   {
      Spherocylinder test = new Spherocylinder("Ex 7", 0.57, 0.19);
      Assert.assertEquals(0.969668, test.volume(), 0.000001);
   }
   
   /** Tests the toString method. */
   @Test public void testToString()
   {
      Spherocylinder test1 = new Spherocylinder("Ex 8", 1.10, 10.5);
      Assert.assertTrue(test1.toString().contains("cubic units"));
   }
   
   /** Tests the getCount and resetCount methods. */
   @Test public void testResetCount()
   {
      Spherocylinder.resetCount();
      Spherocylinder test2 = new Spherocylinder("Ex 9", 1.0, 10.5);
      Spherocylinder test3 = new Spherocylinder("Ex 10", 1.0, 10.5);
      Assert.assertEquals(2, test2.getCount());
   }
   
    /** Tests the equals and hashCode methods. */
   @Test public void testEquals()
   {
      Spherocylinder test4 = new Spherocylinder("Yes", 1.0, 10.5);
      Spherocylinder test5 = test4;
      
      Assert.assertTrue(test5.equals(test4));
        
      Spherocylinder test6 = new Spherocylinder("No", 1.0, 10.5);
      Assert.assertFalse(test4.equals(test6));
      
      Spherocylinder test7 = new Spherocylinder("Yes", 2.0, 10.5);
      Assert.assertFalse(test4.equals(test7));
      
      Spherocylinder test8 = new Spherocylinder("Yes", 1.0, 69.0);
      Assert.assertFalse(test4.equals(test8));
      
      String bad = "No";
      Assert.assertFalse(test4.equals(bad));
      
      Assert.assertEquals(0, test4.hashCode());
   }
   
   /** Tests the compareTo method with equal value param. **/
   @Test public void compareToTest1()
   {
      Spherocylinder s1 = new Spherocylinder("Ex 1", 10.0, 2.5);
      
      Spherocylinder s2 = new Spherocylinder("Ex 2", 10.0, 2.5);
      
      Assert.assertEquals(0,  s1.compareTo(s2));
      
   }
   
      /** Tests the compareTo method with greater value param. **/
   @Test public void compareToTest2()
   {
      Spherocylinder s1 = new Spherocylinder("Ex 1", 69.0, 2.5);
      
      Spherocylinder s2 = new Spherocylinder("Ex 2", 420.0, 2.5);
      
      Assert.assertEquals(-1, s1.compareTo(s2));
   
   }
   
      /** Tests the compareTo method with lesser value param. **/
   @Test public void compareToTest3()
   {
      Spherocylinder s1 = new Spherocylinder("Ex 1", 420.0, 2.5);
      
      Spherocylinder s2 = new Spherocylinder("Ex 2", 69.0, 2.5);
      
      Assert.assertEquals(1, s1.compareTo(s2));
   }

   
}
