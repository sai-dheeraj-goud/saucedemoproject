package Test_Cases;
import org.testng.annotations.Test;
import Base_Class.Get_Excel;
import Base_Class.WrapperClass;
import Pages.About_Page;
import Pages.AddtoCart_Page;
import Pages.Login_page;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
public class Demo_Sauce_testng extends Get_Excel{
	 static WebDriver dr;
	 @BeforeClass
	  public void beforeMethod() {
		 get_Excel();
	  }
  @Test(dataProvider="logindata")
  public void Logindata(String Username,String Password) throws InterruptedException {
	  System.out.println("mohan");
	  dr=WrapperClass.Launch_browser("CHROME","https://www.saucedemo.com/");
	 Login_page Ln=new Login_page(dr);
	  System.out.println(Username+" "+Password);
	Ln.Total_Login(Username,Password);
  }
  @DataProvider(name="logindata")
  public String[][] data_Provider() {
	  System.out.println("return data");
	  return testdata;
  }
  public void searchA2B()
  {
	  AddtoCart_Page a=new AddtoCart_Page(dr);
	  a.SearchA2Z();
	  a.Addtocart_btn();
  }
  public void AboutPage() throws InterruptedException
  {
	  About_Page a2=new About_Page(dr);
	  a2.link_for_aboutpage();
	  a2.About_Saucedemo();
	  a2.any_btn();
  }
  @AfterMethod()
  public void hd() throws InterruptedException
  {
	  searchA2B();
		AboutPage(); 
		dr.close();
  }}