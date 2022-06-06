package org.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\SIGHTSPECTRUM\\eclipse-workspace\\MavenProject\\src\\test\\resources\\Register.xlsx");
	Workbook w=new XSSFWorkbook();
	Sheet s = w.createSheet("Amazon");
	Row r = s.createRow(3);
	Cell cell = r.createCell(3);
	cell.setCellValue("suguna");
	FileOutputStream fo=new FileOutputStream(f);
	w.write(fo);
	System.out.println("done");
}
}
