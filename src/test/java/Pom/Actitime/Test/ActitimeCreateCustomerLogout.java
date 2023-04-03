package Pom.Actitime.Test;

import java.io.IOException;

import org.testng.annotations.Test;

import Pom.Actitime.Generics.BaseTestActitime;
import Pom.Actitime.pages.ActitimeCreateNewCustomerPage;
import Pom.Actitime.pages.ActitimeHomePage;
import Pom.Actitime.pages.ActitimeLoginPage;
import Pom.Actitime.pages.ActitimeTasksPage;


public class ActitimeCreateCustomerLogout extends BaseTestActitime
{
	@Test
	public void createCustomer() throws IOException, InterruptedException
	{
		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
		loginPage.loginMethod();
		ActitimeTasksPage task = new ActitimeTasksPage(driver);
		task.taskMethod();
		task.addNewMethod();
		task.addNewCustomerMethod();
		ActitimeCreateNewCustomerPage newCustomer = new ActitimeCreateNewCustomerPage(driver);
		newCustomer.enterCustomerNameMethod();
		newCustomer.enterCustomerDescriptionMethod();
		newCustomer.createCustomerMethod();
		ActitimeHomePage home = new ActitimeHomePage(driver);
		home.logoutMethod();
	}
	
}
