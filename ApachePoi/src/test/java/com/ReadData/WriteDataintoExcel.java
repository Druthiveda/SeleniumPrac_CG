package com.ReadData;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WriteDataintoExcel {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		File file = new File(".\\DataExcel\\Excel1Data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sh = wb.createSheet("RecordsData");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");

		WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
		pwd.sendKeys("admin123");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		// selecting PIM
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		List<WebElement> rowcount = driver.findElements(By.xpath("//div[@class='oxd-table-body']/div"));
		System.out.println(rowcount.size());
		for (int i = 1; i <= rowcount.size(); i++) {
			XSSFRow row = sh.createRow(i);
			WebElement record = driver.findElement(By.xpath("//div[@class='oxd-table-body']/div[" + i + "]"));
			System.out.println(record.getText());

		}
		FileOutputStream fos = new FileOutputStream(file);
		wb.write(fos);
		
		
		
		
	}

}
