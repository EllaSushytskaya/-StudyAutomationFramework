package padeWrappers_Yandex_by.landingPage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static common.driver.UiDriver.getDriver;

public class WriteMailHelper {

	public static void openMail(){
		WriteMail.getOpenFormWriteMailButton().click();
	}

	public static void waitUntilOpenedFormMail() {
		WebDriverWait waitOpenMail = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
		waitOpenMail.withMessage("Page was not opened")
				.until(ExpectedConditions.visibilityOfElementLocated(WriteMail.OPEN_FORM_WRITE_MAIL_BUTTON_LOCATOR));
	}

}
