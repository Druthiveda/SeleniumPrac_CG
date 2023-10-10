package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getTextVsgetAttribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		WebElement emailtxt = driver.findElement(By.id("Email"));
		emailtxt.clear();
		emailtxt.sendKeys("*****abc@gmail.com");
		Thread.sleep(3000);
		//emailtxt.clear();
		
		System.out.println("getAttributeValue: "+emailtxt.getAttribute("value"));
		System.out.println("getTextValue: "+emailtxt.getText());
		
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println(button.getAttribute("type"));
		System.out.println(button.getAttribute("classs"));
		
		System.out.println(button.getText());
		
		String txt = driver.findElement(By.xpath("//h1[normalize-space()='Admin area demo']")).getText();
		System.out.println(txt);

	}

}
