package appium2206.apilearning;

import java.util.List;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import appium2206.utils.AppiumDriverEx;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class HandleMultipleMatchedElements {

	public static void main(String[] args) throws InterruptedException{
		
		// Start an Appium Session
		AppiumDriver<MobileElement> appiumDriver = AppiumDriverEx.getAppiumDriver();
		
		// Click on Login Label
		MobileElement loginLabel = appiumDriver.findElementByAccessibilityId("Login");
		loginLabel.click();
		
		// Find elements those are matched //*[@text="Login"]
		WebDriverWait wait = new WebDriverWait(appiumDriver, 30L);
		wait.until(ExpectedConditions.numberOfElementsToBe(MobileBy.xpath("//*[@text='Login']"), 2));
		
		List<MobileElement> loginTextElements = appiumDriver.findElementsByXPath("//*[@text='Login']");
		final int LOGIN_TEXT_FORM_INDEX = 0;
		final int LOGIN_MENU_TEXT_INDEX = 1;
		
		loginTextElements.get(LOGIN_TEXT_FORM_INDEX).click();
		loginTextElements.get(LOGIN_MENU_TEXT_INDEX).click();
		
	}
}
