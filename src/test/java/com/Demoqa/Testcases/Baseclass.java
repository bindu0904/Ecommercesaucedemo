package com.Demoqa.Testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Demoqa.utilities.ReadConfig;
import com.testing.extentmanager.ExtentManager;

public class Baseclass{
	
	public WebDriver driver;
	public String url;
	public String username;
	public String password;
	public ExtentManager extentmanagerreport;
	
	@BeforeSuite(alwaysRun = true)
	public void StartExtent()
	{
		extentmanagerreport=new ExtentManager();
		extentmanagerreport.StartReport();
		
	}
	
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		ReadConfig data=new ReadConfig();
		url=data.geturl();
		username=data.getusername();
		password=data.getpassword();
		
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Ecommerceloginandlogout.Login(driver, username, password);
	}
	 
	
	@AfterMethod
	public void tearDown()
	{
		Ecommerceloginandlogout.Logout(driver);
	}
	
	@AfterSuite(alwaysRun = true)
	public void EndExtent()
	{
		extentmanagerreport.EndExtentReport();
	}

}
