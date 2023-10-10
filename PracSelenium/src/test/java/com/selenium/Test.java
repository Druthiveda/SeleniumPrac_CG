package com.selenium;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

 

public class Test {

 

    public static void main(String[] args) throws InterruptedException {
    	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space(text()='Login')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper']/a/child::span)[2]")).click();
        Actions action=new Actions(driver);
        Thread.sleep(2000);
        action.moveToElement(driver.findElement(By.xpath("//div[@class='orangehrm-header-container']/button[normalize-space(text()='Add')]")));
        action.build().perform();
        driver.findElement(By.xpath("//div[@class='orangehrm-header-container']/button[normalize-space(text()='Add')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']/div[2]/input[@name='firstName']")).sendKeys("Mahy");
        driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("Yadav");
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("M");
        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("12345");

        driver.findElement(By.xpath("//div[@class='oxd-form-row user-form-header']/div")).click();
        driver.findElement(By.xpath("(//div[@class='oxd-input-group oxd-input-field-bottom-space']/div[2]/input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("mahy@5@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[@class='oxd-input-group oxd-input-field-bottom-space']/div[2]/input[contains(@type,password)])[7]")).sendKeys("Mahy@12345");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='oxd-input-group oxd-input-field-bottom-space']/div[2]/input[contains(@type,password)])[8]")).sendKeys("Mahy@12345");
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();


 

    }

 

}