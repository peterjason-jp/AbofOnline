package com.Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class BaseClass {
	
	public static WebDriver driver;
	
	@Parameter
	@BeforeMethod
	public void setup(){
		
		if(GenericClass.getproperties("BROWSERNAME").equalsIgnoreCase("Chrome")){
			
			System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(GenericClass.getproperties("URL"));
			driver.manage().window().maximize();
		
		}
		else if(GenericClass.getproperties("BROWSERNAME").equalsIgnoreCase("firefox")){
			
			System.setProperty("webdriver.gecko.driver", "E:\\Eclipse\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get(GenericClass.getproperties("URL"));
			driver.manage().window().maximize();
			
		}
		
	}
	
	@AfterMethod
	public void teardown(){
		//driver.quit();
	}
	
	
	
	
	

}
