package padeWrappers_Yandex_by.loginPage;


import common.driver.Waiter;
import io.qameta.allure.Step;
import logerator.Logger;
import org.testng.Assert;
import padeWrappers_Yandex_by.landingPage.LandingPage;
import padeWrappers_Yandex_by.landingPage.LandingPageHelper;

public class LoginFormHelper {

	@Step("Open page mail")
	public static void openMail() {
		LoginForm.getOpenMail().click();
	}

	@Step("Fill username by {0}")
	public static void fillUsername(String username) {
		LoginForm.getUserNameField().sendKeys(username);
	}

	@Step("Fill password by {1}")
	public static void fillPassword(String password) {
		LoginForm.getPasswordsField().sendKeys(password);
	}
	@Step("Submit form")
	public static void submitForm() {
		LoginForm.getSignInButton().click();
	}
	@Step("Wait until open landing page")
	public static void waitUntilOpenedFormPassword() {
		Waiter.untilVisable(LoginForm.LoginFormPassword.getOpenLoginFormPasswordButton(), "Page was not opened");
	}

	@Step("Login to application with creds")
	public static void loginWithCreds(String userName, String password) {
		Logger.getLogger().info("Try to login as {}/{}", userName, password);
		openMail();
		fillUsername(userName);
		submitForm();
		waitUntilOpenedFormPassword();
		fillPassword(password);
		submitForm();
		LandingPageHelper.WriteMailHelper.waitUntilOpenedFormMail();
		Assert.assertTrue(LandingPage.WriteMail.getOpenFormWriteMailButton().getElement().isDisplayed(),"User is not login");
		Logger.getLogger().info("Logged in as {}/{}", userName, password);
	}

}




