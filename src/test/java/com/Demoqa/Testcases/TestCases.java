package com.Demoqa.Testcases;

import org.testng.annotations.Test;

import com.Demoqa.Pages.AddMobiles;

public class TestCases extends Baseclass {
	
	
	
	@Test
	public void AddingMobiles() throws InterruptedException
	{
		extentmanagerreport.CreateTest("AddingMobiles");
		AddMobiles data=new AddMobiles(driver);
		data.AddMobilestocart("Mobiles","iphone");
	}
	
	
	

}
