package appium2206;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchApp {

	public static void main(String[] args) {

		try {
			// Driver instance
			AppiumDriver<MobileElement> appiumDriver;

			// Desiredcapabilities to send to Appium server
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
			caps.setCapability(MobileCapabilityType.APP,
					"C:\\projetos\\appium2206\\app\\Android-NativeDemoApp-0.4.0.apk");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
			caps.setCapability("appPackage", "com.wdiodemoapp");
			caps.setCapability("appActivity", "com.wdiodemoapp.MainActivity");

			// Setup the appium server URL to connect to
			URL appiumServer = new URL("http://localhost:4723/wd/hub");
			
			appiumDriver = new AppiumDriver<MobileElement>(appiumServer, caps);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
