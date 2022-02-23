package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Harish\\Documents\\framework - workspace\\FaceBook\\src\\test\\resources\\Excel\\Sample.xlsx");
		FileInputStream in=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(in);
		Sheet sheet = w.getSheet("Test");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String stringCellValue = cell.getStringCellValue();
//		System.out.println(stringCellValue);
		for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row2 = sheet.getRow(i);
			for (int j = 0; j < row2.getPhysicalNumberOfCells(); j++) {
				Cell cell2 = row2.getCell(j);
				String stringCellValue2 = cell2.getStringCellValue();
				System.out.println(stringCellValue2);
			}
		}
	}

}
