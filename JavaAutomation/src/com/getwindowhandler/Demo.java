package com.getwindowhandler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
		popupBrowser();


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
	static int popupCount()
	{
		int count=0;
		try
		{
			count=oBrowser.getWindowHandles().size()-1;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return count;
	}
	static void popupBrowser()
	{
		try
		{
			System.out.println("before count"+popupCount());
			oBrowser.findElement(By.linkText("actiTIME Inc.")).click();
			Thread.sleep(4000);
			System.out.println("After count"+popupCount());
			if(popupCount()>0)
			{
				popuphandle();
				
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void popuphandle()
	{
		try
		{
			String parentBrowser=oBrowser.getWindowHandle();
			System.out.println("ParentBrowser"+parentBrowser);
			Object []popup=oBrowser.getWindowHandles().toArray();
			for(int i=1; i<popup.length; i++)
			{
				String childBrowser=popup[i].toString();
				System.out.println(childBrowser);
				oBrowser.switchTo().window(childBrowser);
				oBrowser.findElement(By.xpath("//*[@id=\"HeaderVue\"]/header/div/div/div[2]/div/ul/li[3]/a")).click();
				Thread.sleep(2000);
				
				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
