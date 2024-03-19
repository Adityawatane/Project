package base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ReadData;


public class TestBase {

	public static WebDriver driver;
	public void initialization() throws InterruptedException, IOException 
	{
		String browser=ReadData.readPropertiesFile("Browser");
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().clearDriverCache().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}
		else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(ReadData.readPropertiesFile("Url"));
		
		
	}
}
