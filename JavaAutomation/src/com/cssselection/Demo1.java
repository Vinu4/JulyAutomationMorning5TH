package com.cssselection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
public static WebDriver obj=null;
	public static void main(String[] args) {
		launch();
		navigate();
		login();
		minimize();
		// createuser(); modified

	}
	static void launch()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\JavaAutomation\\Library\\Drivers\\chromedriver.exe");
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
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
	}
	}
		static void login()
		{
			try
			{
				obj.findElement(By.cssSelector("#username")).sendKeys("admin");
				obj.findElement(By.cssSelector("#loginFormContainer > tbody > tr:nth-child(1) > td > table > tbody > tr:nth-child(2) > td > input")).sendKeys("manager");
				obj.findElement(By.cssSelector("#loginButton > div")).click();
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
		}
	
		}
		static void minimize()
		{
			try
			{
				obj.findElement(By.cssSelector("div.gettingStartedShortcutsLabel")).click();
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
		}
}
		static void createuser()
		{
			try
			{
				obj.findElement(By.cssSelector("#topnav > tbody > tr:nth-child(1) > td:nth-child(5) > a")).click();
				Thread.sleep(4000);
				obj.findElement(By.cssSelector("div[class='addUserButton beigeButton useNativeActive']")).click();
				Thread.sleep(4000);
				obj.findElement(By.cssSelector("input#userDataLightBox_firstNameField")).sendKeys("demo");
			}catch(Exception e)
			{
				e.printStackTrace();
		}
}
}
