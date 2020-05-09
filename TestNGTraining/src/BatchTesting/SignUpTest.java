package BatchTesting;

import org.testng.annotations.Test;

public class SignUpTest {
  @Test
  public void signUpByEmail() {
	  System.out.println("SignUp By Email...");
  }
  @Test
  public void signUpByFacebook() {
	  System.out.println("SignUp By Facebook...");
  }
  @Test
  public void signUpByTwitter() {
	  System.out.println("SignUp By Twitter...");
  }
}
