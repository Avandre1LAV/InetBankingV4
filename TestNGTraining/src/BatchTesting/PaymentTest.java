package BatchTesting;

import org.testng.annotations.Test;

public class PaymentTest {
  @Test
  public void paymentInDollar() {
	  System.out.println("This payment by Dollar method...");
  }
  @Test
  public void paymentInRupees() {
	  System.out.println("This payment by Rupees method...");
  }
  
}
