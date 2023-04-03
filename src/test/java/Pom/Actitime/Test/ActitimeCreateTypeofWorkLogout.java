package Pom.Actitime.Test;

import java.io.IOException;

import org.testng.annotations.Test;

import Pom.Actitime.Generics.BaseTestActitime;
import Pom.Actitime.pages.ActitimeCreateNewTypeOfWork;
import Pom.Actitime.pages.ActitimeHomePage;
import Pom.Actitime.pages.ActitimeLoginPage;
import Pom.Actitime.pages.ActitimeTypesofWork;


public class ActitimeCreateTypeofWorkLogout extends BaseTestActitime
{
	@Test
	public void createTypeofWork() throws IOException, InterruptedException
	{
		ActitimeLoginPage login = new ActitimeLoginPage(driver);
		login.loginMethod();
		ActitimeHomePage home = new ActitimeHomePage(driver);
		home.settingsMethod();
		home.typesOfWorkMethod();
		ActitimeTypesofWork work = new ActitimeTypesofWork(driver);
		work.createTypeofWorkMethod();
		ActitimeCreateNewTypeOfWork newWork = new ActitimeCreateNewTypeOfWork(driver);
		newWork.createNewTypeOfWorkMethod();
		
		home.logoutMethod();
	}

}
