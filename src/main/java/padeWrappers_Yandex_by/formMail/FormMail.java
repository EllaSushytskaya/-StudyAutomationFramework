package padeWrappers_Yandex_by.formMail;

import common.elements.Button;
import common.elements.Input;
import org.openqa.selenium.By;

public class FormMail {
	private static final By FROM_FIELD_LOCATOR = By.xpath("//div[@class=\"MultipleAddressesDesktop ComposeRecipients-MultipleAddressField ComposeRecipients-ToField tst-field-to\"]//div[@is=\"x-bubbles\"]");
	private static final By SUBJECT_FIELD_LOCATOR = By.xpath("//input[@name=\"subject\"]");
	private static final By TEXT_IN_BUTTON_LOCATOR = By.id("editor7");
	private static final By SEND_BUTTON_LOCATOR = By.id("//div[@class=\"ComposeControlPanel-Part\"]//div[@class=\"ComposeSendButton-Text\"]");
	public static final By SEND_FORM_LOCATOR = By.xpath("//div[@class=\"ComposeManager ComposeManager_hidden ComposeManager_size_large\"]");

	public static Input getEmailField() {
		return new Input(FROM_FIELD_LOCATOR);
	}
	public static Input getSubjectField() {
		return new Input(SUBJECT_FIELD_LOCATOR);
	}
	public static Input getTextField() {
		return new Input(TEXT_IN_BUTTON_LOCATOR);
	}
	public static Button getSendButton() {
		return new Button(SEND_BUTTON_LOCATOR);
	}

}


