package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseDoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		WebElement dbleclick = driver.findElement(By.xpath("//p[text()='Double-click this paragraph to trigger a function.']"));
		
		Actions act = new Actions(driver);
		act.doubleClick(dbleclick).perform();

	}

}
