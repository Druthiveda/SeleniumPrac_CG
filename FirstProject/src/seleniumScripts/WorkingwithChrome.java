package seleniumScripts;

import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WorkingwithChrome {
	
	ChromeDriver driver;
	
	public void invokeBrowser() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Installables\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.guru99.com/v4/");
		
	}
	public void getTitle() {
		System.out.println(driver.getTitle());
	}
	
	public void closeBrowser() {
		driver.close();
	}
	public static void main(String[] args) {
		WorkingwithChrome wc = new WorkingwithChrome();
		wc.invokeBrowser();
		wc.getTitle();
		wc.closeBrowser();
	}
	

}

