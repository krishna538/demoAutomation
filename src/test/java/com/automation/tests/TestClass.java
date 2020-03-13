package com.automation.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass {
	
	private static WebDriver driver;
	
	@BeforeMethod
	public void lauchBrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}
	
	@Test
	public void test1() {
		driver.navigate().to("https://www.google.com");
		System.out.println("The test1 URL");
	}
	@Test
	public void test2() {
		driver.navigate().to("https://www.google.com");
		System.out.println("The test2 URL");
	}
	@Test
	public void test3() {
		driver.navigate().to("https://www.google.com");
		System.out.println("The test3 URL");
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
