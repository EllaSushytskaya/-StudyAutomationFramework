package padeWrappers_Yandex_ru.loginPage;

import common.elements.Button;
import common.elements.Input;
import org.openqa.selenium.By;
import padeWrappers_Yandex_ru.AbstractPage;


public class LoginForm extends AbstractPage {
	private static final By SIGN_OPEN_SITE_LOCATOR = By.xpath("//a[@class=\"button button_login header__login-link\"]");
	private static final By USERNAME_FIELD_LOCATOR = By.id("passp-field-login");
	private static final By PASSWORD_FIELD_LOCATOR = By.id("passp-field-passwd");
	private static final By SIGN_IN_BUTTON_ID_LOCATOR = By.id("passp:sign-in");

	public static Button getSignOpen() {
		return new Button(SIGN_OPEN_SITE_LOCATOR);
	}

	public static Input getUserNameField() {
		return new Input(USERNAME_FIELD_LOCATOR);
	}

	public static Input getPasswordsField() {
		return new Input(PASSWORD_FIELD_LOCATOR);
	}

	public static Button getSignInIDButton() {
		return new Button(SIGN_IN_BUTTON_ID_LOCATOR);
	}


}