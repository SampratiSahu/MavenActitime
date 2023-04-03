package Pom.Actitime.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Pom.Actitime.Generics.AutoConstant;
import Pom.Actitime.Generics.BasePage;
import Pom.Actitime.Generics.ExcelLibrary;


public class ActitimeTasksPage extends BasePage implements AutoConstant
{
	WebDriver driver;
	
	@FindBy(id="container_tasks")
	private WebElement taskLink;
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addNewLink;
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement addNewCustomer;
	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]")
	private WebElement searchClientBar;
	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]/../../..//div[@class='icon']")
	private WebElement clientsearchbutton;
	@FindBy(xpath = "//span[@class='highlightToken']")
	private WebElement clickonname;
	@FindBy(xpath = "(//div[.='Sammy123'])[2]/..//div[@class='editButton']")
	private WebElement Settingbutton;
	
	public ActitimeTasksPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void taskMethod()
	{
		//taskLink.click();
		javascriptclick(driver, taskLink);
	}
	public void addNewMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		//addNewLink.click();
		javascriptclick(driver, addNewLink);
	}
	public void addNewCustomerMethod() throws InterruptedException
	{
		Thread.sleep(4000);
		//addNewCustomer.click();
		javascriptclick(driver, addNewCustomer);
	}
	public void clientSearchMethod() throws IOException
	{
		searchClientBar.sendKeys(ExcelLibrary.getcellvalue(sheet_name2, 1, 0));
		
	}
	public void clientNameSettingsMethod() throws InterruptedException
	{
		//clientsearchbutton.click();
		javascriptclick(driver, clientsearchbutton);
		Thread.sleep(2000);
	}
	public void clickOnNameMethod() throws InterruptedException
	{
		Thread.sleep(5000);
		//clickonname.click();
		javascriptclick(driver, clickonname);
		Thread.sleep(3000);
	}
	public void clickSettingsMethod() throws InterruptedException
	{
		Thread.sleep(2000);
		//Settingbutton.click();
		javascriptclick(driver, Settingbutton);
	}
	
}
