package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	public static String url="http://opensource.demo.orangehrmlive.com/";
	public static String u="Admin",p="admin";
	@FindBy(id="txtUsername")
	WebElement userName;
	
	@FindBy(id="txtPassword")
	WebElement passWord;
	
	@FindBy(id="btnLogin")
	WebElement loginBtn;
	
	public void login(String un,String pw)
	{
		userName.sendKeys(un);
		passWord.sendKeys(pw);
		loginBtn.click();
	}
}