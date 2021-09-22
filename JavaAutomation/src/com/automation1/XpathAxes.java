package com.automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {
public static WebDriver O=null;
	public static void main(String[] args) {
		launch();
		navigate();
		fillSachinSalary();
		activeCheckboxFreedomFigher();
		rahulDravidsecondrecordsalary();
		sachinTendulkarthirdrecordactive();

	}
	static void launch()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\JavaAutomation\\Library\\Drivers\\chromedriver.exe");
			O=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigate()
	{
		try
		{
			O.get("file:///D:/Automation%20Testing%20Notes/Selenium/X%20Path%20Axes/XPathAxes_03_Sept_2021/WebTableHTML.html");
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void fillSachinSalary()
	{
		try
		{
			O.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td[4]/input")).sendKeys("50000");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void activeCheckboxFreedomFigher()
	{
		try
		{
			O.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[2]/input")).click();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void rahulDravidsecondrecordsalary()
	{
		try
		{
			O.findElement(By.xpath("//td[text()='Rahul Dravid']/following::tr[2]/td[6]/input")).sendKeys("20000");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void sachinTendulkarthirdrecordactive()
	{
		try
		{
			O.findElement(By.xpath("//td[text()='Sachin Tendulkar']/preceding::tr[3]/td[1]/input")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
