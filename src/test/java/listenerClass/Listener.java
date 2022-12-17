package listenerClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import Base.LaunchBrowser;
import Utility.screenshotwaitScroll;
import noestoxPOM.Homepage;

public class Listener extends LaunchBrowser implements ITestListener
{
public void onTestFailure(ITestResult result) {
	// TODO Auto-generated method stub
	Reporter.log("Takes Screenshot",true);
screenshotwaitScroll s2 = new screenshotwaitScroll();
Homepage h1=new Homepage(driver);
try {
	s2.Screenshot(driver,h1.username());
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}
