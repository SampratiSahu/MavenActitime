package Pom.Actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Pom.Actitime.Generics.AutoConstant;
import Pom.Actitime.Generics.BasePage;


public class ActitimeTypesofWork extends BasePage implements AutoConstant
{
	WebDriver driver;
	@FindBy(xpath="//span[.='Create Type of Work']")
	private WebElement createTypeofWork;
	@FindBy(xpath="//a[.='WFH']/../..//a[contains(text(),'delete')]")
	private WebElement deleteWorkButton;
	
	public ActitimeTypesofWork(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createTypeofWorkMethod()
	{
		//createTypeofWork.click();
		javascriptclick(driver, createTypeofWork);
	}
	public void deleteWorkMethod() throws InterruptedException
	{
		Thread.sleep(6000);
		//deleteWorkButton.click();
		javascriptclick(driver, deleteWorkButton);
	}
	public void acceptalertPopup() throws InterruptedException
	{
		//driver.switchTo().alert().accept();
		Thread.sleep(3000);
		alertaccept(driver);
	}
}
