package Listener;

import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginTest {
  @Test()
  public void loginByEmail() {
	  System.out.println("Login By Email.....");
	  Assert.assertEquals("pavan", "pavan");  //true
  }
  @Test
  public void loginByFacebook() {
	  System.out.println("Login By Facebook.....");
	  Assert.assertEquals("pavan", "kumar");  //false
  }
}
