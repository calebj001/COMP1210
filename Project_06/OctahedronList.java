import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
*
* This is the object class OctahedronList, which creates
* an ArrayList of Octahedron objects. It has several methods that
* OctahedronListMenuApp.java calls on for its menu functions.
*
* @author Caleb Johnson - COMP1210.
* @version 10/01/20.
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
   /**
   * @return the ArrayList
   */
   public ArrayList<Octahedron> getList()
   {
      return octaList;
   }
      
      /**
      * @throws FileNotFoundException if file not found
      * @param fileNameIn for file name
      * @return the ArrayList
      */
   public OctahedronList readFile(String fileNameIn)
      throws FileNotFoundException
   {
      String labelIn = "", colorIn = "", listNameIn = "";
      double edgeIn = 0;
      Scanner read = new Scanner(new File(fileNameIn));
      
      listNameIn = read.nextLine();
      
      while (read.hasNext())
      {
         labelIn = read.nextLine();
         colorIn = read.nextLine();
         edgeIn = Double.parseDouble(read.nextLine());
         
         Octahedron o = new 
            Octahedron(labelIn, colorIn, edgeIn);
         octaList.add(o);           
      }
      read.close();
      
      OctahedronList myOctaList = new OctahedronList(listNameIn, octaList);
      return myOctaList;
   }
    
    /**
    * @param label input
    * @param color input
    * @param edge input
    */
   public void addOctahedron(String label, String color, double edge)
   {
      Octahedron o = new Octahedron(label, color, edge);
            
      octaList.add(o);
   }
      
      /**
      * @param label for searched label
      * @return Octahedron Object
      */
   public Octahedron findOctahedron(String label)
   {
      for (Octahedron o : octaList)
      {  
         if (o.getLabel().equalsIgnoreCase(label))
         {
            return o;
         }
      }
      return null;
   }
    /**
    * @param label for label
    * @return either edited list of null
    */
   public Octahedron deleteOctahedron(String label)
   {
      int i = octaList.indexOf(findOctahedron(label));
      
      if (i >= 0)
      {
         return octaList.remove(i);
      } 
      else 
      {
         return null;
      }
   } 
   /**
   * @param label for label
   * @param color for color
   * @param edge for edge
   * @return edited list or null
   */
   public Octahedron editOctahedron(String label, String color, double edge)
   {
      int i = octaList.indexOf(findOctahedron(label));
      if (i >= 0)
      {
         octaList.get(i).setColor(color);
         octaList.get(i).setEdge(edge);
            
         return octaList.get(i);
      }
      return null;
   }
}