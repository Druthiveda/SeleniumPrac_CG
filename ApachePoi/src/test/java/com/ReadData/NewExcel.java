package com.ReadData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\kdruthiv\\Desktop\\AutomationPrac\\Addition.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");
		int rows = sh.getLastRowNum();
		int cols = sh.getRow(1).getLastCellNum();
		System.out.println(rows);
		System.out.println(cols);
		for (int r = 1; r <= rows; r++) {
			XSSFRow row = sh.getRow(r);

			for (int c = 0; c < cols; c++) {
				XSSFCell cell = row.getCell(c);
				System.out.print(cell.getStringCellValue());

				
				System.out.print(" || ");
			}
			System.out.println();

		}
	}

}
