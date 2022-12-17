package Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class screenshotwaitScroll
{
	public void Screenshot(WebDriver driver,String filename) throws IOException 
	{
	TakesScreenshot ts=(TakesScreenshot)driver;	
	File source=ts.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\p_man\\Downloads\\Screenshot\\"+filename+".png"); 
	FileHandler.copy(source, destination);
	}
	public void waituse(WebDriver driver, int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
	}
public void scroll(WebDriver driver,WebElement element)
{
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)",element);
}
	
	
}
