package methods;

import java.io.IOException;

public class ReuseEg 
{
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		MethodsEg m = new MethodsEg();
		int res = m.sum(20, 40);
		System.out.println(res);
		m.LaunchBrowser("chrome");
		m.driver.get("http://www.gmail.com");
		m.takescreenshot("d:\\test3.png");
	}

}
