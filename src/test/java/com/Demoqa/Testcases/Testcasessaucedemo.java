package com.Demoqa.Testcases;

import org.testng.annotations.Test;

import com.Demoqa.Pages.AddMobiles;
import com.Demoqa.Pages.Addproductsaucedemo;

public class Testcasessaucedemo extends Base1class {
	
	@Test
	public void Addproductssaucedemo() throws InterruptedException
	{
		extentmanagerreport.CreateTest("Productsadditiontosaucedemo");
		Addproductsaucedemo productdata=new Addproductsaucedemo(driver);
		productdata.Addproductsauce("Shanvi","bindu","56000");
	}
	

}
