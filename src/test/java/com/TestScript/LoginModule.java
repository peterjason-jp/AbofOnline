package com.TestScript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Library.BaseClass;
import com.Library.GenericClass;
import com.PageObjectModel.LoginPage;

public class LoginModule extends BaseClass {
	
	
	@Test(priority=1,enabled=true)
	public void Logintoappli() throws InterruptedException{
		LoginPage login = new LoginPage();
		login.abofSignInButton.click();
		Thread.sleep(4000);
		login.abofAlreadyRegisteredOption.click();
	}
	
	
	
	/*
	@Test
	public void logintoabofapplication() throws InterruptedException{
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Sign In/Register']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Already')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='sign-in-form-emailAddress'])[2]")).sendKeys(GenericClass.getproperties("USERNAME"));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='sign-in-form-password'])[2]")).sendKeys(GenericClass.getproperties("PASSWORD"));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@title='Sign In'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Hi Jason']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]")).click();
		
		
		//driver.quit();
	}*/

}
