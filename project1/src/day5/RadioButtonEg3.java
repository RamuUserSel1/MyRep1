package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonEg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		List<WebElement> radios1 = driver.findElements(By.name("group1"));
		System.out.println(radios1.size());
		for(int i=0;i<radios1.size();i++)
		{
			System.out.println(radios1.get(i).getAttribute("value"));
			if(radios1.get(i).getAttribute("value").equalsIgnoreCase("cheese"))
					{
						radios1.get(i).click();
					}
		}

	}

}
