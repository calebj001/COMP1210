import java.text.DecimalFormat;
/** 
* Creates a list through an Array object of Spherocylinder objects.
* The class has several methods to get information about the Array's
* attributes as a whole, as well as methods to modify the Array.
*
* @author Caleb Johnson - COMP1210
* @version 10/30/20
*/
public class SpherocylinderList
{
   // instance variables
   
   private String listName = "";
   private Spherocylinder[] sList;
   private int numSphero;
   
   // constructor
   
   /**
   * Constructs a SpherocylinderList object.
   * @param listNameIn for listName
   * @param sListIn for the list of Spherocylinder objects
   * @param numSpheroIn for number of Spherocylinder objects in the list
   */
   public SpherocylinderList(String listNameIn, Spherocylinder[] sListIn,
                     int numSpheroIn)
   {
      listName = listNameIn;
      sList = sListIn;
      numSphero = numSpheroIn;
   }
   
   // methods
   
   /**
   * Accessor method for the name of the list.
   * @return listName for listName
   */
   public String getName()
   {
      return listName;
   }
   
   /**
   * Accessor method for the number of Spherocylinders in the list.
   * @return numSphero for number of Spherocylinders in list
   */
   public int numberOfSpherocylinders()
   {
      return numSphero;
   }
   
   /**
   * Calculates total surface area of all Spherocylinders in the list.
   * @return totalSA for totalSA of all Spherocylinders in list
   */
   public double totalSurfaceArea()
   {
      double totalSA = 0;
      if (numSphero > 0)
      {
         for (int i = 0; i < numSphero; i++)
         {
            totalSA += sList[i].surfaceArea();
         }
      }
      return totalSA;
   }
   
    /**
   * Calculates total volume of all Spherocylinders in the list.
   * @return totalVolume for totalVolume of all Spherocylinders in list
   */
   public double totalVolume()
   {
      double totalVolume = 0;
      if (numSphero > 0)
      {
         for (int i = 0; i < numSphero; i++)
         {
            totalVolume += sList[i].volume();
         }
      }
      return totalVolume;
   }
   
   /**
   * Calculates average surface area of all Spherocylinders in the list.
   * @return avgSA for avgSA of all Spherocylinders in list
   */
   public double averageSurfaceArea()
   {
      double avgSA = 0;
      if (numSphero > 0)
      {
         for (int i = 0; i < numSphero; i++)
         {
            avgSA += sList[i].surfaceArea();
         }
         avgSA = avgSA / numSphero;
      }
      return avgSA;
   }
   
    /**
   * Calculates average volume of all Spherocylinders in the list.
   * @return avgVolume for avgVolume of all Spherocylinders in list
   */
   public double averageVolume()
   {
      double avgVolume = 0;
      if (numSphero > 0)
      {
         for (int i = 0; i < numSphero; i++)
         {
            avgVolume += sList[i].volume();
         }
         avgVolume = avgVolume / numSphero;
      }
      return avgVolume;
   }
   
   /**
   * Returns summary of list attributes as a String.
   * @return output for String of list attributes
   */
   public String toString()
   {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      
      String output = "";
      
      output += "----- Summary for " + listName + " -----";
      output += "\nNumber of Spherocylinders: " + numSphero;
      output += "\nTotal Surface Area: " + df.format(totalSurfaceArea());
      output += "\nTotal Volume: " + df.format(totalVolume());
      output += "\nAverage Surface Area: " + df.format(averageSurfaceArea());
      output += "\nAverage Volume: " + df.format(averageVolume());
      
      return output;
   }
   
   /**
   * Accessor method for Array of Spherocylinder objects in the list.
   * @return sList for Array of Spherocylinder objects
   */
   public Spherocylinder[] getList()
   {
      return sList;
   }
   
   /**  
   * Adds a Spherocylinder object to the list.
   * @param labelIn for label
   * @param radiusIn for radius
   * @param heightIn for cylinder height
   */   
   public void addSpherocylinder(String labelIn, double radiusIn,
                     double heightIn)
   {
      Spherocylinder s = new Spherocylinder(labelIn, radiusIn, heightIn);
      sList[numSphero] = s;
      numSphero++;
   }
   
   /**
   * Finds and returns a specific Spherocylinder from the list.
   * @param labelIn for label of Spherocylinder being found
   * @return s for found Spherocylinder object
   */
   public Spherocylinder findSpherocylinder(String labelIn)
   {
      for (int i = 0; i < numSphero; i++)
      {
         if (sList[i].getLabel().equalsIgnoreCase(labelIn))
         {
            return sList[i];
         }
      }
      return null;
   }
   
   
    
   /**
   * Finds the Spherocylinder object that is being deleted, takes it out of
   * the Array, sets it equal to null, and then decreases the list length by 1.
   * @param labelIn for label of Spherocylinder object being deleted
   * @return s for deleted Spherocylinder (null if not in list)
   */
   public Spherocylinder deleteSpherocylinder(String labelIn)
   {
      Spherocylinder s = null;
      
      for (int i = 0; i < numSphero; i++)
      {
         if (sList[i].getLabel().equalsIgnoreCase(labelIn))
         {
            s = sList[i];
            for (int j = i; j < (numSphero - 1); j++)
            {
               sList[j] = sList[j + 1];
            }
            sList[numSphero - 1] = null; // overwrite duplicate at end
            numSphero--;
            break;
         }
      }
      return s;
   }
   
   /**
   * Finds and edits the attributes of a single Spherocylinder in the list.
   * @param labelIn for edited Spherocylinder's label
   * @param radiusIn for new radius
   * @param heightIn for new cylinder height
   * @return isSet if Spherocylinder was edited or not
   */
   public boolean editSpherocylinder(String labelIn, double radiusIn,
                     double heightIn)
   {
      boolean isSet = false;
      
      for (int i = 0; i < numSphero; i++)
      {
         sList[i].getLabel();
         if (sList[i].getLabel().equalsIgnoreCase(labelIn))
         {
            sList[i].setRadius(radiusIn);
            sList[i].setCylinderHeight(heightIn);
            isSet = true;
            break;
         }
      }
      return isSet;
   }
         
   /**
   * Returns Spherocylinder with largest volume from the list.
   * @return s for Spherocylinder object with largest volume
   */
   public Spherocylinder
      findSpherocylinderWithLargestVolume()
   {
      Spherocylinder s = null;
      double largest = 0;
      
      for (int i = 0; i < numSphero; i++)
      {
         if (sList[i].volume() > largest)
         {
            largest = sList[i].volume();
            s = sList[i];
         }
      }
      return s;
   }
}