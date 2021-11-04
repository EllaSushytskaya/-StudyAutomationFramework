package padeWrappers_Yandex_by.landingPage;

import common.elements.Button;
import org.openqa.selenium.By;

public class WriteMail {

	public static final By OPEN_FORM_WRITE_MAIL_BUTTON_LOCATOR = By.xpath("//a[contains(@class, \"mail-ComposeButton\")]");

	public static Button getOpenFormWriteMailButton() {
		return new Button(OPEN_FORM_WRITE_MAIL_BUTTON_LOCATOR);
	}
}
