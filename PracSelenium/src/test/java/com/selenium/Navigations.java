package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://snapdeal.com/");
		//driver.navigate().to("https://snapdeal.com/");
		driver.manage().window().maximize();
		System.out.println("snapdeal title: "+driver.getTitle());
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		System.out.println("amazontitle: "+driver.getTitle());
		driver.navigate().back();
		System.out.println("snapdeal title: "+driver.getTitle());
		driver.navigate().forward();
		System.out.println("amazontitle: "+driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
		

	}

}
