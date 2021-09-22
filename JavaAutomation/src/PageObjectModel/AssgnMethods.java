package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssgnMethods {
	WebDriver oBrowser=null;
	public AssgnMethods(WebDriver oBrowser)
{
		
	PageFactory.initElements(oBrowser, this);
	
}
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement Login;
	public WebElement getoLogin()
	{
		return Login;
	}
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getminwindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	@FindBy(xpath="//a[@href and @class='content users']")
	private WebElement contentusers;
	public WebElement getCreatuser()
	{
		return contentusers;
	}
	@FindBy(xpath="//div[@class='buttonText']")
	private WebElement buttonText;
	public WebElement getaddnew()
	{
		return buttonText;
	}
	private WebElement firstName;
	public WebElement getfn()
	{
		return firstName;
	}
	private WebElement userDataLightBox_lastNameField;
	public WebElement getlastname()
	{
		return userDataLightBox_lastNameField;
	}
	private WebElement userDataLightBox_emailField;
	public WebElement getmail()
	{
		return userDataLightBox_emailField;
	}
	private WebElement userDataLightBox_usernameField;
	public WebElement getusername()
	{
		return userDataLightBox_usernameField;
	}
	private WebElement password;
	public WebElement getmailpwd()
	{
		return password;
	}
	private WebElement passwordCopy;
	public WebElement getrepwd()
	{
		
		return passwordCopy;
	}
	@FindBy(xpath="//span[@class='buttonTitle']")
	private WebElement buttonTitle;
	public WebElement getcreateclick()
	{
		return buttonTitle;
	}
	@FindBy(xpath="//div[@class='name']")
	private WebElement name;
	public WebElement getclickoncreater()
	{
		return name;
	}
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getdelet()
	{
		return userDataLightBox_deleteBtn;
	}
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}
	//click on save change button
	@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
	private WebElement Modify;
	public WebElement getsavechanges()
	{
		return Modify;
	}
	//click on task
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a")
    private WebElement task;
	public WebElement gettask()
	{
		return task;
	}
	//click on add new
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div")
	private WebElement addnew;
	public WebElement getclickaddnew()
	{
		return addnew;
	}
	//click on new customer 
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement clicknewcust;
	public WebElement getclicknewcust()
	{
		return clicknewcust;
	}
	//enter the customer name
	private WebElement customerLightBox_nameField;
	public WebElement getaddcust()
	{
		return customerLightBox_nameField;
	}
	//enter the descrption
	private WebElement customerLightBox_descriptionField;
	public WebElement getadddesc()
	{
		return customerLightBox_descriptionField;
	}
	//click on create customer button
	@FindBy(xpath="//*[@id=\"customerLightBox_commitBtn\"]/div/span")
	private WebElement createbutton;
	public WebElement getclickcreatebutton()
	{
		return createbutton;
	}
	//click on Wipro
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement wipro;
	public WebElement getclickonwibro()
	{
		return wipro;
	}
	// click on action button
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")
	private WebElement action;
	public WebElement getclickonaction()
	{
		return action;
	}
	//click on delete button
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")
	private WebElement delet;
	public WebElement getclickondelet()
	{
		return delet;
	}
	// click on permanent delet
	@FindBy(xpath="//*[@id=\"customerPanel_deleteConfirm_submitTitle\"]")
	private WebElement deletperm;
	public WebElement getclickondeletperm()
	{
		return deletperm;
	}
	// changing the customer descrption
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
	private WebElement modify;
	public WebElement getmodifycust()
	{
		return modify;
	}
	
}
