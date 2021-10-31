package com.stormnet.tests.functionalTest;

import com.stormnet.tests.AbstractTest;
import common.driver.UiDriver;
import common.driver.UiDriverHelper;
import io.qameta.allure.Allure;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import padeWrappers_Yandex_ru.loginPage.LoginFormHelper;

import java.io.ByteArrayInputStream;


public class LoginPageTest extends AbstractTest {

	@BeforeMethod
	public void openPage() {
		UiDriver.getDriver().get("https://disk.yandex.by/");
	}


	@Test(testName = "Login with right credentials")
	@Story("LG_001")
	public void loginTestRightCredentials() {
		LoginFormHelper.submitSite();
		LoginFormHelper.fillUsername("ella.sushitskaya");
		LoginFormHelper.fillPassword("happyMood");
		LoginFormHelper.submitForm();



	}


}


