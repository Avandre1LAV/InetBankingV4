package BatchTesting;

import org.testng.annotations.Test;

public class LoginTest {
  @Test
  public void loginByEmail() {
	  System.out.println("Login By Email....");
  }
  @Test
  public void loginByFacebook() {
	  System.out.println("Login By Facebook....");
  }
  @Test
  public void loginByTwitter() {
	  System.out.println("Login By Twitter....");
  }
}
