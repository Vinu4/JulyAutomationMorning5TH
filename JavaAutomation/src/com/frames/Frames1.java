package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
		Frames();

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
		oBrowser.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		Thread.sleep(4000);
	}catch(Exception e)
		{
		e.printStackTrace();
		}
}
	static void Frames()
	{
		try
		{
			oBrowser.switchTo().frame(0);
			oBrowser.findElement(By.xpath("/html/body/main/ul/li[1]/a")).click();
			Thread.sleep(4000);
			oBrowser.switchTo().defaultContent();
			oBrowser.switchTo().frame("packageFrame");
			oBrowser.findElement(By.xpath("/html/body/main/div/section[1]/ul/li[14]/a/span")).click();
			Thread.sleep(4000);
			oBrowser.switchTo().defaultContent();
			WebElement oEi=oBrowser.findElement(By.name("classFrame"));
			oBrowser.switchTo().frame(oEi);
			String a=oBrowser.findElement(By.xpath("/html/body/main/div[2]/div[1]/ul/li")).getText();
			System.out.println(a);
			
		}catch(Exception e)
		{
		e.printStackTrace();
		}
	}

}
