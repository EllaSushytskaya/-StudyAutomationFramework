package padeWrappers_Yandex_ru.landingPage;

import common.elements.Button;
import org.openqa.selenium.By;

public class WriteMail {

	public static final By OPEN_FORM_WRITE_MAIL_BUTTON_LOCATOR = By.xpath("//a[@class=\"mail-ComposeButton js-main-action-compose\"]");

	public static Button getOpenFormWriteMailButton() {
		return new Button(OPEN_FORM_WRITE_MAIL_BUTTON_LOCATOR);
	}
}
