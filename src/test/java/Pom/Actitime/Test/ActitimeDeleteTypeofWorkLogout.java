package Pom.Actitime.Test;

import java.io.IOException;

import org.testng.annotations.Test;

import Pom.Actitime.Generics.BaseTestActitime;
import Pom.Actitime.pages.ActitimeHomePage;
import Pom.Actitime.pages.ActitimeLoginPage;
import Pom.Actitime.pages.ActitimeTypesofWork;


public class ActitimeDeleteTypeofWorkLogout extends BaseTestActitime
{
	@Test
	public void deleteTypework() throws InterruptedException, IOException
	{
		ActitimeLoginPage loginPage = new ActitimeLoginPage(driver);
		loginPage.loginMethod();
		ActitimeHomePage home = new ActitimeHomePage(driver);
		home.settingsMethod();
		home.typesOfWorkMethod();
		ActitimeTypesofWork work = new ActitimeTypesofWork(driver);
		work.deleteWorkMethod();
		work.acceptalertPopup();
		home.logoutMethod();
	}
}
