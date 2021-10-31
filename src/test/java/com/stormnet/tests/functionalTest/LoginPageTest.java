package com.stormnet.tests.functionalTest;

import com.stormnet.tests.AbstractTest;
import common.driver.UiDriver;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import padeWrappers_Yandex_ru.loginPage.LoginFormHelper;


public class LoginPageTest extends AbstractTest {

	@BeforeMethod
	public void openPage() {
		UiDriver.getDriver().get("https://disk.yandex.by/");
	}


	@Test(testName = "Login with right credentials")
	@Story("LG_001")
	public void loginTestRightCredentials()  {


		LoginFormHelper.submitSite();
		LoginFormHelper.fillUsername("ella.sushitskaya");
		LoginFormHelper.submitForm();
		LoginFormHelper.waitUntilOpened();
		LoginFormHelper.fillPassword("happyMood");
		LoginFormHelper.submitForm();




	}


}


