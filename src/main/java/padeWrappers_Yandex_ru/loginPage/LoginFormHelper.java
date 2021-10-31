package padeWrappers_Yandex_ru.loginPage;

public class LoginFormHelper {

	public static void submitSite(){
		LoginForm.getSignOpen().click();
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

	public static void loginWithCreds(String userName, String password) {
		fillUsername(userName);
		fillPassword(password);
		submitForm();


	}
}