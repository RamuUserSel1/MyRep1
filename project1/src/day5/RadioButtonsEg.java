package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://cleartrip.com");
		WebElement block = driver.findElement(By.xpath(".//*[@id='SearchForm']/nav"));
		List<WebElement> radioButtons = block.findElements(By.tagName("input"));
		for(int i=0;i<radioButtons.size();i++)
		{
			String text = radioButtons.get(i).getAttribute("value");
			System.out.println(text);
			if(text.equalsIgnoreCase("MultiCity"))
				radioButtons.get(i).click();
		}

	}

}
