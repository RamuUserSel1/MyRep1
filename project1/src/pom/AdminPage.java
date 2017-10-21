package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage {
	@FindBy(linkText="Admin")
	WebElement admin;
	
	@FindBy(linkText="PIM")
	WebElement pim;
	
	@FindBy(linkText="Leave")
	WebElement leave;
	
	@FindBy(linkText="Time")
	WebElement time;
	
	@FindBy(linkText="Recruitment")
	WebElement recruitment;
	
	@FindBy(linkText="Performance")
	WebElement performance;
	
	@FindBy(linkText="Dashboard")
	WebElement dashboard;
	
	@FindBy(linkText="Directory")
	WebElement directory;
	
	@FindBy(partialLinkText="Welcome")
	WebElement welcome;
	
	@FindBy(linkText="Logout")
	WebElement logout;
	
	public void adminClick()
	{
		admin.click();
	}
	
	public void pimClick()
	{
		pim.click();
	}
	
	
	public void leaveClick()
	{
		leave.click();
	}
	
	public void timeClick()
	{
		time.click();
	}
	
	public void recruitmentClick()
	{
		recruitment.click();
	}
	
	public void performanceClick()
	{
		performance.click();
	}
	
	public void dashboardClick()
	{
		dashboard.click();
	}
	
	public void directoryClick()
	{
		directory.click();
	}
	
	public void welcomeClick()
	{
		welcome.click();
	}
	
	public void logoutClick()
	{
		logout.click();
	}
	
}
