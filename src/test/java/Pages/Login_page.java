package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Base_Class.WrapperClass;
public class Login_page  extends  WrapperClass{           //   loginpage
	By usr=By.xpath("//input[@id='user-name']");
	By pwd=By.xpath("//input[@id='password']");
	By login=By.xpath("//input[@class='btn_action']");
	 WebDriver dr;
	public Login_page(WebDriver dr)
	{
		this.dr=dr;
	}
	public void Username(String name)        //   Entering username
	{
		WebElement e1=WaitForElement(usr,20);         
		e1.sendKeys(name);
	}
	public void Password(String pswd)      // Entering password
	{
		WebElement e2=WaitForElement(pwd,20);
		e2.sendKeys(pswd);
	}
	public void login()                     //  Clicking Login Button
	{
		WebElement e3=WaitForElement(login,20);
		e3.click();
	}
	public  void Total_Login(String username,String paswd)      //  Calling Total Login Functions
	{
		System.out.println(username+" "+paswd);
		this.Username(username);
		this.Password(paswd);
		this.login();	
	}
}