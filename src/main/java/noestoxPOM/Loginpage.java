package noestoxPOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.ExtractdatafromProperties;

public class Loginpage
{
@FindBy(xpath = "//input[@id='MainContent_signinsignup_txt_mobilenumber']") private WebElement mobileno1;
@FindBy(xpath = "//a[@id='lnk_signup1']") private WebElement signbtn;

public Loginpage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void login(String mobileno) throws IOException
{
	
	mobileno1.sendKeys(mobileno);
	signbtn.click();
}

}
