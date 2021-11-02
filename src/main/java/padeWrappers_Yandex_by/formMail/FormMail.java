package padeWrappers_Yandex_by.formMail;

import common.elements.Attach;
import common.elements.Button;
import common.elements.Input;
import org.openqa.selenium.By;

public class FormMail {

	private static final By FROM_FIELD_LOCATOR = By.xpath("//div[@class=\"MultipleAddressesDesktop ComposeRecipients-MultipleAddressField ComposeRecipients-ToField tst-field-to\"]//div[@is=\"x-bubbles\"]");
	private static final By SUBJECT_FIELD_LOCATOR = By.xpath("//input[@name=\"subject\"]");
	private static final By TEXT_IN_BUTTON_LOCATOR = By.xpath("//div[@id=\"cke_1_contents\"]//div//div");
	private static final By SEND_BUTTON_LOCATOR = By.xpath("//button[@class=\"Button2 Button2_pin_circle-circle Button2_view_default Button2_size_l\"]");
	public static final By SEND_FORM_LOCATOR = By.xpath("//div[@class=\"ComposeControlPanel-Part\"]//span[@class=\"Button2-Text\"]//div[@class=\"ComposeSendButton-Text\"]");
	private static final By ATTACH_FIELD_LOCATOR = By.xpath("//input[@class=\"WithUpload-FileInput\"]");
	public static final By FORM_AFTER_SEND_LOCATOR = By.xpath("//div[@class=\"ComposeDoneScreen-Header\"]");

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
	public static Attach getAttachFile(){ return new Attach(ATTACH_FIELD_LOCATOR);
	}





}


