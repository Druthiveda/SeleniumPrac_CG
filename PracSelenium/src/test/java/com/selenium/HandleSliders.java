package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleSliders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		//MiniSlider
		WebElement mini_slider = driver.findElement(By.xpath("//span[1]"));
		System.out.println("Length of the slider: "+mini_slider.getLocation());
		System.out.println("Height and width of the slider:"+ mini_slider.getSize());
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(mini_slider, 100, 0).perform();
		System.out.println("Length of the slider: "+mini_slider.getLocation());
		System.out.println("Height and width of the slider:"+ mini_slider.getSize());
		
		//MaxSlider
		WebElement max_slider = driver.findElement(By.xpath("//span[2]"));
		System.out.println("Length of the slider: "+max_slider.getLocation());
		System.out.println("Height and width of the slider:"+ max_slider.getSize());
		
		Actions act1 = new Actions(driver);
		act1.dragAndDropBy(max_slider, -100, 0).perform();
		System.out.println("Length of the slider: "+max_slider.getLocation());
		System.out.println("Height and width of the slider:"+ max_slider.getSize());
		
		
		

	}

}
