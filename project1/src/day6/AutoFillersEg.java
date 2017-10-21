package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class AutoFillersEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.redbus.in");
		driver.manage().window().maximize();
		WebElement src = driver.findElement(By.id("src"));
		src.sendKeys("s");
		Sleeper.sleepTightInSeconds(3);
		List<WebElement>fromCities = driver.findElements(By.xpath(".//*[@id='search']/div/div[1]/div/ul/li"));
		System.out.println(fromCities.size());
		for(int i=0;i<fromCities.size();i++)
		{
			String fromCity = fromCities.get(i).getText();
			System.out.println(fromCity);
			if(fromCity.equalsIgnoreCase("surat"))
			{
				fromCities.get(i).click();
				break;
			}
		}
		
		
	}

}
