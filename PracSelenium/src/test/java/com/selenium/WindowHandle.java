package com.selenium;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows.size());
		
		Iterator<String> it = allwindows.iterator();
		
		String parent = it.next();
		String child= it.next();
		
		driver.switchTo().window(child);
		System.out.println(driver.switchTo().window(child).getTitle());
		driver.quit();
		

	}

}
