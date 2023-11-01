package Page_Object;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
 

public class Login_page {

	
	private static  AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) throws MalformedURLException {
		Login_page login = new Login_page( );
		login.launch();

	}
	public static  AppiumDriver<MobileElement> getDriver() {
		return driver;
	}
	public static   AppiumDriver<MobileElement> launch()  {

		try {
			// Set the Appium server URL
			URL appiumServerUrl = new URL("http://localhost:4723/wd/hub");

			DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
			desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
			desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "4d59fb4e");
			desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Apk_testing\\yash_special\\app-debug.apk");
			
			desiredCapabilities.setCapability("appPackage", "io.cordova.pharmaClick");
			desiredCapabilities.setCapability("appActivity", "io.cordova.pharmaClick.MainActivity");
			desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");

			driver = new AndroidDriver<MobileElement>(appiumServerUrl, desiredCapabilities);
			
			System.out.println("Application is starting............. ");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
		return driver;
		
	}
}
