package Pom.Actitime.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Pom.Actitime.Generics.AutoConstant;
import Pom.Actitime.Generics.BasePage;
import Pom.Actitime.Generics.ExcelLibrary;


public class ActitimeLoginPage extends BasePage implements AutoConstant
{
	public WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement usernameTextfield;
	
	@FindBy(name = "pwd")
	private WebElement passwordTextfield;
	
	@FindBy(id = "loginButton")
	private WebElement loginButton;
	
	public ActitimeLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod() throws IOException, InterruptedException
	{
		usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name, 1, 0));
		passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name, 1, 1));
		javascriptclick(driver, loginButton);
		Thread.sleep(3000);
		
	}

}
