/**
* This program creates Bank loans and keeps track of attributes such as
* customer name, interest rate, loan balance, and the number of loans created.
* It also has methods that affect its attributes.
*
* @author Caleb Johnson - COMP1210
* @version 10/12/20
*/
public class BankLoan {
        
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;
   private static int loansCreated = 0;
   
   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;

   // constructor
   
   /**
   * @param customerNameIn in for customer name
   * @param interestRateIn for interest rate
   */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }
   
   // methods
   
   /**
   * @param amount for amount borrowed
   * @return wasLoanMade if loan was/was not made
   */
   public boolean borrowFromBank(double amount) {
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
      return wasLoanMade;
   }
   
   /**
   * @param amountPaid for amount user pays bank
   * @return newBalance
   */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   
   /**
   * @return balance for loan balance
   */
   public double getBalance() {
      return balance;
   }
   
   /**
   * @param interestRateIn for interest rate
   * @return boolean returns if interest rate is set
   */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
   * @return interest rate for interest rate
   */
   public double getInterestRate() {
      return interestRate;
   }
   
   /**
   * @void no return
   */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   
   /**
   * @param amount for amount borrowed 
   * @return boolean if amount borrowed is a valid amount
   */
   public static boolean isAmountValid(double amount)
   {
      if (amount >= 0)
      {
         return true;
      }
      return false;
   }
   
   /**
   * @param loan for loan object
   * @return boolean if account holder is in debt
   */
   public static boolean isInDebt(BankLoan loan)
   {
      if (loan.getBalance() > 0)
      {
         return true;
      }
      return false;
   }
   
   /**
   * @return loansCredited for number of loans created
   */
   public static int getLoansCreated()
   {
      return loansCreated;
   }
   
   /**
   * @void no return
   */
   public static void resetLoansCreated()
   {
      loansCreated = 0;
   }
   
   /**
   * @return output for String summary of each loan objects attributes
   */
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }
}