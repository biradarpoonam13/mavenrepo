package noestoxPOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Passcode
{
@FindBy(xpath = "//input[@id='txt_accesspin']") private WebElement pass;
@FindBy(xpath = "//a[@id='lnk_submitaccesspin']") private WebElement submit;
public Passcode(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void password(String pass1) throws IOException, InterruptedException 
{
pass.sendKeys(pass1);	
Thread.sleep(1000);
submit.click();
}
}
