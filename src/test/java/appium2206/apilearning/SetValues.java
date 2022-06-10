package appium2206.apilearning;

import appium2206.utils.AppiumDriverEx;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SetValues {

	public static void main(String[] args) {
		
	
	// 1. Launch the target app
	AppiumDriver<MobileElement> appiumDriver = AppiumDriverEx.getAppiumDriver();
	
	// 2. Click on Login Label
	MobileElement loginLabel = appiumDriver.findElementByAccessibilityId("Login");
	loginLabel.click();
	
	// 3. input username
	MobileElement emailTxtBx = appiumDriver.findElementByAccessibilityId("input-email");
	emailTxtBx.sendKeys("yujiyamamoto64@gmail.com");
	
	// 4. input password
	MobileElement passwordTxtBx = appiumDriver.findElementByAccessibilityId("input-password");
	passwordTxtBx.sendKeys("password");
	
	// 5. click on login button
	MobileElement loginBtn = appiumDriver.findElementByAccessibilityId("button-LOGIN");
	loginBtn.click();
	
	}
}
