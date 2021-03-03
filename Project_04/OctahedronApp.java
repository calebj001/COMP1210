import java.util.Scanner;
/**
*
* This main class creates an Octahedron obj and calls on Octahedron.java to
* format the input values and calculate all other values before printing the
* output generated in the Octahedron.java.
* 
* @author Caleb Johnson - COMP1210.
* @version 9/16/20.
*/
public class OctahedronApp {

 /**
 * @param args Command line arguments - not used.
 */
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      String label, color, edge;
      
      System.out.println("Enter label, color, and edge length "
         + "for an octahedron.");
      System.out.print("\tlabel: ");
      label = input.nextLine();
      System.out.print("\tcolor: ");
      color = input.nextLine();
      System.out.print("\tedge: ");
      edge = input.nextLine();
      
      
      if (Double.parseDouble(edge) < 0) {
         System.out.println("Error: edge must be non-negative.");
      } else {
      
         Octahedron octa = new Octahedron(label, color,
            Double.parseDouble(edge));
         
         octa.setLabel(label);
         octa.setColor(color);
         octa.setEdge(Double.parseDouble(edge));
         octa.surfaceArea();
         octa.volume();
         octa.surfaceToVolumeRatio();
         
         
         System.out.println("\n" + octa);
      }
      
   }
}