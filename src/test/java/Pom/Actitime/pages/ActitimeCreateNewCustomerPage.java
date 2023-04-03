package Pom.Actitime.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Pom.Actitime.Generics.AutoConstant;
import Pom.Actitime.Generics.BasePage;
import Pom.Actitime.Generics.ExcelLibrary;


public class ActitimeCreateNewCustomerPage extends BasePage implements AutoConstant
{
	public WebDriver driver;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement enterCustomerNameTextfield;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustomerDescriptionTextBox;
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createCustomerButton;
	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	private WebElement cancelButton;
	
	public ActitimeCreateNewCustomerPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterCustomerNameMethod() throws InterruptedException, IOException
	{
		Thread.sleep(5000);
		enterCustomerNameTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name2, 1, 0));
	}
	public void enterCustomerDescriptionMethod() throws IOException
	{
		enterCustomerDescriptionTextBox.sendKeys(ExcelLibrary.getcellvalue(sheet_name2, 1, 1));
	}
	public void createCustomerMethod()
	{
		//createCustomerButton.click();
		javascriptclick(driver, createCustomerButton);
	}
	public void cancelMethod()
	{
		//cancelButton.click();
		javascriptclick(driver, cancelButton);
	}
	public void acceptalert() throws InterruptedException
	{
		//driver.switchTo().alert().accept();
		acceptalert();
		Thread.sleep(3000);
	}
	
}
