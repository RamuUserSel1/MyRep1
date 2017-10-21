package methods;

public class UserRegTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrgMaster om =new OrgMaster();
		String res = null;
		res = om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch is "+res);
		res = om.org_Login("Admin", "admin");
		System.out.println("Login is "+res);
		res = om.org_UserReg("Venkat Tester", "VenkatTestUser", "VenkatTestUser");
		System.out.println("User Registration is "+res);
		res = om.org_Logout();
		System.out.println("Logout is "+res);
		om.org_Close();
		System.out.println("Application is closed successfully");
		
	}

}
