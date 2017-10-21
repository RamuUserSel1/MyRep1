package methods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MethodsEg {
	public static WebDriver driver = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		function1();
		String res = function2();
		System.out.println(res);
		MethodsEg m = new MethodsEg();
		m.function3();
		boolean res1= m.function4();
		System.out.println(res1);
	}
	public static void function1()
	{
		System.out.println("Function1 code");
	}
	public static String function2()
	{
		System.out.println("Function2 code");
		return "Pass";
	}
	public void function3()
	{
		System.out.println("Function3 code");
	}
	public boolean function4()
	{
		System.out.println("Function4 code");
		return true;
	}
	public int sum(int a,int b)
	{
		int c= a+b;
		return c;
	}
	public void takescreenshot(String path) throws  IOException
	{
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(path));
	}
	public void LaunchBrowser(String br)
	{
		if (br.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D://ChromeDriver//chromedriver.exe");
			driver = new ChromeDriver();
		}
		if(br.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
			
	}
	
	}
