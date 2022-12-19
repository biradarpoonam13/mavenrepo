package noestoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	@FindBy(id = "lbl_username") private WebElement exceptedUID;
	@FindBy(xpath = "(//a[text()='OK'])[2]") private WebElement pop;
	@FindBy(xpath = "(//a[text()='Close'])[5]") private WebElement close; 
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	public String username()
	{
		String username=exceptedUID.getText();
		return username;
	}
	public void popuphandle() throws InterruptedException
	{
		Thread.sleep(2000);
		if(pop.isDisplayed())
		{
			Thread.sleep(2000);
			pop.click();
			Thread.sleep(2000);
			close.click();
		}
		else
		{
			System.out.println("no popup visible");
		}
	}
	
	
}	
