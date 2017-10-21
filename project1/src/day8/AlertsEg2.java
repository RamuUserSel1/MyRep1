package day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsEg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationminds.com/selenium-practice-pages/handling-alerts-using-selenium/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='main']/p[5]/button")).click();
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();

	}

}
