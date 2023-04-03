package Pom.Actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Pom.Actitime.Generics.AutoConstant;
import Pom.Actitime.Generics.BasePage;


public class ActitimeHomePage extends BasePage implements AutoConstant
{
	public WebDriver driver;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement settingsLink;
	@FindBy(xpath="//a[.='Types of Work']")
	private WebElement typesofWorkLink;
	@FindBy(xpath="//a[.='Leave Types']")
	private WebElement leaveTypeLink;
	@FindBy(id="container_tasks")
	private WebElement taskLink;
	@FindBy(xpath="//a[.='Logout']")
	private WebElement logoutLink;
	
	public ActitimeHomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void settingsMethod() 
	{
		javascriptclick(driver, settingsLink);
	}
	public void typesOfWorkMethod() throws InterruptedException
	{
		Thread.sleep(2000);
		javascriptclick(driver, typesofWorkLink);
	}
	public void leaveTypeMethod() throws InterruptedException
	{
		Thread.sleep(2000);
		javascriptclick(driver, leaveTypeLink);
	}
	public void taskMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		javascriptclick(driver, taskLink);
	}
	public void logoutMethod() throws InterruptedException
	{
		Thread.sleep(2000);
		javascriptclick(driver, logoutLink);
	}
}
