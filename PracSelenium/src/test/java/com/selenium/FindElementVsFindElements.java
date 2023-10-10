package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementVsFindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		//FindElement - single webelement
		/*WebElement searchBox=driver.findElement(By.xpath("//input[@class='search-box-text ui-autocomplete-input']"));
		searchBox.sendKeys("Laptops");
		
		//multiple links it will capture 1st one
		WebElement ele = driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println(ele.getText());
		
		// element is not present throw nosuchelement exception
		WebElement txt = driver.findElement(By.id("//input[@id='small-searchter']"));
		System.out.println(txt.getText());*/
		
		//findElemnts- Multiple WebElements
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println(links.size());
		for(WebElement ele:links) {
			System.out.println(ele.getText());			
		}
		System.out.println("--------------");
		
		// single element using findelements
		List<WebElement> logo = driver.findElements(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println(logo.size());
		System.out.println("--------------");
		
		//no element present it returns 0
		List<WebElement> logo1 = driver.findElements(By.xpath("//img[@alt='nopCommerce demo']"));
		System.out.println(logo1.size());
		
	}

}
