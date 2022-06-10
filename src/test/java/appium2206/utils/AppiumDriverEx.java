package appium2206.utils;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumDriverEx {

	public static AppiumDriver<MobileElement> getAppiumDriver() {
		
		// Driver instance
		AppiumDriver<MobileElement> appiumDriver = null;
		
		try {
			// Desiredcapabilities to send to Appium server
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability(MobileCapabilityTypeEx.PLATFORM_NAME, "Android");
			caps.setCapability(MobileCapabilityTypeEx.AUTOMATION_NAME, "uiautomator2");
			caps.setCapability(MobileCapabilityTypeEx.APP,
					"C:\\projetos\\appium2206\\app\\Android-NativeDemoApp-0.4.0.apk");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
			caps.setCapability(MobileCapabilityTypeEx.APP_PACKAGE, "com.wdiodemoapp");
			caps.setCapability(MobileCapabilityTypeEx.APP_ACTIVITY, "com.wdiodemoapp.MainActivity");
			caps.setCapability(MobileCapabilityTypeEx.NEW_COMMAND_TIMEOUT, 120);

			// Setup the appium server URL to connect to
			URL appiumServer = new URL("http://localhost:4723/wd/hub");
			
			appiumDriver = new AppiumDriver<MobileElement>(appiumServer, caps);
			appiumDriver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
			
			MobileElement loginLabel = appiumDriver.findElementByAccessibilityId("Login");
			loginLabel.click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return appiumDriver;
	}
}
