package methods;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;

public class EmpRegDataDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		OrgMaster om = new OrgMaster();
		String res = null;
		res = om.org_Launch("http://opensource.demo.orangehrmlive.com/");
		System.out.println("Application Launch is "+res);
		res = om.org_Login("Admin", "admin");
		System.out.println("Login is "+res);
		FileInputStream fi = new FileInputStream("D:\\seliniumlab\\project1\\src\\result\\EmpRegData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws =wb.getSheet("Emps");
		for(int i=1;i<=5;i++)
		{
			XSSFRow r = ws.getRow(i);
			XSSFCell c = r.getCell(0);
			XSSFCell c1 = r.getCell(1);
			res =om.org_EmpReg(c.getStringCellValue(), c1.getStringCellValue());
			System.out.println("Employee Registration is "+res);
			

	     }
		res = om.org_Logout();
		System.out.println("Logout is "+res);
		om.org_Close();
		System.out.println("Application is closed successfully");
		wb.close();
		
	}

}
