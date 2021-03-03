import java.util.ArrayList;
import java.text.DecimalFormat;
/**
*
* This is the object class OctahedronList, which creates
* an ArrayList of Octahedron objects.
* This program repeats fundamental data structures already implimented into the
* language for the sole purpose of making the project complicated.
*
* @author Caleb Johnson - COMP1210.
* @version 9/23/20.
*/
public class OctahedronList
{
      // Fields - instance variables:

   private String listName;
   private ArrayList<Octahedron> octaList;
   
      // Construtor:

   /**
   * @param listNameIn for listName
   * @param octaListIn for octaList
   */
   public OctahedronList(String listNameIn, ArrayList<Octahedron> octaListIn)
   {
      listName = listNameIn;
      octaList = octaListIn;
   }
   
      // Methods:
   
   /**
   * @return the name of the list
   */
   public String getName() 
   {
      return listName;
   }
   
   /**
   * @return the number of Octahedron objects in the list
   */
   public int numberOfOctahedrons() 
   {
      return octaList.size();
   }
   
   /**
   * @return the total SA of all Octahedron objects
   */
   public double totalSurfaceArea()
   {
      double total = 0;
      
      int i = 0;
      while (i < octaList.size()) 
      {
         total += octaList.get(i).surfaceArea();
         i++;
      }
      return total;
   }
   
   /**
   * @return the total volume of all Octahedron objects
   */
   public double totalVolume() 
   {
      double total = 0;
      
      int i = 0;
      while (i < octaList.size()) 
      {
         total += octaList.get(i).volume();
         i++;
      }   
      return total;
   }
   
   /**
   * @return the average SA of all Octahedron objects
   */
   public double averageSurfaceArea() 
   {  
      double average = 0;
      
      if (octaList.size() > 0) 
      {
         int i = 0;
         while (i < octaList.size()) 
         {
            average += octaList.get(i).surfaceArea();
            i++;
         }
         average = average / octaList.size();
      }
      return average;
   }
   
   /**
   * @return the average volume of all Octahedron objects
   */
   public double averageVolume() 
   {
      double average = 0;
      
      if (octaList.size() > 0)
      {
         int i = 0;
         while (i < octaList.size()) 
         {
            average += octaList.get(i).volume();
            i++;
         }
         average = average / octaList.size();
      }
      return average;
   }
   
   /**
   * @return the average SA to volume ratio of all Octahedron objects
   */
   public double averageSurfaceToVolumeRatio() 
   {
      double ratio = 0;
      
      if (octaList.size() > 0)
      {
         int i = 0;
         while (i < octaList.size())
         {
            ratio += octaList.get(i).surfaceToVolumeRatio();
            i++;
         }
         ratio = ratio / octaList.size();
      }
      return ratio;
   }
   
   /**
   * @return the compiled ArrayList of Octahedron objects
   */
   public String toString() 
   {
      String result = listName + "\n";
      
      int i = 0;
      while (i < octaList.size())
      {
         result += "\n" + octaList.get(i) + "\n"; 
         i++;  
      }   
      return result;
   }
   
   /**
   * @return the summarized data of all Octahedron objects in List
   */
   public String summaryInfo() 
   {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "";
      result += "----- Summary for " + getName() + " -----"; 
      result += "\nNumber of Octahedrons: " + numberOfOctahedrons();
      result += "\nTotal Surface Area: "
         + df.format(totalSurfaceArea()); 
      result += "\nTotal Volume: "
         + df.format(totalVolume());
      result += "\nAverage Surface Area: "
         + df.format(averageSurfaceArea());
      result += "\nAverage Volume: "
         + df.format(averageVolume());
      result += "\nAverage Surface/Volume Ratio: "
         + df.format(averageSurfaceToVolumeRatio());
      return result;
   }
}