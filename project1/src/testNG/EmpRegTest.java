package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpRegTest extends TestNGMaster {
	@Test(dataProvider="data")
	public void org_empreg(String firstName,String lastName)
	{
		expval = firstName+" "+lastName;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys(firstName);
		driver.findElement(By.id("lastName")).sendKeys(lastName);
		driver.findElement(By.id("btnSave")).click();
		actval = driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).getText();
		Assert.assertEquals(actval, expval,"Emp Registration Failed");
	}
	@DataProvider
	public Object[][] data()
	{
		Object [][]d = new Object[3][2];
		d[0][0]="Venky";
		d[0][1]="C";
		d[1][0]="Pinky";
		d[1][1]="P";
		d[2][0]="Minky";
		d[2][1]="M";
		return d;
	}

}
