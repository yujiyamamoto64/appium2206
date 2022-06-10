package appium2206.apilearning;

import appium2206.utils.AppiumDriverEx;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ClickOnElement {

	public static void main(String[] args) {
		AppiumDriver<MobileElement> appiumDriver = AppiumDriverEx.getAppiumDriver();
		MobileElement loginLabel = appiumDriver.findElementByAccessibilityId("Login");
		loginLabel.click();
	}
}
