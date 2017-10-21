package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://ChromeDriver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();

	}

}
