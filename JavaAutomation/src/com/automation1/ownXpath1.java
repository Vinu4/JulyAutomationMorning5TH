package com.automation1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ownXpath1 {
	public static WebDriver O=null;
	public static void main(String[] args) {
		launch();
		navigate();
		login();
		creatuser();
		deletuser();
		Logout();
		close();


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
			O.get("http://localhost:83/login.do");
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
			O.findElement(By.xpath("//*[@*='username']")).sendKeys("admin");
			O.findElement(By.xpath("//*[@*='pwd']")).sendKeys("manager");
			O.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(4000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}


	}
	static void creatuser()
	{
		try
		{
			//minimize
			O.findElement(By.xpath("//div[@id='gettingStartedShortcutsMenuCloseId']")).click();
			Thread.sleep(4000);

			//createuser1
			O.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(4000);
			O.findElement(By.xpath("//*[@*='buttonText']")).click();
			Thread.sleep(4000);
			O.findElement(By.xpath("//*[@*='userDataLightBox_firstNameField']")).sendKeys("Vinu");
			O.findElement(By.xpath("//*[@*='lastName']")).sendKeys("Naik");
			O.findElement(By.xpath("//*[@*='email']")).sendKeys("vinayaknaik51@gmail.com");
			O.findElement(By.xpath("//*[@*='username']")).sendKeys("Vinu1");
			O.findElement(By.xpath("//*[@*='userDataLightBox_passwordField']")).sendKeys("12345");
			O.findElement(By.xpath("//*[@*='passwordCopy']")).sendKeys("12345");
			O.findElement(By.xpath("//*[@*='buttonTitle']")).click();
			Thread.sleep(4000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deletuser()
	{
		try
		{
			O.findElement(By.xpath("//*[@*='name']")).click();
			Thread.sleep(4000);
			O.findElement(By.xpath("//*[@*='userDataLightBox_deleteBtn']")).click();
			Thread.sleep(4000);
			Alert obj=O.switchTo().alert();
			String A=obj.getText();
			System.out.println(A);
			obj.accept();
			Thread.sleep(4000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void Logout()
	{
		try
		{
			O.findElement(By.xpath("//a[@*='logoutLink']")).click();
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
			O.close();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
