package PageObjectModel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssgnMethods1 {
	public static WebDriver oBrowser=null;
	public static AssgnMethods oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		min();
		createuser();
		deletcreat();
		logout();
		closeApplication();
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\JavaAutomation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new AssgnMethods(oBrowser);
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
	static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getoLogin().click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void min()
	{
		try
		{
			oPage.getminwindow().click();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createuser()
	{
		try
		{
			oPage.getCreatuser().click();
			Thread.sleep(4000);
			oPage.getaddnew().click();
			Thread.sleep(4000);
			oPage.getfn().sendKeys("admin1");
			oPage.getlastname().sendKeys("naik");
			oPage.getmail().sendKeys("vinayaknaik51@gmail.com");
			oPage.getusername().sendKeys("vinu");
			oPage.getmailpwd().sendKeys("0774");
			oPage.getrepwd().sendKeys("0774");
			oPage.getcreateclick().click();
	        Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deletcreat()
	{
		try
		{
			oPage.getclickoncreater().click();
			Thread.sleep(4000);
			oPage.getdelet().click();
			Alert obj=oBrowser.switchTo().alert();
			String cont=obj.getText();
			System.out.println(cont);
			obj.accept();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
