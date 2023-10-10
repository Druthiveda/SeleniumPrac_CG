package com.ReadData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableToExcel {

	public static void main(String[] args) throws InterruptedException, IOException {

		//System.setProperty("webdriver.chrome.driver",
				//"C:\\Users\\mkatturo\\Desktop\\2022\\My Tutorial\\Automation\\Automation supported Docs\\Drivers\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		String path = ".\\DataExcel\\Data.xlsx";
		XcelUtilities xcelu = new XcelUtilities();
		File path = new File(".\\DataExcel\\Excel2Data.xlsx");

		//xcelu.applogin("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", "Admin", "admin123");

		xcelu.setCellData("Sheet1", 0, 0, "UserName");
		xcelu.setCellData("Sheet1", 0, 1, "UserRole");
		xcelu.setCellData("Sheet1", 0, 2, "EmpName");
		xcelu.setCellData("Sheet1", 0, 3, "Status");

		Thread.sleep(3000);

		// selecting PIM

		driver.findElement(By.xpath("//span[text()='PIM']")).click();

		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(3000);

		WebElement grid = driver.findElement(By.xpath("//div[@class='orangehrm-container']"));
		int rows = grid.findElements(By.xpath("//div[@class='oxd-table-body']//div[@class='oxd-table-card']")).size();

		for (int i = 1; i <= rows; i++) {
			String username = grid
					.findElement(By.xpath(
							"//div[@class='oxd-table-body']//div[@class='oxd-table-card'][" + i + "]//div//div[2]"))
					.getText();
			String userrole = grid
					.findElement(By.xpath(
							"//div[@class='oxd-table-body']//div[@class='oxd-table-card'][" + i + "]//div//div[3]"))
					.getText();
			String empname = grid
					.findElement(By.xpath(
							"//div[@class='oxd-table-body']//div[@class='oxd-table-card'][" + i + "]//div//div[4]"))
					.getText();
			String status = grid
					.findElement(By.xpath(
							"//div[@class='oxd-table-body']//div[@class='oxd-table-card'][" + i + "]//div//div[5]"))
					.getText();

			xcelu.setCellData("Sheet1", i, 0, username);
			xcelu.setCellData("Sheet1", i, 1, userrole);
			xcelu.setCellData("Sheet1", i, 2, empname);
			xcelu.setCellData("Sheet1", i, 3, status);

		}

	}

}
