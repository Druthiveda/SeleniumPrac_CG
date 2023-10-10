package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Installables\\chromedriver_win32_112\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		WebElement chooseFile = driver.findElement(By.id("file-upload"));
		chooseFile.sendKeys(System.getProperty("user.dir")+"C:\\Installables\\Sample.txt.txt");		
		Thread.sleep(3000);
		driver.findElement(By.id("file-submit")).click();
		driver.close();
		

	}

}
