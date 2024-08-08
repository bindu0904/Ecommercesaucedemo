package com.Demoqa.Objects;

import org.openqa.selenium.By;

public class web_Objectssaucedemo {
	
	
	//------Login page objects----------
	
	public static By username=By.id("user-name");
	public static By password=By.id("password");
	public static By Loginbutton=By.id("login-button");
	
	//------Add to cart-------
	
	public static By Addtocart=By.xpath("(//button[@class='btn_primary btn_inventory'])[1]");
	public static By viewbasket=By.xpath("//div[@id='header_container']//div[@id='shopping_cart_container']//a");
	public static By checkout=By.xpath("//div[@class='cart_footer']//a[@class='btn_action checkout_button']");
	
	//----Entering details in checkout-------
	
	public static By firstname=By.id("first-name");
	public static By lastname=By.id("last-name");
	public static By zipcode=By.id("postal-code");
	public static By continuebutton=By.xpath("//input[@value='CONTINUE']");
	public static By finish=By.xpath("//div[@class='cart_footer']//a[@class='btn_action cart_button']");
    public static By gettextafterfinish=By.xpath("//div[@id='checkout_complete_container']");
    
    //---------Getting the list of products-----
    
    public static By getthelistofproducts=By.xpath("//div[@id='checkout_complete_container']");
    
    
    
	
	

}
