package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGMaster {
public static WebDriver driver;
public static String expval,actval;
public static String url="http://opensource.demo.orangehrmlive.com";
public static String userName="Admin",passWord="admin";
public static String firstName="TestNGEmpf7",lastName="TestNGEmpl7";
public static String ename=firstName+" "+lastName,u="TestNGu5",p="TestNGu5";
	//@BeforeSuite
	@BeforeTest
	public  void org_Launch()
	{
		expval ="LOGIN";
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		actval = driver.findElement(By.id("btnLogin")).getAttribute("value");
		Assert.assertEquals(actval, expval,"Launch Failed");
	}
	//@BeforeTest
	@BeforeClass
	public void org_Login()
	{
		expval = "welcome";
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(passWord);
		driver.findElement(By.id("btnLogin")).click();
		Sleeper.sleepTightInSeconds(3);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		actval = driver.findElement(By.id("welcome")).getAttribute("id");
		Assert.assertEquals(actval, expval,"Login Failed");
		
	}
	//@AfterTest
	@AfterClass
	public void org_Logout()
	{
		expval="LOGIN";
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		actval = driver.findElement(By.id("btnLogin")).getAttribute("value");
		Assert.assertEquals(actval,expval,"Logout Failed");
	}
	//@AfterSuite
	@AfterClass
	public void org_Close()
	{
		driver.close();
	}
	

}
