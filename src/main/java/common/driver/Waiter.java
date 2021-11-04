package common.driver;

import common.elements.HtmlElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Waiter {
	private static final int defoultWaitTimeInSecond = 5;

	public static void untilVisable(By element, String message) {
		new WebDriverWait(UiDriver.getDriver(), Duration.ofSeconds(defoultWaitTimeInSecond))
				.withMessage("Form was not opened")
				.until(ExpectedConditions.visibilityOfElementLocated(element));
	}
}
