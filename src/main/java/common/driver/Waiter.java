package common.driver;

import common.elements.HtmlElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Waiter {
	private static final int defaultWaitTimeInSecond = 7;

	public static void untilVisable(HtmlElement element, String message) {
		new WebDriverWait(UiDriver.getDriver(), Duration.ofSeconds(defaultWaitTimeInSecond))
				.withMessage("Form was not opened")
				.until(ExpectedConditions.visibilityOfElementLocated(element.getLocator()));
	}

	public static void untilInVisable(HtmlElement element, String message) {
		new WebDriverWait(UiDriver.getDriver(), Duration.ofSeconds(defaultWaitTimeInSecond))
				.withMessage("Form was not opened")
				.until(ExpectedConditions.invisibilityOfElementLocated(element.getLocator()));


	}
}
