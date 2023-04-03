package Pom.Actitime.Generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestActitime implements AutoConstant
{
public WebDriver driver;
	
	@BeforeSuite
	public void executionStart()
	{
		System.out.println("execution started");
	}
	
	@BeforeClass
	public void setup()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(url1);
	}
	
	@AfterClass
	public void teardown()
	{
		//driver.quit();
	}
	
	@AfterSuite
	public void executionComplete()
	{
		System.out.println("execution completed");
	}

}
