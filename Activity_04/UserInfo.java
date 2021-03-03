/**
*
* 
*
* @author Caleb Johnson - COMP1210.
* @version 9/15/20.
*/
public class UserInfo {
   // Instance variables:
   private String firstName, lastName, location;
   private int age, status;
   private static final int OFFLINE = 0, ONLINE = 1;
   // Constructor:
   
   /**
   * @param firstNameIn User's first name
   * @param lastNameIn User's last name
   */
   public UserInfo(String firstNameIn, String lastNameIn)  {
   
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
   
   // Methods:
   
   /**
   * @return Returns User's input as Strings
   */
   public String toString() {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      
      if (status == OFFLINE) {
         output += "Offline";
      } else {
         output += "Online";
      }
      
      return output;
   }
   
   /**
   * Sets the user's location.
   * @param locationIn User's location
   */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   
   /**
   * Sets the Users age.
   * @param ageIn User's age
   * @return Returns the User's age and isSet boolean
   */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;  
   }
   
   /**
   * Returns the User's age.
   * @return Returns the age
   */
   public int getAge() {
      return age;
   }
   
   /**
   * Returns the User's location.
   * @return Returns the location
   */
   public String getLocation() {
      return location;
   }
   
   /**
   * Sets User status to offline.
   */
   public void logOff() {
      status = OFFLINE;
   }
   
   /**
   * Sets User status to online.
   */
   public void logOn() {
      status = ONLINE;
   }
}