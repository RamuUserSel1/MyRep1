package ExcelOps;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Xlops {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fi = new FileInputStream("C:\\Users\\lenovo\\Desktop\\EmpRegData.xlsx");
		String xlout ="D:\\seliniumlab\\project1\\src\\result\\EmpRegData.xlsx";
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Emps");
		int lrow = ws.getLastRowNum();
		for (int i=0;i<=lrow;i++)
		{
			XSSFRow r = ws.getRow(i);
			XSSFCell c = r.createCell(2);
			c.setCellValue("Pass");
		}
		
		FileOutputStream fo = new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
		
		

	}

}
