package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript(Script, args)
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Drawing border & TakeScreenshot
		/*WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		JavaScriptUtil.drawborder(logo,driver);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\Screenshots\\logo.png");
		FileUtils.copyFile(src,trg);*/
		
		//Getting title of the page
		/*String title = JavaScriptUtil.getTitleByJs(driver);
		System.out.println(title);*/
		
		//Click Action
		/*WebElement click = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		JavaScriptUtil.ClickElementByJs(click, driver);*/
		
		//Generate alert
		//JavaScriptUtil.generateAlert(driver,"This is my alert");
		
		//RefreshPage
		//JavaScriptUtil.RefreshBrowserByJs(driver);
		
		//ScrollDown
		//JavaScriptUtil.ScrollPageDown(driver);
		//Thread.sleep(5000);
		
		//ScrollUp
		//JavaScriptUtil.ScrollPageUp(driver);
		
		//zoomup
		//JavaScriptUtil.zoomPageByJs(driver);
		
		//flash
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		JavaScriptUtil.flash(logo,driver);
		
		
		
		
		
		
		
		

	}

}
