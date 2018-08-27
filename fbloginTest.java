package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.page.fblogin;

public class fbloginTest
{
	
	public WebDriver driver;
	@BeforeMethod
	public void start()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\MyFrameworks\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	
	@Test(priority=1)
	public void validatelogin()
	{
		fblogin fbb=new fblogin(driver);
		fbb.log();
	}
	
	@Test(priority=2)
	public void validatelogo()
	{
		fblogin fbb=new fblogin(driver);
		boolean flag=fbb.logo();
		System.out.println(flag);
	}
	
	
	@AfterMethod
	public void end()
	{
		driver.close();
		
	}
	
}
