package day10;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class FileDownload1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		driver.get("http://seleniumhq.org/download");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("3.5.3")).click();
		Sleeper.sleepTightInSeconds(3);
		Runtime.getRuntime().exec("‪D:\\Selenium\\TestCases\\DownLd.exe");

	}

}
