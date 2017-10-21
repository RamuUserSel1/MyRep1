package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegTest extends TestNGMaster{
	@Test
	public void org_userReg()
	{
		boolean flag = false;
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.linkText("Users")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(ename);
		driver.findElement(By.id("systemUser_userName")).sendKeys(u);
		driver.findElement(By.id("systemUser_password")).sendKeys(p);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(p);
		driver.findElement(By.id("btnSave")).click();
		List<WebElement> rows = driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr"));
		for(int i=0;i<=rows.size();i++)
		{
			List<WebElement>cols = rows.get(i).findElements(By.tagName("td"));
			actval = cols.get(1).getText();
			if(actval.equalsIgnoreCase(userName))
			{
				flag=true;
				break;
			}
			
		}
		Assert.assertEquals(flag, true);
		
	}
		
	}


