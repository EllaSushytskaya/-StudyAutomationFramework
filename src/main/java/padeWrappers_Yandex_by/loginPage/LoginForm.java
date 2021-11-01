package padeWrappers_Yandex_by.loginPage;

import common.elements.Button;
import common.elements.Input;
import org.openqa.selenium.By;
import padeWrappers_Yandex_by.AbstractPage;


public class LoginForm extends AbstractPage {
	private static final By OPEN_MAIL_LOCATOR = By.xpath("// div[@class=\"HeadBanner-ButtonsWrapper\"]/a[@data-lego=\"react\"][2]");
	private static final By USERNAME_FIELD_LOCATOR = By.id("passp-field-login");
	private static final By PASSWORD_FIELD_LOCATOR = By.id("passp-field-passwd");
	private static final By SIGN_IN_BUTTON_LOCATOR = By.id("passp:sign-in");

	public static Button getOpenMail() {
		return new Button(OPEN_MAIL_LOCATOR);
	}


	public static Input getUserNameField() {
		return new Input(USERNAME_FIELD_LOCATOR);
	}

	public static Input getPasswordsField() {
		return new Input(PASSWORD_FIELD_LOCATOR);
	}

	public static Button getSignInButton() {
		return new Button(SIGN_IN_BUTTON_LOCATOR);
	}


}