package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleProj {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement searchElement = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		//isDisplayed
		System.out.println("Display status:"+searchElement.isDisplayed());
		//isEnabled
		System.out.println("Enable status:"+searchElement.isEnabled());
		Thread.sleep(3000);
		driver.close();*/
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement searchText1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
		System.out.println("selected value1: "+searchText1.isSelected());
		WebElement searchText2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
		System.out.println("selected value2: "+searchText2.isSelected());
		Thread.sleep(3000);
		searchText2.click();
		Thread.sleep(3000);
		System.out.println("selected value3: "+searchText2.isSelected());
		Thread.sleep(3000);
		driver.close();
	}
}
