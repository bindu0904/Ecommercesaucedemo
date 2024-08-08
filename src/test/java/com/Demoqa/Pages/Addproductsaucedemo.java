package com.Demoqa.Pages;

import org.openqa.selenium.WebDriver;

import com.Demoqa.Objects.Web_Objects;
import com.Demoqa.Objects.web_Objectssaucedemo;
import com.Demoqa.actions.Commands;
import com.testing.extentmanager.ExtentManager;

public class Addproductsaucedemo extends Commands {
	
	ExtentManager reportcls;
	
	public Addproductsaucedemo(WebDriver driver) {
		super(driver);
		reportcls=new ExtentManager();
		// TODO Auto-generated constructor stub
	}

	public void Addproductsauce(String firstname,String lastname,String zipcode) throws InterruptedException
	{
		Click(web_Objectssaucedemo.Addtocart);
		reportcls.AddtestCaseSteps("Clicked on Addtocart button");
		Click(web_Objectssaucedemo.viewbasket);
		reportcls.AddtestCaseSteps("Clicked on viewbasket");
		Click(web_Objectssaucedemo.checkout);
		reportcls.AddtestCaseSteps("Clickedon checkout");
		Type(web_Objectssaucedemo.firstname,firstname);
		reportcls.AddtestCaseSteps("Entered firstname");
		Type(web_Objectssaucedemo.lastname,lastname);
		reportcls.AddtestCaseSteps("Entered lastname");
		Type(web_Objectssaucedemo.zipcode,zipcode);
		reportcls.AddtestCaseSteps("Entered zipcode");
		Click(web_Objectssaucedemo.continuebutton);
		reportcls.AddtestCaseSteps("Clicked on continue button");
		Click(web_Objectssaucedemo.finish);
		reportcls.AddtestCaseSteps("Clicked on finish button");
		String messageafterfinish=GetText(web_Objectssaucedemo.gettextafterfinish);
		//System.out.println(messageafterfinish);
		
		
		
	}
	
	
	
	
	

}
