package Base_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WrapperClass {
	static WebDriver dr;
	WebElement wb1;
	public static WebDriver Launch_browser(String browser,String url)
	{
		switch(browser)
		{
		case "CHROME":
			System.setProperty("webdriver.chrome.driver","src\\test\\resources\\DRIVER\\chromedriver.exe");
			dr=new ChromeDriver();
		break;
		case "FIREFOX":
			System.setProperty("webdriver.gecko.driver","src\\test\\resources\\DRIVER\\geckodriver.exe");
			dr=new FirefoxDriver();
		break;	
		}
		dr.get(url);
		return dr;
	}
	public WebElement WaitForElement(By locator,int timeout)
	{	
		try
		{
		WebDriverWait wt= new WebDriverWait(dr,timeout);
		 wb1=wt.until(ExpectedConditions.visibilityOfElementLocated(locator));
		 return wb1;
		}
		catch (Exception e)
		{
			System.out.println("no element found");
					return null;
		}	
	}
	public WebElement WaitForClickable(By locator,int timeout)
	{
		try
		{
		WebDriverWait wt= new WebDriverWait(dr,timeout);
		 wb1=wt.until(ExpectedConditions.visibilityOfElementLocated(locator));
		 return wb1;
		}
		catch (Exception e)
		{
			System.out.println("no element found");
			return null;
		}	
	}}