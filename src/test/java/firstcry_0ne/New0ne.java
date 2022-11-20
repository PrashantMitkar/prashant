package firstcry_0ne;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class New0ne extends One {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='/deals?ref_=nav_cs_gb']")).click();
		One o=new One();
		o.getcapture(driver);
		
	}

	
}
