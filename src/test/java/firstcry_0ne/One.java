package firstcry_0ne;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class One {

	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		// Object WebDriverManager;
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("Opera")) {

			WebDriverManager.operadriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("Edge")) {

			WebDriverManager.edgedriver().setup();
			driver = new ChromeDriver();
			;
		}
		System.out.println("Start");
		driver.get("https://fcjarvis.fcappservices.in/login");
		driver.manage().window().maximize();

		WebElement emailid = driver.findElement(By.xpath("//input[@id='email']"));
		emailid.sendKeys("prashantkumar.mitkar@firstcry.in");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Firstcry@123");
		WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		login.click();
		Thread.sleep(5000);
		WebElement PUSH = driver
				.findElement(By.xpath("/html/body/app-root/app-usersoverview/app-sidenav/div[1]/ul/li[8]/a"));
		PUSH.click();
		// Thread.sleep(5000);
		System.out.println("click on the PUSH template");
		WebElement create = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-circle btn-sm']"));
		create.click();
		System.out.println("click on the create button");
		WebElement Campaign_name = driver
				.findElement(By.xpath("(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[1]"));
		Campaign_name.sendKeys("QA_PUSH_Test");
//            WebElement segment_dropdown1 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//            Select drop = new Select(segment_dropdown1);
//            drop.selectByVisibleText("Aman 3");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='ng-arrow-wrapper'])[1]")).click();
		WebElement CAMPAIGN_TAGS = driver.findElement(By.xpath("(//input[@aria-autocomplete='list'])[1]"));
		Thread.sleep(2000);
		CAMPAIGN_TAGS.sendKeys("qa_test");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		WebElement radio_andriod_only = driver.findElement(By.xpath("(//span[@class='checkmark'])[2]"));
		radio_andriod_only.click();
		Thread.sleep(2000);
		WebElement segement = driver.findElement(By.xpath("(//span[@class='checkmark'])[4]"));
		segement.click();
		System.out.println("done");

		driver.findElement(By.xpath("(//span[@class='ng-arrow-wrapper'])[2]")).click();
		WebElement segment_dropdown = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		segment_dropdown.click();
		segment_dropdown.sendKeys("Prashant");

		robot.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]")).click();
		WebElement one_time = driver.findElement(By.xpath("(//span[@class='checkmark'])[1]"));
		one_time.click();
		WebElement later = driver.findElement(By.xpath("(//span[@class='checkmark'])[3]"));
		later.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-createpush/div[2]/div/div/div[1]/div/div/div[2]/div[3]/div[1]/my-date-picker/div/div[1]/div/button[2]/span"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-createpush/div[2]/div/div/div[1]/div/div/div[2]/div[3]/div[1]/my-date-picker/div/div[2]/table[1]/tr/td[2]/button/span[1]"))
				.click();
		Thread.sleep(2000);
		WebElement hour = driver.findElement(By.xpath("//select[@id='hour']"));
		Select hours=new Select(hour);
		hours.selectByIndex(7);
		WebElement min = driver.findElement(By.xpath("//select[@id='min']"));
		Select mins=new Select(min);
		mins.selectByIndex(6);
		driver.findElement(By.xpath("(//span[@class='checkmark'])[5]")).click();
		driver.findElement(By.xpath("(//span[@class='checkmark'])[7]")).click();
		driver.findElement(By.xpath("(//span[@class='checkmark'])[9]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		//iframe[@id='_tinymce-wj6flwme9de_ifr']
		
		Thread.sleep(5000);
	
		String rm=RandomString.make(27);
		
		String path="C:\\Users\\prash\\eclipse-workspace\\com.CST_one\\Screenshot";
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destn=new File(path+"\\"+rm+".png");
		FileUtils.copyFile(src, destn);		
		
		
		
		
		
	}

	public static void getcapture(WebDriver driver) throws IOException {

	String rm=RandomString.make(2);
		
		String path="C:\\Users\\prash\\eclipse-workspace\\com.CST_one\\Screenshot";
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destn=new File(path+"\\"+rm+".png");
		FileUtils.copyFile(src, destn);	
	}



}
