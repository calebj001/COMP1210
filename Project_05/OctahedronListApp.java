import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/** 
* This program calls on the OctahedronList and Octahedron classes to
* create Octahedron objects from a scanned text file, and then generate
* an ArrayList of the objects, which it prints out along with a summary
* of all the data found in tbe list.
*
* @author Caleb Johnson - COMP 1210
* @version 9/23/20
*/
public class OctahedronListApp
{
   /**
* Reads file with octahedron data, creates OctahedronList, 
* prints OctahedronList, prints summary of OctahedronList.
*
* @param args - is not used.
* @throws FileNotFoundException required by Scanner for File
*/
   public static void main(String[] args) throws FileNotFoundException
   {
      ArrayList<Octahedron> myList = new ArrayList<Octahedron>();
   
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      
      Scanner scanFile = new Scanner(new File(fileName));
      String listName = scanFile.nextLine();
      
      while (scanFile.hasNext())
      {
         String labelIn = scanFile.nextLine();
         String colorIn = scanFile.nextLine();
         String edgeIn = scanFile.nextLine();
         
         Octahedron o = new 
            Octahedron(labelIn, colorIn, Double.parseDouble(edgeIn));
         myList.add(o);           
      }
      scanFile.close();
      
      OctahedronList myOctahedronList =
         new OctahedronList(listName, myList);
   
      System.out.println("\n" + myOctahedronList);
      
      System.out.println("\n" + myOctahedronList.summaryInfo());
   }
}
