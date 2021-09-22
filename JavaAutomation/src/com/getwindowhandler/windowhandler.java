package com.getwindowhandler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandler {

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
	static void popupBrowser()
	{
		try
		{
			System.out.println("Before click on popup"+getpopupcount());
			oBrowser.findElement(By.linkText("actiTIME Inc.")).click();
			System.out.println("after click on popup"+getpopupcount());
			if(getpopupcount()>0)
			{
				popuphandler();
			}
			
			
		}catch(Exception e)
		{
		e.printStackTrace();
		}
		
	}
	static int getpopupcount()
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
	static void popuphandler()
	{
		try
		{
			String parentBrowser=oBrowser.getWindowHandle();
			System.out.println("Parent Browser"+ parentBrowser);
			Object []popup=oBrowser.getWindowHandles().toArray();
			for(int i=1; i<popup.length; i++)
			{
				String childbrowser=popup[i].toString();
				System.out.println("childbrowser"+childbrowser);
				Thread.sleep(4000);
				oBrowser.switchTo().window(childbrowser);
				String title=oBrowser.getTitle();
				System.out.println("childBrowser title"+ title);
				oBrowser.findElement(By.xpath("//*[@id=\"HeaderVue\"]/header/div/div/div[2]/div/ul/li[3]/a")).click();
				Thread.sleep(2000);
				
				
			}
					
		}catch(Exception e)
		{
			e.printStackTrace();
			}
	}

}
