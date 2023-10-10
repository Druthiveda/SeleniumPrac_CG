package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SizeandLocationOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		//Method1
		System.out.println("Location of(x,y)"+logo.getLocation());
		System.out.println("Location of(x,y)"+logo.getLocation().getX());
		System.out.println("Location of(x,y)"+logo.getLocation().getY());
		
		//Method2
		System.out.println("Location of(x,y)"+logo.getRect().getX());
		System.out.println("Location of(x,y)"+logo.getRect().getY());
		
		//method1
		System.out.println("Size(Width,Height)"+logo.getSize());
		System.out.println("Size(Width)"+logo.getSize().getWidth());
		System.out.println("Size(Height)"+logo.getSize().getHeight());
		
		//method2
		System.out.println("Size(Width)"+logo.getRect().getDimension().getWidth());
		System.out.println("Size(Height)"+logo.getRect().getDimension().getHeight());

	}

}
