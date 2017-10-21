package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarOps1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		String date = "19/December/2018";
		String[] split =date.split("/");
		String day= split[0];
		String month=split[1];
		String year = split[2];
		driver.findElement(By.id("DepartDate")).click();
		String cyear = driver.findElement(By.className("ui-datepicker-year")).getText();
		while(!cyear.equals(year))
		{
			driver.findElement(By.className("nextMonth")).click();
			cyear = driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		String cmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		while(!cmonth.equalsIgnoreCase(month))
		{	
			driver.findElement(By.className("nextMonth")).click();
			cmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			
		}
		List<WebElement> cday = driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr/td"));
		for(int i=0;i<cday.size();i++)
		{
			if(cday.get(i).getText().equals(day))
			{
				cday.get(i).click();
				break;
			}
		}
		
		
	}

}
