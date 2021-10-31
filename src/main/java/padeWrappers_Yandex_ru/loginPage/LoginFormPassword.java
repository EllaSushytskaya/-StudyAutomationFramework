package padeWrappers_Yandex_ru.loginPage;

import common.elements.Button;
import org.openqa.selenium.By;

public class LoginFormPassword {
	public static final By OPEN_LOGIN_FORM_BUTTON_LOCATOR = By.xpath("//div[@data-t=\"page:welcome\"]");

	public static Button getOpenLoginFormPasswordButton() {
		return new Button(OPEN_LOGIN_FORM_BUTTON_LOCATOR);
	}
}
