package Pom.Actitime.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Pom.Actitime.Generics.AutoConstant;
import Pom.Actitime.Generics.BasePage;
import Pom.Actitime.Generics.ExcelLibrary;


public class ActitimeCreateNewTypeOfWork extends BasePage implements AutoConstant
{
	public WebDriver driver;
	@FindBy(id="name")
	private WebElement name;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement createLink;
	
	public ActitimeCreateNewTypeOfWork(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createNewTypeOfWorkMethod() throws IOException
	{
		name.sendKeys(ExcelLibrary.getcellvalue(sheet_name3, 1, 0));
		//createLink.click();
		javascriptclick(driver, createLink);
	}
}
