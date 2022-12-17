package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser
{
	protected static WebDriver driver;
public void browser()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\p_man\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://neostox.com/sign-in");
	driver.manage().window().maximize();
}
}
