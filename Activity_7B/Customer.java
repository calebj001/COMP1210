/**
* This class creates Customer objects with a name, loctaion, and balance.
* The class has methods to change and set these attributes, as well as compare
* two Customer objects to each other by implimenting the Comparable interface.
*
* @author Caleb Johnson - COMP1210
* @version 10/19/20
*/
public class Customer implements Comparable<Customer>
{
   // instance variables
   
   private String name = "";
   private String location = "";
   private double balance = 0;
   
   // constructor
   
   /**
   * @param nameIn for name
   */
   public Customer(String nameIn)
   {
      name = nameIn;
      location = "";
      balance = 0;
   }
   
   // methods
   
   /**
   * @param locationIn for location
   */
   public void setLocation(String locationIn)
   {
      location = locationIn;
   }
   
    /**
   * @param city for city
   * @param state for state
   */
   public void setLocation(String city, String state)
   {
      location = city + ", " + state;
   }
   
   /**
   * @param amount for new balance amount
   */
   public void changeBalance(double amount)
   {
      balance += amount;
   }
   
   /**
   * @return location for location
   */
   public String getLocation()
   {
      return location;
   }
   
   /**
   *  @return balance for current balance
   */
   public double getBalance()
   {
      return balance;
   }
   
   /**
   * @param obj for Customer object
   * @return int value determining relationship between 2 objects
   */
   public int compareTo(Customer obj)
   {
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001)
      {
         return 0; // consider them equal and return 0
      }
      else if (this.balance < obj.getBalance())
      {
         return -1; // should return a negative number
      }
      else
      {
         return 1; // should return a positive number
      }
   }
   
   /**
   * @return output for String output of Customer attributes
   */
   public String toString()
   {
      String output = "";
      
      output += name;
      output += "\n" + location;
      output += "\n$" + balance;
      
      return output;
   }
}