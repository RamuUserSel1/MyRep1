package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		driver.get("http://khuranatravel.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='outerWrapper']/div[2]/div[5]/div/a")).click();
		WebElement fromCity = driver.findElement(By.id("fromCity"));
		Select from = new Select(fromCity);
		from.selectByIndex(1);
		Sleeper.sleepTight(3);
		from.selectByValue("170|Akola");
		Sleeper.sleepTight(3);
		from.selectByVisibleText("Baroda");
		/*List<WebElement> fromCities = from.getOptions();
		System.out.println(fromCities.size());
		for(int i=0;i<fromCities.size();i++)
		{
			System.out.println(fromCities.get(i).getText());
			fromCities.get(i).click();
		}*/
		

	}

}
