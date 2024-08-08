package com.Demoqa.actions;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class Commands {

	public WebDriver driver;
	
	public final static Logger logger=LogManager.getLogger("rootLogger");
	
	public Commands(WebDriver driver)
	
	{
		this.driver=driver;
		
	}
	
	public void Click(By locator)
	
	{
		try{
		ExplicitWait(locator);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(400,0)");
		js.executeScript("arguments[0].click()", driver.findElement(locator));	
		logger.info("Click is passed on:" + " " +locator);
		} catch (Exception e) {

          logger.error("Click is failed on : " + " " +locator);
		}
		
		
	}
	
	
	public void Type(By locator,String text)
	
	{
		try {
			ExplicitWait(locator);
			driver.findElement(locator).clear();
		    driver.findElement(locator).sendKeys(text);
		    logger.info("Entered the value "  +text+ " " + "in " +locator);
		}catch (Exception e) {
			logger.error("Failed at entering text " +text+ " " + "in" +locator);
			// TODO: handle exception
		}
	}
	

	public void ExplicitWait(By locator)
	
	{
		try {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		    wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator)));
		}catch(Exception e)  {
			
		}
				
	}
	
	public String GetText(By locator)
	
	{
		ExplicitWait(locator);
		String name="";
		try {
			name = driver.findElement(locator).getText();
			logger.info("Get the text message from the application UI.The value is:" +name);
		}catch (Exception e) {
			logger.error("Get text command is failed");
			Assert.fail();
			// TODO: handle exception
		}
		return name;
	}
	public void StringValidation(String expected,String actual)
	{
		
		try{
			Assert.assertEquals(expected, actual);
			logger.info("Validation is successfull between : "+expected +"and" +actual);
		}catch (Exception e) {
			logger.error("Validation is failed between :"+expected +"and" +actual);
		}
	}
}
