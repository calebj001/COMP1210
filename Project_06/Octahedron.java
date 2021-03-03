import java.text.DecimalFormat;
/**
*
* This class can be called on to create new Octahedron objects with
* features such as its label, color, and edge length. I also uses the input
* variable data to calculate the object's surface area, volume, and surface
* to volume ratio. It then concatenates this data into a string output and
* returns the string as output.
*
* @author Caleb Johnson - COMP1210.
* @version 9/23/20.
*/
public class Octahedron
{
   // Fields - instance variables:
   private String label = "";
   private String color = "";
   private double edge = 0;
   
   // Constructor:
   
   /**
   * Defines instance variables with input.
   *
   * @param labelIn defines the label
   * @param colorIn defines the color
   * @param edgeIn defines the edge length
   */
   public Octahedron(String labelIn, String colorIn, double edgeIn)
   {
      setLabel(labelIn);
      setColor(colorIn);
      setEdge(edgeIn);
   }
   
   // Methods:
   
   /**
   * @return returns label
   */
   public String getLabel()
   {
      return label;
   }
   
   /**
   * @param labelIn defines oct. label
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
   * @return returns color
   */
   public String getColor()
   {
      return color;
   }
   
   /**
   * @param colorIn defines oct. color
   * @return returns if color is set or not
   */
   public boolean setColor(String colorIn)
   {
      boolean isSet = false;
      if (colorIn != null)
      {
         color = colorIn.trim();
         isSet = true;
      }
      return isSet;
   }
   
   /**
   * @return returns edge length
   */
   public double getEdge()
   {
      return edge;
   }
   
   /**
   * @param edgeIn defines oct. edge length
   * @return returns if edge length is set (only if (+) value)
   */
   public boolean setEdge(double edgeIn)
   {
      boolean isSet = false;
      
      if (edgeIn >= 0)
      {
         isSet = true;
         edge = edgeIn;
      }
      return isSet;
   }
   
   /**
   * @return returns calculated surface area
   */
   public double surfaceArea()
   {
      double a = 2 * Math.sqrt(3) * Math.pow(edge, 2); 
      return a;
   }
   
   /**
   * @return returns calculated volume
   */
   public double volume()
   {
      double v = (Math.sqrt(2) / 3) * Math.pow(edge, 3);
      return v;
   }
   
   /**
   * @return returns surface area to volume ratio
   */
   public double surfaceToVolumeRatio()
   {
      double svr = surfaceArea() / volume();
      return svr;
   }
   
   /**
   * @return returns an ordered String message with all oct. values
   */
   public String toString()
   {
      DecimalFormat df = new DecimalFormat("#,##0.0###");
      
      String output = "Octahedron \"" + label + "\" is \""
         + color + "\" with 12 edges of length " + edge + " units.";
      output += "\n\tsurface area = "
         + df.format(surfaceArea()) + " square units";
      output += "\n\tvolume = " + df.format(volume()) + " cubic units";
      output += "\n\tsurface/volume ratio = "
         + df.format(surfaceToVolumeRatio());
      
      return output;
   }
}