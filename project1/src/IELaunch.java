import org.openqa.selenium.ie.InternetExplorerDriver;


public class IELaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "D:/IEDriver/IEDriverServer.exe");
		InternetExplorerDriver driver =new InternetExplorerDriver();
		driver.get("http://seleniumhq.org");
	}

}
