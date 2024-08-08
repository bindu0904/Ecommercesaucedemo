package com.Demoqa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.Demoqa.Objects.Web_Objects;
import com.Demoqa.actions.Commands;
import com.testing.extentmanager.ExtentManager;

public class AddMobiles extends Commands{
	
	ExtentManager reportcls;
	
	
	
	public AddMobiles(WebDriver driver) {
		super(driver);
		
		reportcls=new ExtentManager();
		// TODO Auto-generated constructor stub
	}

	public void AddMobilestocart(String product, String mobileproduct) throws InterruptedException
	{
		Type(Web_Objects.searchbox,product);
		reportcls.AddtestCaseSteps("Search for the product:" +product);
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		Click(Web_Objects.searchicon);
		reportcls.AddtestCaseSteps("Clicked on search icon");
		Type(Web_Objects.searchbox,mobileproduct);
		reportcls.AddtestCaseSteps("Search for mobiles product");
		Click(Web_Objects.searchicon);
		reportcls.AddtestCaseSteps("Clicked on search icon in mobiles page");
		Thread.sleep(3000);
		Click(Web_Objects.Addtocart);
		reportcls.AddtestCaseSteps("Clicked on Add to cart");
		Thread.sleep(3000);
		String messageiniphonepage=GetText(Web_Objects.productnameinmobilepage);
		Click(Web_Objects.viewcart);
		reportcls.AddtestCaseSteps("Clicked on view cart");
		Thread.sleep(3000);
		String addtocartmessage=GetText(Web_Objects.productnameinaddtocartpage);
		StringValidation(messageiniphonepage,addtocartmessage);
		reportcls.AddtestCaseSteps("Comparing the product name");
		System.out.println(messageiniphonepage);
		System.out.println(addtocartmessage);
		
		/*Click(Web_Objects.quantitydropdown);
		Thread.sleep(3000);
		Click(Web_Objects.changequantitydropdown);
		//js.executeScript("window.scrollBy(0,600)");*/
		
	}
}
