package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		/*
		driver.findElement(By.linkText("Mobiles")).click();
		driver.findElement(By.partialLinkText("Mobi")).click();*/
		
		//Capture Links
		List<WebElement>links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links: "+links.size());
		
		/*for(int i=0;i<=links.size();i++)
		{
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href"));
		}*/
		
		for(WebElement link:links) {
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
		}

	}

}
