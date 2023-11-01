package Stepdef;

import Page_Object.Login_page;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
 

public class Login_stepdef {
	public  AppiumDriver<MobileElement> driver;
	   //AppiumDriver<MobileElement> driver;
	
	Login_page login = new Login_page();
	
	@Given("user on login page")
	public void user_on_login_page()   {		
	driver=	login.launch();
	System.out.println(driver +" driver print ");
	}

}
