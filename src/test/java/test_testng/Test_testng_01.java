package test_testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_testng_01 extends Baseclass {


@Test(groups="Sanity")
public void test_01() {
	
	System.out.println("Sanity1");
}

@Test(groups="Regression")
public void test_02() {
	System.out.println("Regression");
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("12345");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("112233");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
}

@Test(groups="Sanity,Regression")
public void test_03() {
	System.out.println("Sanity,Regression");
}
@Test(groups="Sanity")
public void test_04() {
	System.out.println("Sanity2");
	
}
}
