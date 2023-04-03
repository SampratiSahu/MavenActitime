package Pom.Actitime.Test;

import java.io.IOException;

import org.testng.annotations.Test;

import Pom.Actitime.Generics.BaseTestActitime;
import Pom.Actitime.pages.ActitimeHomePage;
import Pom.Actitime.pages.ActitimeLoginPage;


public class ActitimeLoginLogout extends BaseTestActitime
{

	@Test
	public void loginlogout() throws IOException, InterruptedException
	{
		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
		loginPage.loginMethod();
		
		ActitimeHomePage homePage = new ActitimeHomePage(driver);
		homePage.logoutMethod();
	}

}
