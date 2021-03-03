/**
* Prints name and short-term, medium-term, and long-term life goals in stdout.
* 3 Life goals lines are at least 100 characters in length.
*
* Project 1 - MyLifeGoals
* @author Caleb Johnson - COMP1210.
* @version 23 August, 2020.
*/
public class MyLifeGoals
{
   /**
   * Prints name, a blank line, and 3 lines of life goals.
   * @param args Command line arguments - not used.
   */
   public static void main(String[] args)
   {
   
      // Prints name.
      System.out.println("Caleb Johnson");
      
      // Prints spacer line
      System.out.println();
      
      // Prints short-term life goals.
      System.out.println("In the immediate future, I want to succeed in my"
         + " first semester of college and learn to use JAVA proficiently."
         + " I also hope to learn to manage my time more effectively"
         + " and get better with my people skills.");
      
      // Prints medium-term life goals.
      System.out.println("In the next few years, I hope to graduate from"
         + " Auburn University with my BS in Aerospace Engineering and a minor"
         + " in Computer Science. I would like to enter the workforce as a"
         + " civil servant working for the Department of Defense (necessary for"
         + " a scholarship) before transitioning into the commercial sector"
         + " to work with a payload design team at NASA or SpaceX.");
      
      // Prints long-term life goals.
      System.out.println("In the far off future, I hope to have saved up enough"
         + " money throughout my career to retire and enjoy my family. I would"
         + " especially like to travel the world and experience all of the"
         + " different cultures that I was unable to enjoy during my career.");
      
   }
}