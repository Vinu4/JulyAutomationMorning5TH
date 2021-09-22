package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
public static WebDriver obj=null;
	public static void main(String[] args) {
		Luanch();
		navigate();
		login();
		// to perform more than one action on any one gui element. we have to prefer WebElement;
	}
	static void Luanch()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\JavaAutomation\\Library\\Drivers\\chromedriver.exe" );
			obj=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigate()
	{
		try
		{
			obj.get("http://localhost:83/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
			WebElement oEI=null;
			oEI=obj.findElement(By.id("username"));
			oEI.sendKeys("demouser1");
			Thread.sleep(4000);
			oEI.clear();
			oEI.sendKeys("demouser2");
			Thread.sleep(4000);
			oEI.clear();
			oEI.sendKeys("demouser3");
			Thread.sleep(4000);
			oEI.clear();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
