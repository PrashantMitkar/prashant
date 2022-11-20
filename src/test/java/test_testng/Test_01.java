package test_testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_01 {
	
	@BeforeSuite
	public void BS() {
		System.out.println("Beforesuite");
	}
	
	@BeforeClass
	public void BC() {
		System.out.println("BeforeClass");
	}
	@BeforeTest
	public void BT(){
		System.out.println("Beforetest");
	}

	@Test
	public void Test_01() {
		System.out.println("Test_01	");
		
	}

	
    @AfterTest
    public void AT() {
    	System.out.println("AfterTest");
    }
    @AfterClass
    public void Ac() {
    	System.out.println("AfterClass");
    }
    @AfterSuite
    public void AS() {
    	System.out.println("AfterSuite");
    }
}
