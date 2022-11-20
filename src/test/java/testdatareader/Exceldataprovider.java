package testdatareader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldataprovider {

	public static String getstringdata(String SheetName,int Row,int Cell) throws Exception {
		
		String path="C:\\Users\\prash\\eclipse-workspace\\com.CST_one\\TESTDATA\\DATA.xlsx";
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook book=new XSSFWorkbook(file);
		String data=book.getSheet(SheetName).getRow(Row).getCell(Cell).getStringCellValue();
		return data;
	}
}
