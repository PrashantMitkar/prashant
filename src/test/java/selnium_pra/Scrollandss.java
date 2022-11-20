package selnium_pra;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Scrollandss {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("Mobile");
		WebElement search_button = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		search_button.click();
		driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[2]")).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(3000);
//		js.executeScript("argument[0].scrollIntoView()",add_to_cart3);
		js.executeScript("window.scrollBy(0,500)", "");
		WebElement add_to_cart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		add_to_cart.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(5000);
		WebElement cart = driver.findElement(By.xpath("//span[@id='nav-cart-count']"));

		Thread.sleep(3000);
		cart.click();
		String rm = RandomString.make(2);

		String path = "C:\\Users\\prash\\eclipse-workspace\\com.CST_one\\Screenshot";

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File destn = new File(path + "\\" + rm + ".png");
		FileUtils.copyFile(src, destn);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		Thread.sleep(3000);
		String rm2 = RandomString.make(2);

		String path2 = "C:\\Users\\prash\\eclipse-workspace\\com.CST_one\\Screenshot";

		TakesScreenshot ts2 = (TakesScreenshot) driver;
		File src2 = ts2.getScreenshotAs(OutputType.FILE);
		File destn2 = new File(path2 + "\\" + rm2 + ".png");
		FileUtils.copyFile(src2, destn2);
	}

}
