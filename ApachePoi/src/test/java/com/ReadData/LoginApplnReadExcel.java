package com.ReadData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table.Cell;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginApplnReadExcel {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\kdruthiv\\Desktop\\AutomationPrac\\Addition.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");
		int rows = sh.getLastRowNum();
		int cols = sh.getRow(1).getLastCellNum();
		System.out.println(rows);
		System.out.println(cols);
		for (int r = 1; r <= rows; r++) 
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
			String usname = sh.getRow(r).getCell(0).getStringCellValue();
			String passwrd = sh.getRow(r).getCell(1).getStringCellValue();
			
			System.out.println(usname +"  "+ passwrd);
			
			driver.findElement(By.id("email")).sendKeys(usname);
			
			driver.findElement(By.id("pass")).sendKeys(passwrd);
//			XSSFRow row = sh.createRow(r);
//			row.createCell(2).setCellValue("Fail");
			
			Thread.sleep(3000);
			driver.close();
			
			
		}
//		FileOutputStream fos = new FileOutputStream("C:\\Users\\kdruthiv\\Desktop\\AutomationPrac\\Addition.xlsx");
//		wb.write(fos);
//		fos.close();
		
		
	}

}
