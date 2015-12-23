package install;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;



public class Install {
	
	private WebDriver dr;
	  
	
	@Test
		public void initialSetUp() throws InterruptedException
		{
	 
		  File appD = new File("C:\\Users\\bliss\\Desktop\\TwiTv_SetUp");
		  File app = new File(appD, "TWiT_V1.0.7.apk");
		  
		  DesiredCapabilities capabilities = new DesiredCapabilities();
		  
		  	capabilities.setCapability("device", "Android");
		  	capabilities.setCapability("deviceName", "Moto G2");
		  	capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("platformVersion", "5.0.2");
			capabilities.setCapability("app", app.getAbsolutePath());
			// The URL where the hub will start
			
			try {
				dr = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
						capabilities);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	 
	
	
	
	

}
