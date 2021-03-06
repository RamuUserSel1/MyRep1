package driverScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import methods.OrgMaster;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Hybrid {
	
	
		public static void main(String args[]) throws FileNotFoundException,IOException
		{
			String xlpath = "D:\\Selenium\\Hybrid1.xlsx";
			String xlout = "D:\\seliniumlab\\Hybridres1.xlsx";
			FileInputStream fi=new FileInputStream(xlpath);
			XSSFWorkbook wb = new XSSFWorkbook(fi);
			XSSFSheet ws = wb.getSheet("TestCase");
			XSSFSheet ws1 = wb.getSheet("TestSteps");
			XSSFSheet ws2 = wb.getSheet("TestData");
			XSSFSheet ws3 = wb.getSheet("EmpReg");
			OrgMaster om =new OrgMaster();
			String res= null;
			String res1=null;
			int rcTC = ws.getLastRowNum();
			int rcTS = ws1.getLastRowNum();
			int rcTD = ws3.getLastRowNum();
			for(int i=1;i<=rcTC;i++)
			{
				String flagvalue = ws.getRow(i).getCell(2).getStringCellValue();
				if(flagvalue.equalsIgnoreCase("Y"))
				{	
					res1="PASS";
					String tcId = ws.getRow(i).getCell(0).getStringCellValue();
					for(int j=1;j<=rcTS;j++)
					{
						String tstcid = ws1.getRow(j).getCell(0).getStringCellValue();
						if(tcId.equalsIgnoreCase(tstcid))
						{
							String keyword = ws1.getRow(j).getCell(3).getStringCellValue();
							switch(keyword)
							{
								case "Launch":
									res = om.org_Launch(ws2.getRow(1).getCell(0).getStringCellValue());
									break;
								case "Login":
									res = om.org_Login(ws2.getRow(1).getCell(1).getStringCellValue(),ws2.getRow(1).getCell(2).getStringCellValue());
									break;
								case "EmpReg":
									for(int k=1;k<=rcTD;k++)
									{
										res = om.org_EmpReg(ws3.getRow(k).getCell(0).getStringCellValue(), ws3.getRow(k).getCell(1).getStringCellValue());
										ws3.getRow(k).createCell(2).setCellValue(res);
									}
									
									break;
								case "UserReg":
									res = om.org_UserReg(ws2.getRow(1).getCell(5).getStringCellValue(), ws2.getRow(1).getCell(6).getStringCellValue(), ws2.getRow(1).getCell(7).getStringCellValue());
									break;
								case "Logout":
									res = om.org_Logout();
									break;
								case "Close":
									om.org_Close();
									break;
								default:
									System.out.println("Select the proper Keyword");
									
							}
							
							ws1.getRow(j).createCell(4).setCellValue(res);
							if(res.equalsIgnoreCase("FAIL"))
								res1="FAIL";
							
							
						}
					}
					ws.getRow(i).createCell(3).setCellValue(res1);
				}
				else
				{
					ws.getRow(i).createCell(3).setCellValue("BLOCKED");
					
				}
				
				 		
			}
			FileOutputStream fo = new FileOutputStream(xlout);
			wb.write(fo);
			wb.close();
			

	}

}
