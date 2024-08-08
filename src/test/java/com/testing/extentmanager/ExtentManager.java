package com.testing.extentmanager;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	
	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;
	
	public void StartReport() {
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("YYYY-MM-dd-HH-mm-ss");
		LocalDateTime now=LocalDateTime.now();
		String time=dtf.format(now);
		
		
		
		extent=new ExtentReports();
		
		spark=new ExtentSparkReporter("./Reports/UserdetailsReport_"+time+".html");
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Final Test report");
		
		extent.attachReporter(spark);
		
	}
	
	 
	 public void CreateTest(String testcasename)
	 {
		 
		
		test =extent.createTest(testcasename );
		
	 }
	 
		
	 public void EndExtentReport()
	 {
			extent.flush();
	 }
	 
	 public void AddtestCaseSteps(String step) 
	 {
		 test.info(step);
	 }

}
