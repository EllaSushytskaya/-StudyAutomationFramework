package padeWrappers_Yandex_by.formMail;


import common.driver.UiDriver;
import common.driver.Waiter;
import common.elements.Attach;
import org.openqa.selenium.UnhandledAlertException;


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

	public static void attachFail(String file) {
		try {
			FormMail.getAttachFile().attach(file);
		} catch (UnhandledAlertException e) {
			UiDriver.closeAllert();
		}
	}


	public static void waitUntilOpenedFormMail() {
		Waiter.untilVisable(FormMail.SEND_FORM_LOCATOR, "Form was not opened");
	}


	public static void waitUntilAfterSendMail() {
		Waiter.untilVisable(FormMail.FORM_AFTER_SEND_LOCATOR, "Form was not opened");
	}


}
