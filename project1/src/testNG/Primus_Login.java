package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Primus_Login {
	public static WebDriver driver;
	@BeforeClass
	public void br_Launch()
	{
		driver = new FirefoxDriver();
	}
	@BeforeMethod
	public void app_Launch()
	{
		driver.get("http://primusbank.qedgetech.com");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	@Test
	public void Login_PrimusBank()
	{
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
	}
	@AfterMethod
	public void Logout_PrimusBank()
	{
		driver.findElement(By.xpath(".//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
	}
	@AfterClass
	public void close()
	{
		driver.close();
	}
}
