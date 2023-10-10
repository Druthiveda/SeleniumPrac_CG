package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//Alert with Ok button
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		System.out.println("Alert with Ok button");
		
		//Alert with Ok and Cancel button
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		System.out.println("Alert with Ok button");
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		System.out.println("Alert with Cancel button");
		Thread.sleep(3000);
		
		//Alert window with input box
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(3000);
		Alert alertwindow = driver.switchTo().alert();
		System.out.println("the message displayed in alert window: "+ alertwindow.getText());
		Thread.sleep(3000);
		alertwindow.sendKeys("hiiiiiiiiiii");
		Thread.sleep(3000);
		alertwindow.accept();

	}

}
