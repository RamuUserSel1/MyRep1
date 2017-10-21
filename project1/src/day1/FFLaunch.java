package day1;

import org.openqa.selenium.firefox.FirefoxDriver;


public class FFLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		//maximize the browser
		driver.manage().window().maximize();
		
	}

}
