import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
/** 
* This program calls on the OctahedronList and Octahedron classes to
* create Octahedron objects with switch case statements and loops.
* This allows the user to read a file and create a list, print the list,
* print the summary of the list, add an octahedron object, delete an
* octahedron object, find an octahedron with it's label, and edit an
* octahedron's color and edge. 
* 
*
* @author Caleb Johnson - COMP 1210
* @version 10/01/20
*/
public class OctahedronListMenuApp
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
      Scanner scan = new Scanner(System.in);
      String listName = "*** no list name assigned***";
      ArrayList<Octahedron> myList = new ArrayList<Octahedron>();
      OctahedronList myOctaList = new OctahedronList(listName, myList);
      
      System.out.print("Octahedron List System Menu\n"
                      + "R - Read File and Create Octahedron List\n"
                      + "P - Print Octahedron List\n"
                      + "S - Print Summary\n"
                      + "A - Add Octahedron\n"
                      + "D - Delete Octahedron\n"
                      + "F - Find Octahedron\n"
                      + "E - Edit Octahedron\n"
                      + "Q - Quit\n");
         
      String userInput = "";
      do
      {
         String label = "", color = "";
         double edge = 0;
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         
         userInput = scan.nextLine();
         if (userInput.length() == 0)
         {
            continue;
         }
         
         char input = userInput.toUpperCase().charAt(0);
         switch(input)
         {
            case 'R':
               System.out.print("\tFile Name: ");
               String fileName = scan.nextLine().trim();
               myOctaList = myOctaList.readFile(fileName);
               System.out.println("\tFile read in and "
                                 + "Octahedron List created\n");
               break;
               
            case 'P':
               System.out.println(myOctaList.toString());
               break;
               
            case 'S':
               System.out.println("\n" + myOctaList.summaryInfo() + "\n");
               break;
               
            case 'A':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tColor: ");
               color = scan.nextLine();
               System.out.print("\tEdge: ");
               edge = scan.nextDouble();
            
               myOctaList.addOctahedron(label, color, edge);
               System.out.println("\t*** Octahedron added ***\n");
               break;
               
            case 'D':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               
               if (myOctaList.deleteOctahedron(label) != null)
               {
                  myOctaList.deleteOctahedron(label);
                  System.out.println("\t\"" + label + "\" deleted\n");
               }
               else
               {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               
               break;
               
            case 'F':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               
               if (myOctaList.findOctahedron(label) != null)
               {
                  System.out.println(myOctaList.findOctahedron(label)
                                    .toString() + "\n");
               }
               else
               {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
               
            case 'E':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               String label1 = label.substring(0, 1).toUpperCase();
               String label2 = label.substring(1);
               label = label1 + label2;
               System.out.print("\tColor: ");
               color = scan.nextLine();
               System.out.print("\tEdge: ");
               edge = Double.parseDouble(scan.nextLine());
               if (myOctaList.findOctahedron(label) != null)
               {
                  Octahedron edit = myOctaList.editOctahedron(label,
                                       color, edge);
                  System.out.println("\t\"" + label
                                    + "\" successfully edited\n");
                  break;  
               }
               else
               {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
               
            default:
               System.out.println("\t*** invalid code ***\n");
         }
      } while (!userInput.equalsIgnoreCase("Q"));
   }
}