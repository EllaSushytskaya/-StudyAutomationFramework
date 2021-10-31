package padeWrappers_Yandex_ru.loginPage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static common.driver.UiDriver.getDriver;


public class LoginFormHelper {

	public static void openMail(){
		LoginForm.getOpenMail().click();
	}

	public static void fillUsername(String username) {
		LoginForm.getUserNameField().sendKeys(username);
	}

	public static void fillPassword(String password) {
		LoginForm.getPasswordsField().sendKeys(password);
	}

	public static void submitForm() {
		LoginForm.getSignInButton().click();
	}

	public static void waitUntilOpened() {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
		wait.withMessage("Page was not opened")
				.until(ExpectedConditions.visibilityOfElementLocated(LoginFormPassword.OPEN_LOGIN_FORM_BUTTON_LOCATOR));
	}

}




