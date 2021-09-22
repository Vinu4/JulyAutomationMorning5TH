package com.automation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
      LaunchBrowser();
       navigate();
	}
	static void LaunchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\JavaAutomation\\Library\\Drivers\\chromedriver.exe");
	        oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	static void navigate()
	
	{
		try
		{
		oBrowser.get("http://localhost:83/login.do");
		Thread.sleep(4000);
	}catch(Exception e)
		{
		e.printStackTrace();
		}
}


}
