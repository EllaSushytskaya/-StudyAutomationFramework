package padeWrappers_Yandex_by.formMail;


import common.driver.Waiter;
import io.qameta.allure.Step;
import logerator.Logger;
import org.testng.Assert;
import padeWrappers_Yandex_by.landingPage.LandingPage;


public class FormMailHelper {

	@Step("Fill email by {0}")
	public static void fillEmail(String email) {
		FormMail.getEmailField().sendKeys(email);
	}

	@Step("Fill subject by {1}")
	public static void fillSubject(String subject) {
		FormMail.getSubjectField().sendKeys(subject);
	}

	@Step("Fill text by {2}")
	public static void fillText(String text) {
		FormMail.getTextField().sendKeys(text);
	}

	@Step("Send mail")
	public static void sendMail() {
		FormMail.getSendButton().click();
	}


	@Step("Attach file")
	public static void attachFail(String file) {
		FormMail.getAttachFile().attach(file);
	}

	@Step("Wait until attach file")
	public static void waitUntilAttachFile() {
		Waiter.untilInVisable(FormMail.getProgressBar(), "File not attach");
	}

	@Step("Wait until open form mail")
	public static void waitUntilOpenedFormMail() {
		Waiter.untilVisable(FormMail.getSendForm(), "Form was not opened");
	}

	@Step("Wait until after send mail")
	public static void waitUntilVisibleFormAfterSendMail() {
		Waiter.untilVisable(FormMail.getFormAfterSend(), "Form was not opened");
	}



	@Step("Write mail")
	public static void writeMail(String email, String subject, String text, String file) {
		Logger.getLogger().info("Try to write as {}/{}/{}", email, subject, text);
		waitUntilOpenedFormMail();
		fillEmail(email);
		fillSubject(subject);
		fillText(text);
		attachFail(file);
		waitUntilAttachFile();
		sendMail();
		waitUntilVisibleFormAfterSendMail();
		Assert.assertTrue(FormMail.getFormAfterSend().getElement().isDisplayed(),"Mail is not send");
		Logger.getLogger().info("Write mail as {}/{}/{}", email, subject, text);

	}


}
