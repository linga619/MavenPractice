package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelNewcell {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\SIGHTSPECTRUM\\eclipse-workspace\\MavenProject\\src\\test\\resources\\Register.xlsx");
	FileInputStream fi=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fi);
	Sheet s = w.getSheet("Amazon");
	Row r = s.getRow(3);
	Cell cell = r.createCell(4);
	cell.setCellValue("linga");
	FileOutputStream fo=new FileOutputStream(f);
	w.write(fo);
	System.out.println("done");
	
}
}
