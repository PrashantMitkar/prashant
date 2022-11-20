package selnium_pra;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Windowshandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		String parentwindowAddress=driver.getWindowHandle();
		System.out.println(parentwindowAddress);
		Set<String> allAddress=driver.getWindowHandles();
		System.out.println(allAddress);
		Iterator<String> it=allAddress.iterator();
		while(it.hasNext())
		{
			String childwindowsAddress=it.next();
			if(!parentwindowAddress.equals(childwindowsAddress)) {
				driver.switchTo().window(childwindowsAddress);
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("12334");
			}
		}
		
		
		driver.switchTo().window(parentwindowAddress);
//		driver.quit();
	
	}

}
