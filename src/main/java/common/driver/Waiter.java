package common.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Waiter {
	private static final int defaultWaitTimeInSecond = 7;

	public static void untilVisable(By element, String message) {
		new WebDriverWait(UiDriver.getDriver(), Duration.ofSeconds(defaultWaitTimeInSecond))
				.withMessage("Form was not opened")
				.until(ExpectedConditions.visibilityOfElementLocated(element));
	}
}
