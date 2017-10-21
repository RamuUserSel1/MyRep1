package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkEg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		//Method1 by using xpath
//driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td/ul/li[1]/a")).click();
		//Method2 by using block
		/*WebElement block = driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td"));
		List<WebElement> links = block.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			if(links.get(i).getText().equalsIgnoreCase("hOMe"))
			{
				links.get(i).click();
				break;
			}
			
		}*/
		//Method 3
		WebElement block = driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td"));
		block.findElement(By.linkText("Home")).click();
		

	}

}
