package testdatareader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDataReader {
	
	@Test
	public void test_read() throws Exception {
		String path="C:\\Users\\prash\\eclipse-workspace\\com.CST_one\\TESTDATA\\DATA.xlsx";
		FileInputStream File=new FileInputStream(path);
		XSSFWorkbook xssf=new XSSFWorkbook(File);
		String text1=xssf.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(text1);
		String text2=xssf.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(text2);
	}

}
