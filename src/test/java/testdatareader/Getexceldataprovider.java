package testdatareader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getexceldataprovider {

	@Test
	public void exceltest() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String emaildata=Exceldataprovider.getstringdata("Sheet1",0,0);
		String passworddata=Exceldataprovider.getstringdata("Sheet1",0,1);
	    WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	    WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
	    WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
	    email.sendKeys(emaildata);
	    password.sendKeys(passworddata);
	    login.click();
	}
}