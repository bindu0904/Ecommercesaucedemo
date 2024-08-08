package com.Demoqa.Objects;

import org.openqa.selenium.By;

public class Web_Objects {
	
	
	//----------Login page objects-------------
	
	public static By username=By.name("email");
	public static By Continue =By.xpath("//input[@type='submit']");
	public static By password=By.id("ap_password");
	public static By signin = By.id("signInSubmit");
	
	//---------Search product-----------
	
	public static By searchbox=By.name("field-keywords");
	public static By searchicon=By.id("nav-search-submit-button");
	public static By Addtocart=By.xpath("//span[@class='a-button-inner']//button[@id='a-autoid-1-announce']");
	//public static By quantity=By.xpath("//span[@class='a-button a-button-dropdown a-button-small quantity']");
	//public static By updatequantity=By.xpath("((//input[@data-action='update-quantity'])[4]");
	
	public static By viewcart=By.xpath("//span[@class='nav-cart-icon nav-sprite']");
	public static By quantitydropdown=By.xpath("//span[@id='a-autoid-0-announce']");
	public static By changequantitydropdown=By.xpath("//div[@class='a-popover-wrapper']//ul//li[5]");
	
	//------------Validating text---------
	
	public static By productnameinmobilepage=By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']//a//span[@class='a-size-medium a-color-base a-text-normal'])[1]");
	public static By productnameinaddtocartpage=By.xpath("//span[@class='a-truncate-cut']");
	

}
