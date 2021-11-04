package padeWrappers_Yandex_by.formMail;


import common.driver.Waiter;
import common.elements.Attach;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import padeWrappers_Yandex_by.landingPage.WriteMail;
import padeWrappers_Yandex_by.loginPage.LoginForm;


import java.time.Duration;

import static common.driver.UiDriver.getDriver;

public class FormMailHelper {
	private static Attach attachFile;

	public static void fillEmail(String email) {
		FormMail.getEmailField().sendKeys(email);
	}
	public static void fillSubject(String subject) {
		FormMail.getSubjectField().sendKeys(subject);
	}
	public static void fillText(String text) {
		FormMail.getTextField().sendKeys(text);
	}
	public static void sendMail() {
		FormMail.getSendButton().click();
	}

	public static void attachFail(String file){
		FormMail.getAttachFile().attach("C:\\Users\\Гена\\test\\локаторы.txt");
	}
	public static void fillUsername(String username) {
		LoginForm.getUserNameField().sendKeys(username);
	}

	public static void waitUntilOpenedFormMail() {
		Waiter.untilVisable(FormMail.SEND_FORM_LOCATOR,"Form was not opened");
	}


	public static void waitUntilAfterSendMail() {
		Waiter.untilVisable(FormMail.FORM_AFTER_SEND_LOCATOR,"Form was not opened");
	}


}
