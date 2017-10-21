package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class KeyBoardMouseOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		Actions act = new Actions(driver);
		//focus on the gmail link
		act.moveToElement(gmail).build().perform();
		Sleeper.sleepTightInSeconds(3);
		//right click 
		act.contextClick().build().perform();
		//act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
		//act.sendKeys(Keys.ENTER).build().perform();
		act.sendKeys(Keys.chord("P")).build().perform();
	}
	
}
	