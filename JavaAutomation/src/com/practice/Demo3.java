package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
public static WebDriver obj=null;
	public static void main(String[] args) {
		Luanch();
		navigate();
		login();
		creatuser123();
		Logout();
		login1();
		user1inuser2();
		

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
			obj.findElement(By.id("username")).sendKeys("admin");
			obj.findElement(By.name("pwd")).sendKeys("manager");
			obj.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			obj.manage().window().maximize();
			obj
			.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']/div[1]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void Logout()
	{
		try
		{
			obj.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login1()
	{
		try
		{
			obj.findElement(By.id("username")).sendKeys("adminv");
			obj.findElement(By.name("pwd")).sendKeys("Welcome1");
			obj.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(3000);
			popup();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void creatuser123()
	{
		try
		{
			obj.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(4000);
			obj.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
			Thread.sleep(4000);
			obj.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("demo");
			obj.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("user1");
			obj.findElement(By.id("userDataLightBox_emailField")).sendKeys("demo8@gmail.com");
			obj.findElement(By.id("userDataLightBox_usernameField")).sendKeys("adminv");
			obj.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Welcome1");
			obj.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Welcome1");
			obj.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void popup()
	{
		try
		{
			obj.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void user1inuser2()
	{
		try
		{
	       obj.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
	       Thread.sleep(4000);
	       obj.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
	       Thread.sleep(4000);
	       obj.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("demo2");
			obj.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("user2");
			obj.findElement(By.id("userDataLightBox_emailField")).sendKeys("demo89@gmail.com");
			obj.findElement(By.id("userDataLightBox_usernameField")).sendKeys("adminvi");
			obj.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Welcome1");
			obj.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Welcome1");
			obj.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(4000);
	       
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
