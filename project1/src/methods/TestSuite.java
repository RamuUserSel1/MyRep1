package methods;

public class TestSuite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrgMaster om = new OrgMaster();
		String res=null;
		System.out.println("Application Launch");
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		System.out.println("Application Login");
		res=om.org_Login("Admin", "admin");
		System.out.println("Application Login "+res);
		res =om.org_EmpReg("Lilly", "Tester");
		System.out.println("Employee Registration is "+res);
		res = om.org_UserReg("Lilly Tester", "LillyTestUser", "LillyTestUser");
		System.out.println("User Registration is "+res);
		System.out.println("Application Logout");
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		res = om.org_Login("LillyTestUser", "LillyTestUser");
		System.out.println("User Login is "+res);
		om.org_Close();
		System.out.println("Application is Closed Successfully");

	}

}