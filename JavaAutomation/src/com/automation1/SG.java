package com.automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SG {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launch();
		navigate();
		login();
		Login1();
		logout();
		close();


	}
	static void launch()
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
			oBrowser.get("http://sgtestinginstitute.com/");
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
			oBrowser.findElement(By.xpath("/html/body/header/div/div[2]/ul/li[7]/a")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void Login1()
	{
		try
		{
			oBrowser.findElement(By.id("email")).sendKeys("vinayaknaik51@gmail.com");
			oBrowser.findElement(By.id("password")).sendKeys("tvswego@0774");
			oBrowser.findElement(By.name("btn-login")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			oBrowser.findElement(By.xpath("/html/body/header/div/div[2]/ul/li[9]/a/span")).click();
			oBrowser.findElement(By.xpath("/html/body/header/div/div[2]/ul/li[9]/ul/li[4]/a")).click();
			Thread.sleep(4000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void close()
	{
		try
		{


			oBrowser.close();

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}}

