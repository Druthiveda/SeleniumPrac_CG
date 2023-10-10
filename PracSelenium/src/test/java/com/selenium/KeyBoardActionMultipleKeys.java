package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardActionMultipleKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		WebElement input1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement input2 = driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		input1.sendKeys("welcome to selenium");
		
		Actions act = new Actions(driver);
		//CNTRL A
		act.keyDown(Keys.CONTROL); //keydown is for holding key
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL); // keyup is for release control key
		act.perform();
		
		//Copy cntrl c
		act.keyDown(Keys.CONTROL); //keydown is for holding key
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL); // keyup is for release control key
		act.perform();
		
		//tab - shift to input2 	
		act.sendKeys(Keys.TAB);
		act.perform();
		
		//Copy cntrl c
		act.keyDown(Keys.CONTROL); //keydown is for holding key
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL); // keyup is for release control key
		act.perform();
		
		//compare 
		if(input1.getAttribute("value").equals(input2.getAttribute("value"))) {
			System.out.println("Text copied");
		}
		else {
			System.out.println("Text not copied");
		}
	}

}
