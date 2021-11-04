package padeWrappers_Yandex_by.loginPage;

import common.driver.Waiter;



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
		Waiter.untilVisable(LoginFormPassword.OPEN_LOGIN_FORM_BUTTON_LOCATOR,"Page was not opened");
	}

}




