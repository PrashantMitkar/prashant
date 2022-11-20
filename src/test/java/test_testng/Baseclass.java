package test_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	WebDriver driver;
	@Parameters({"BroweserName"})
	@BeforeMethod
	public void BM(String BroweserName) {
		if(BroweserName.equalsIgnoreCase("Chrome")) {
			System.out.println("BeforeMethod");
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();	
		}else if(BroweserName.equalsIgnoreCase("edge")){
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}else if(BroweserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else if(BroweserName.equalsIgnoreCase("opera")){
			WebDriverManager.operadriver().setup();
			driver=new OperaDriver();
		}else if(BroweserName.equalsIgnoreCase("Safari")){
			WebDriverManager.safaridriver().setup();
			driver=new SafariDriver();
		}
	
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	@AfterMethod
	public void AM() {
		System.out.println("AfterMethod");
		driver.quit();
	}

}
