import java.text.DecimalFormat;
/**
* This program creates Spherocylinder objects with label, radius, and cylinder
* height attributes. It can calculate circumference, surface area, and volume
* of the objects. It also calculates the number to objects created with a class
* variable "count" and has functions to get and reset said "count".

*
* @author Caleb Johnson - COMP1210
* @version 10/14/20
*/
public class Spherocylinder implements Comparable<Spherocylinder>
{
   // instance variables
   private String label = "";
   private double radius = 0.0, height = 0.0;
   
   // class variables
   private static int count = 0;
   
   // constructor
   
   /**
   * Constructs a Spherocylinder object.
   * @param labelIn for label
   * @param radiusIn for radius
   * @param heightIn for cylinder height
   */
   public Spherocylinder(String labelIn, double radiusIn, double heightIn)
   {
      setLabel(labelIn);
      setRadius(radiusIn);
      setCylinderHeight(heightIn);
      count++;
   }
   
   // methods
   
   /**
   * Accessor for Spherocylinder label.
   * @return label for label
   */
   public String getLabel()
   {
      return label;
   }
   
   /**
   * Mutator for Spherocylinder label.
   * @param labelIn defines Spherocylinder label
   * @return returns if label is set or not
   */
   public boolean setLabel(String labelIn)
   {
      boolean isSet = false;
      if (labelIn != null)
      {
         label = labelIn.trim();
         isSet = true;
      }
      return isSet;
   }
   
   /**
   * Accessor for Spherocylinder radius.
   * @return radius for radius
   */
   public double getRadius()
   {  
      return radius;
   }
   
   /**
   * Mutator for Spherocylinder radius.
   * @param radiusIn defines Spherocylinder radius
   * @return returns if radius is set (only if (+) value)
   */
   public boolean setRadius(double radiusIn) {
      boolean isSet = false;
      
      if (radiusIn >= 0)
      {
         isSet = true;
         radius = radiusIn;
      }
      return isSet;
   }
   
   /**
   * Accessor for Spherocylinder cylinder height.
   * @return height for Spherocylinder height
   */
   public double getCylinderHeight()
   {   
      return height;
   }
   
   /**
   * Mutator for Spherocylinder cylinder height.
   * @param heightIn defines Spherocylinder height
   * @return returns if height is set (only if (+) value)
   */
   public boolean setCylinderHeight(double heightIn)
   {
      boolean isSet = false;
      
      if (heightIn >= 0)
      {
         isSet = true;
         height = heightIn;
      }
      return isSet;
   }
   
   /**
   * Calculates cylinder circumference for Spherocylinder object.
   * @return cirumference for cylinder circum.
   */
   public double circumference()
   {  
      double circumference = 2.0 * Math.PI * radius;
        
      return circumference;
   }
   
   /**
   * Calculates surface area of Spherocylinder object.
   * @return surfaceArea for Spherocylinder surface area
   */
   public double surfaceArea()
   {
      double surfaceArea = circumference() * ((2.0 * radius) + height);
      
      return surfaceArea;
   }
   
   /**
   * Calculates volume of Spherocylinder object.
   * @return volume for Spherocylinder volume
   */
   public double volume()
   {
      double volume = Math.PI * Math.pow(radius, 2) * (((4.0 / 3.0) * radius)
                           + height);
      
      return volume;
   }
   
   /**
   * Outputs Spherocylinder attributes (primative and calculated) as a String.
   * @return output for String summary
   */
   public String toString()
   {
      DecimalFormat df = new DecimalFormat("#,##0.00#");
      
      String output = "";
      
      output = "Spherocylinder \"" + label + "\" with radius " + radius
         + " and cylinder height " + height + " has:"
         + "\n\tcircumference = " + df.format(circumference()) + " units"
         + "\n\tsurface area = " + df.format(surfaceArea()) + " square units"
         + "\n\tvolume = " + df.format(volume()) + " cubic units";
         
      return output;
   }
   
   /**
   * Accessor for Spherocylinders created count.
   * @return count for number of Spherocylinders created
   */
   public static int getCount()
   {
      return count;
   }
   
   /**
   * Resets count.
   */
   public static void resetCount()
   {
      count = 0;
   }
   
   /**
   * Compares two Spherocylinders and determines if they are the same.
   * @param obj for object
   * @return boolean if object is/is not a Spherocylinder
   */
   public boolean equals(Object obj)
   {
      if (obj instanceof Spherocylinder)
      {
         Spherocylinder d = (Spherocylinder) obj;
         return (label.equalsIgnoreCase(d.getLabel())
                  && Math.abs(radius - d.getRadius()) < 0.000001
                  && Math.abs(height - d.getCylinderHeight())
                     < 0.000001);
      }
      return false;
   }
   
   /**
   * Code necessary for equals() to function.
   * @return 0 for equals() to work
   */
   public int hashCode()
   {
      return 0;
   }
   
   /**
   * Compares two Spherocylinders and returns an int value based on if they
   * are equal (0), less than (-1), or greater than (1) the original object.
   * @param obj for Spherocylinder object
   * @return int value determining relationship between 2 objects
   */
   public int compareTo(Spherocylinder obj)
   {
      if (Math.abs(this.volume() - obj.volume()) < 0.000001)
      {
         return 0; // consider them equal and return 0
      }
      else if (this.volume() < obj.volume())
      {
         return -1; // less than, should return a negative number
      }
      else
      {
         return 1; // greater than, should return a positive number
      }
   }

}
