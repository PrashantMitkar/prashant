package demo_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.LoginPom;

public class Test_login {

@Test
public void test1() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	LoginPom login=PageFactory.initElements(driver,LoginPom.class);
	login.getTxt_email().sendKeys("Prashant@gmail.com");
	login.getTxt_password().sendKeys("223233445");
	login.getBtn_login().click();
}
}
