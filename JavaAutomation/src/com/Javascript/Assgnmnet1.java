package com.Javascript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assgnmnet1 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		displaytitle();
		displayurl();
		Login();
		minimize();
		createuser();
		deletuser();
		logout();
	}
	static void launchBrowser()
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
	static void displaytitle()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			String title=(String) js.executeScript("var kk=document.title;return kk;");
			System.out.println(title);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	static void displayurl()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			String url=(String)js.executeScript("var kk=document.URL;return kk;");
			System.out.println(url);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void Login( 
			)
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			js.executeScript("document.getElementById('username').value='admin';");
			WebElement oEle=oBrowser.findElement(By.name("pwd"));
			js.executeScript("arguments[0].value='manager'",oEle);
			WebElement oEl=oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div"));
			js.executeScript("arguments[0].click()",oEl);
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
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			WebElement O=oBrowser.findElement(By.id("gettingStartedShortcutsPanelId"));
			js.executeScript("arguments[0].click()",O);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	static void createuser()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			WebElement O=oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a"));
			js.executeScript("arguments[0].click()", O);
			Thread.sleep(2000);
			WebElement OE=oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div"));
			js.executeScript("arguments[0].click()", OE);
			Thread.sleep(2000);
			js.executeScript("document.getElementById('userDataLightBox_firstNameField').value='demo';");
			js.executeScript("document.getElementById('userDataLightBox_lastNameField').value='naik';");
			js.executeScript("document.getElementById('userDataLightBox_emailField').value='vinayaknaik51@gmail.com';");
			js.executeScript("document.getElementById('userDataLightBox_usernameField').value='vinu';");
			js.executeScript("document.getElementById('userDataLightBox_passwordField').value='0774';");
			js.executeScript("document.getElementById('userDataLightBox_passwordCopyField').value='0774';");
			js.executeScript("document.getElementById('userDataLightBox_commitBtn').click();");
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
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			WebElement OE=oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]"));
			js.executeScript("arguments[0].click()",OE);
			Thread.sleep(2000);
			WebElement Oe=oBrowser.findElement(By.xpath("//button[@id='userDataLightBox_deleteBtn']"));
			js.executeScript("arguments[0].click()", Oe);
			Thread.sleep(1000);
			Alert obj=oBrowser.switchTo().alert();
			String content=obj.getText();
			System.out.println(content);
			obj.accept();
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
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			WebElement oe=oBrowser.findElement(By.xpath("//*[@id=\"logoutLink\"]"));
			js.executeScript("arguments[0].click()", oe);
			Thread.sleep(4000);
			oBrowser.close();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			
			e.printStackTrace();
		}
	}
}
