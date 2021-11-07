package padeWrappers_Yandex_by.landingPage;

import common.driver.Waiter;

public class WriteMailHelper {

	public static void openMail() {
		WriteMail.getOpenFormWriteMailButton().click();
	}

	public static void waitUntilOpenedFormMail() {
		Waiter.untilVisable(WriteMail.OPEN_FORM_WRITE_MAIL_BUTTON_LOCATOR, "Page was not opened");
	}


}
