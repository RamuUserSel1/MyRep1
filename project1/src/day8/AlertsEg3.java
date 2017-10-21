package day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class AlertsEg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationminds.com/selenium-practice-pages/handling-alerts-using-selenium/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='main']/p[7]/button")).click();
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.sendKeys("No");
		Sleeper.sleepTightInSeconds(3);
		alt.accept();
		

	}

}
