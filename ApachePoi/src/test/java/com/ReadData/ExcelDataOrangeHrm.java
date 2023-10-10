package com.ReadData;

import java.io.File;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataOrangeHrm {

	public static void main(String[] args) throws IOException, InterruptedException

	{
		

		File file = new File(".\\DataExcel\\ExcelData.xlsx");

		FileInputStream fileInput = new FileInputStream(file);

		XSSFWorkbook wb = new XSSFWorkbook(fileInput);

		XSSFSheet sh = wb.getSheet("OrangeHRM");

		System.out.println("Last Row " + sh.getLastRowNum());

		System.out.println("First Row " + sh.getFirstRowNum());

		int rowcount = sh.getLastRowNum() - sh.getFirstRowNum();

		System.out.println(rowcount);

		for (int i = 1; i <= rowcount; i++)

		{

			Row row = sh.getRow(i);

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();			
			Thread.sleep(3000);
			
            
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(row.getCell(0).getStringCellValue());
			
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(row.getCell(1).getStringCellValue());

			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			// Employee Registration
			Thread.sleep(3000);
			//selecting PIM
			driver.findElement(By.xpath("//span[text()='PIM']")).click();
	        //Add button
			Actions action = new Actions(driver);
			Thread.sleep(3000);
			action.moveToElement(driver.findElement(By.xpath("//div[@class='orangehrm-header-container']/button[normalize-space(text()='Add')]"))).click();
			action.build().perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(row.getCell(2).getStringCellValue());
			
			driver.findElement(By.xpath("//input[@placeholder='Middle Name']")).sendKeys(row.getCell(3).getStringCellValue());
			
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(row.getCell(4).getStringCellValue());
			
			Thread.sleep(3000);
			
			//toggle button
			driver.findElement(By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")).click();
			//Username
			driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]")).sendKeys(row.getCell(5).getStringCellValue());
			
			//password
			driver.findElement(By.xpath("(//div[@class='oxd-input-group oxd-input-field-bottom-space']/div[2]/input[contains(@type,password)])[7]")).sendKeys(row.getCell(6).getStringCellValue());		
	        Thread.sleep(2000);
	        //confirm password
	        driver.findElement(By.xpath("(//div[@class='oxd-input-group oxd-input-field-bottom-space']/div[2]/input[contains(@type,password)])[8]")).sendKeys(row.getCell(7).getStringCellValue());
	        //save
	        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	        Thread.sleep(2000);
	        //Admin tab
	        driver.findElement(By.xpath("//span[text()='Admin']")).click();
	        //Add
	        Thread.sleep(3000);
	        action.moveToElement(driver.findElement(By.xpath("//div[@class='orangehrm-header-container']/button[normalize-space()='Add']"))).click();
	        action.build().perform();
	        //User role
	        Thread.sleep(3000);
	        WebElement usr_rle = driver.findElement(By.xpath("(//div[@class='oxd-select-wrapper'])[1]/div/div[text()='-- Select --']"));
	        usr_rle.click();
	        usr_rle.sendKeys(Keys.DOWN);
	        usr_rle.sendKeys(Keys.ENTER);
	        
	        //EmpName
	        Thread.sleep(3000);
	        WebElement empnme = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
	        empnme.sendKeys(row.getCell(8).getStringCellValue());
	        Thread.sleep(3000);
	        empnme.sendKeys(Keys.DOWN);
	        empnme.sendKeys(Keys.ENTER);
	        //Status
	        Thread.sleep(3000);
	        WebElement status = driver.findElement(By.xpath("(//div[@class='oxd-select-wrapper'])[2]/div/div[text()='-- Select --']"));
	        status.click();
	        status.sendKeys(Keys.DOWN);
	        status.sendKeys(Keys.ENTER);
	        //Username
	        driver.findElement(By.xpath("(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[4]/div[2]/input[@class='oxd-input oxd-input--active']")).sendKeys(row.getCell(9).getStringCellValue());
	        //Password
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[5]/div[2]/input[@type='password']")).sendKeys(row.getCell(10).getStringCellValue());
	        //confirm Password
	        driver.findElement(By.xpath("(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[6]/div[2]/input[@type='password']")).sendKeys(row.getCell(11).getStringCellValue());
	        //Save
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("(//button[normalize-space(text()='Save')])[4]")).click();
		}

		fileInput.close();

	}

}
