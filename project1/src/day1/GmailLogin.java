package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GmailLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		//open gmail.com
		driver.get("http://gmail.com");
		//maximize the browser
		driver.manage().window().maximize();
		//Global Implicit Wait statement
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		//identify the email text box
		
		WebElement email = driver.findElement(By.id("identifierId"));
		//enter text in email text box
		email.sendKeys("venkatc2544@gmail.com");
		//identify the next button and click
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content")).click();
		//enter password 
		//Sleeper.sleepTightInSeconds(3);
		driver.findElement(By.name("password")).sendKeys("behumble2");
		driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
		//close the browser
		//driver.close();

	}

}
