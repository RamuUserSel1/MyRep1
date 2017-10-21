package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class ValidationEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expval ="Google";
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(3);
		String actval = driver.getTitle();
		if(expval.equalsIgnoreCase(actval))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
				

	}

}
