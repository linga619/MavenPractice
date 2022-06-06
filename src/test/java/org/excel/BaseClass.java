package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BaseClass {
public static String getExcel(String filename, String sheet,int r,int c) throws IOException {
	File f=new File("C:\\Users\\SIGHTSPECTRUM\\eclipse-workspace\\MavenProject\\src\\test\\resources\\"+filename+".xlsx");
	FileInputStream fi=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fi);
	Sheet s = w.getSheet(sheet);
	Row row = s.getRow(r);
	Cell cell = row.getCell(c);
	int type = cell.getCellType();
	String value;
	if(type==1) {
		 value = cell.getStringCellValue();
	}
	else {
		if(DateUtil.isCellDateFormatted(cell)) {
			Date d = cell.getDateCellValue();
			SimpleDateFormat s1=new SimpleDateFormat("dd-MMM-yyyy");
			 value = s1.format(d);
			
		}
		else {
			double d = cell.getNumericCellValue();
			long l=(long) d;
			 value = String.valueOf(l);
		}
	}
	return value;
	
	
	

}
}
