package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\SIGHTSPECTRUM\\eclipse-workspace\\MavenProject\\src\\test\\resources\\Maven Data.xlsx");
	FileInputStream fi=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fi);
	Sheet s=w.getSheet("sheet1");
	Row row = s.getRow(1);
	Cell cell = row.getCell(0);
	int pr = s.getPhysicalNumberOfRows();
	System.out.println(pr);
	int pc = row.getPhysicalNumberOfCells();
	System.out.println(pc);
	//get cell values
	for(int i=0; i<row.getPhysicalNumberOfCells(); i++) {
		Cell cell2 = row.getCell(i);
		System.out.println(cell2);
	}
	//get all cell values
	for(int i=0; i<s.getPhysicalNumberOfRows(); i++) {
		Row row2 = s.getRow(i);
		for(int j=0; j<row.getPhysicalNumberOfCells(); j++) {
			Cell cell2 = row.getCell(j);
			System.out.println(cell2);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
