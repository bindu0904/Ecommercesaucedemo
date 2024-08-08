package com.Demoqa.Testcases;

import org.openqa.selenium.WebDriver;

import com.Demoqa.Objects.Web_Objects;
import com.Demoqa.Objects.web_Objectssaucedemo;

public class Ecommerceloginandlogout {
	
	
	public static void Login(WebDriver driver,String username,String password)
	{
		driver.findElement(Web_Objects.username).sendKeys(username);
		driver.findElement(Web_Objects.Continue).click();
		driver.findElement(Web_Objects.password).sendKeys(password);
		driver.findElement(Web_Objects.signin).click();
		
	}
	
	
	public static void Loginsaucedemo(WebDriver driver,String username,String password)
	{
		driver.findElement(web_Objectssaucedemo.username).sendKeys(username);
		driver.findElement(web_Objectssaucedemo.password).sendKeys(password);
		driver.findElement(web_Objectssaucedemo.Loginbutton).click();
		
	}
	
	public static void Logout(WebDriver driver)
	
	{
	   driver.quit();	
	}

	

}
