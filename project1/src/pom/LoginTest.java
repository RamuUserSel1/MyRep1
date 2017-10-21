package pom;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class LoginTest extends Constants {
	@Test
	public void Login()
	{
		
		driver.get(lp.url);
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(3);
		lp.login(lp.u, lp.p);
		Sleeper.sleepTightInSeconds(3);
		ap.adminClick();
		ap.welcomeClick();
		ap.logoutClick();
		driver.close();
		
	}

}