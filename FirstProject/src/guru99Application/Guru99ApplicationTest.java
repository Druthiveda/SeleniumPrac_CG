package guru99Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Guru99ApplicationTest {
	ChromeDriver driver;
	
	String url = "https://demo.guru99.com/v4/";
	
	@Test(priority=-1)
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Installables\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(url);
	}
	@Test(priority=0)
	public void verifyTitleOfThePage() {
		
		String expectedTitle = "Guru99 Bank Home Page";
		
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	@Test(priority=1)
	public void verifyLoginToGuru99Application() {
		WebElement userid = driver.findElement(By.name("uid"));
		userid.sendKeys("mngr472265");
		WebElement pswd = driver.findElement(By.name("password"));
		pswd.sendKeys("Ubygegu");
		WebElement lgnbutn = driver.findElement(By.name("btnLogin"));
		lgnbutn.click();
	}
	@Test(priority=2)
	public void NewCustomer() {
		WebElement newCustomerLink = driver.findElement(By.linkText("New Customer"));
		newCustomerLink.click();
		driver.findElement(By.name("name")).sendKeys("Druthiveda");
		driver.findElement(By.xpath("//input[@value='f']")).click();
		driver.findElement(By.name("dob")).sendKeys("20-06-1999");
		driver.findElement(By.name("addr")).sendKeys("HYD");
		driver.findElement(By.name("city")).sendKeys("SDPT");
		driver.findElement(By.name("state")).sendKeys("Telangana");
		driver.findElement(By.name("pinno")).sendKeys("502103");
		driver.findElement(By.name("telephoneno")).sendKeys("9876543210");
		driver.findElement(By.name("emailid")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("password")).sendKeys("bsjk");
		driver.findElement(By.name("sub")).click();
	}
	
	
	

}
