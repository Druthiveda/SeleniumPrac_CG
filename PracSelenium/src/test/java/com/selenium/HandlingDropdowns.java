package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		WebElement drpdwn = driver.findElement(By.id("dropdown"));
		Select ele = new Select(drpdwn);
		//ele.selectByVisibleText("Option 1");
		//ele.selectByValue("2");
		//ele.selectByIndex(1);
		
		//select values without using methods
		
		List<WebElement>alloptions = ele.getOptions();
		
		for(WebElement option:alloptions)
		{
			if(option.getText().equals("Option 2"))
			{
				option.click();
				break;
			}
			
			
		}

	}

}
