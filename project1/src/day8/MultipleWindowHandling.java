package day8;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Help")).click();
		Set<String> wIds = driver.getWindowHandles();
		Iterator<String> it = wIds.iterator();
		while(it.hasNext())
		{
			 String s = it.next();
			 System.out.println(s);
			 driver.switchTo().window(s);
			 //System.out.println(driver.getTitle()+"----"+driver.getCurrentUrl());
			 try
			 {
				 driver.findElement(By.xpath("html/body/div[2]/header/div[5]/div/div/div/span/a/span")).click();
				 System.out.println("Expected link is found");
				 break;
			 }
			 catch(Exception e)
			 {
				 System.out.println("Link 'Google Account Help' is not found");
			 }
		}
		driver.quit();
		//driver.findElement(By.xpath("html/body/div[2]/header/div[5]/div/div/div/span/a/span")).click();
	}

}
