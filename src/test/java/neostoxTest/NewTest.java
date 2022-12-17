package neostoxTest;

import org.testng.annotations.Test;

import Base.LaunchBrowser;
import Utility.ExtractdatafromProperties;
import Utility.screenshotwaitScroll;
import noestoxPOM.Homepage;
import noestoxPOM.Loginpage;
import noestoxPOM.Passcode;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

@Listeners(listenerClass.Listener.class)
public class NewTest extends  LaunchBrowser
{
	Homepage home;
	Loginpage login;
	Passcode pass;
	screenshotwaitScroll s1;
	
	
@Test
  public void validateuser() throws IOException, InterruptedException
  {
	s1.waituse(driver, 1000);
	  home.popuphandle();
	  s1.waituse(driver,1000);
	  String username = home.username();
	  Assert.assertEquals(username,ExtractdatafromProperties.properties("exceptedusername"));
	  Reporter.log("validate userid");
  }
  @BeforeMethod
  public void beforeMethod() throws IOException, InterruptedException 
  {
  s1.waituse(driver,1000);
  login.login(ExtractdatafromProperties.properties("mobileno"));
  s1.waituse(driver,2000);
  pass.password(ExtractdatafromProperties.properties("password"));
  }

  @AfterMethod
  public void afterMethod() 
  {
	 
  }

  @BeforeClass
  public void beforeClass() 
  {
     browser();
      home= new Homepage(driver);
      login=new Loginpage(driver);
     pass=new Passcode(driver);
      s1= new screenshotwaitScroll(); 
  }

  @AfterClass
  public void afterClass() {
  }

}
