package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Drag_DropEg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/draggable");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		Actions act = new Actions(driver);
		Sleeper.sleepTightInSeconds(2);
		
		act.dragAndDropBy(drag, 192, 122).build().perform();
		Sleeper.sleepTightInSeconds(3);
		

	}

}
