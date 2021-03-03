import org.junit.Assert;
import static org.junit.Assert;
import org.junit.Test;


public class BankLoanTest {
   
    /** Tests the chargeInterest method. */
   @Test public void chargeInterestTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      loan1.borrowFromBank(1000.00);
      loan1.chargeInterest();
      Assert.assertEquals(" ", 1100, loan1.getBalance(), 0.000001);
   }

}
