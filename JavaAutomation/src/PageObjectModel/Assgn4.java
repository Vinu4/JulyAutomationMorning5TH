package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assgn4 {

	public static WebDriver oBrowser=null;
	public static AssgnMethods oPage=null;
		public static void main(String[] args) {
			launchBrowser();
			navigate();
			login();
			min();
			createcustomer();
			modifycustomer();
			
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
		static void createcustomer()
		{
			try
			{
				oPage.gettask().click();
				Thread.sleep(4000);
				oPage.getclickaddnew().click();
				Thread.sleep(2000);
				oPage.getclicknewcust().click();
				Thread.sleep(4000);
				oPage.getaddcust().sendKeys("Wipro");
				oPage.getadddesc().sendKeys("ABC");
				oPage.getclickcreatebutton().click();
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void modifycustomer()
		{
			try
			{
				oPage.getclickonwibro().click();
				Thread.sleep(4000);
				oPage.getmodifycust().clear();
				oPage.getmodifycust().sendKeys("TAC");
				
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


