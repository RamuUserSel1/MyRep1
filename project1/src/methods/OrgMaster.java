package methods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.WebElement;

public class OrgMaster {
	public static WebDriver driver;
	public static String expval,actval;
	public String org_Launch(String url)
	{	expval ="LOGIN";
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		actval = driver.findElement(By.id("btnLogin")).getAttribute("value");
		if(actval.equalsIgnoreCase(expval))
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}
	public String org_Login(String userName,String passWord)
	{	expval = "welcome";
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(passWord);
		driver.findElement(By.id("btnLogin")).click();
		Sleeper.sleepTightInSeconds(3);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		actval = driver.findElement(By.id("welcome")).getAttribute("id");
		if(actval.equalsIgnoreCase(expval))
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
		
	}
	public String org_Logout()
	{
		expval="LOGIN";
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		actval = driver.findElement(By.id("btnLogin")).getAttribute("value");
		if(actval.equalsIgnoreCase(expval))
		{
			return "Pass";
		}
		else
			
		{
			return "Fail";
		}
		
	}
	public void org_Close()
	{
		driver.close();
	}
	public String org_EmpReg(String firstName,String lastName)
	{
		expval = firstName+" "+lastName;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys(firstName);
		driver.findElement(By.id("lastName")).sendKeys(lastName);
		driver.findElement(By.id("btnSave")).click();
		actval = driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).getText();
		if(actval.equalsIgnoreCase(expval))
		{
			return "Pass";
		}
		else
		{
			return "Fail";
			
		}
		
		
	}
	public String org_UserReg(String ename,String userName,String passWord)
	{	expval = userName;
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.linkText("Users")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(ename);
		driver.findElement(By.id("systemUser_userName")).sendKeys(userName);
		driver.findElement(By.id("systemUser_password")).sendKeys(passWord);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(passWord);
		driver.findElement(By.id("btnSave")).click();
		List<WebElement> rows = driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr"));
		for(int i=0;i<=rows.size();i++)
		{
			List<WebElement>cols = rows.get(i).findElements(By.tagName("td"));
			actval = cols.get(1).getText();
			if(actval.equalsIgnoreCase(userName))
			{
				return "Pass";
			}
			
		}
		return "Fail";
		
	}
	public String org_UserLogin(String userName,String passWord)
	{
		expval = "welcome";
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(passWord);
		driver.findElement(By.id("txtPassword")).click();
		actval = driver.findElement(By.id("welcome")).getAttribute("id");
		if(actval.equalsIgnoreCase(expval))
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
		
	}
}
