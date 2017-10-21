package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExpectedLinkCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		//System.out.println(links.size());
		for(int i=0;i<links.size();i++)
			if(links.get(i).getText().equals("Gmail"))
			{
				links.get(i).click();
				break;
			}
			
		
		

	}

}
