package padeWrappers_Yandex_ru.formMail;


import padeWrappers_Yandex_ru.loginPage.LoginForm;

public class FormMailHelper {
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
}
