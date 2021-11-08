package com.stormnet.tests.functionalTest;

import com.stormnet.tests.AbstractTest;
import common.driver.UiDriver;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import padeWrappers_Yandex_by.disk.DownloadFile;
import padeWrappers_Yandex_by.disk.DownloadFileHelper;
import padeWrappers_Yandex_by.disk.FileHelper;
import padeWrappers_Yandex_by.formMail.FormMailHelper;
import padeWrappers_Yandex_by.landingPage.AreaInboxHelper;
import padeWrappers_Yandex_by.landingPage.HeaderPanelHelper;
import padeWrappers_Yandex_by.landingPage.WriteMailHelper;
import padeWrappers_Yandex_by.loginPage.LoginFormHelper;


public class LoginPageTest extends AbstractTest {

	@BeforeMethod
	public void openPage() {
		UiDriver.getDriver().get("https://mail.yandex.by/");
	}


	@Test
	@Story("Send and delete mail")
	public void sendAndDeleteMail() {

		LoginFormHelper.openMail();
		LoginFormHelper.fillUsername("ella.sushitskaya");
		LoginFormHelper.submitForm();
		LoginFormHelper.waitUntilOpened();
		LoginFormHelper.fillPassword("happyMood");
		LoginFormHelper.submitForm();

		WriteMailHelper.waitUntilOpenedFormMail();
		WriteMailHelper.openMail();

		FormMailHelper.waitUntilOpenedFormMail();
		FormMailHelper.fillEmail("ella.sushitskaya@yandex.by");
		FormMailHelper.fillSubject("test");
		FormMailHelper.fillText("testform");
		FormMailHelper.attachFail("C:\\Users\\Гена\\test\\локаторы.txt");
		FormMailHelper.sendMail();
		FormMailHelper.waitUntilAfterSendMail();
		UiDriver.refDriver();

		AreaInboxHelper.waitUntilIconDisk();
		AreaInboxHelper.saveDisk();

		HeaderPanelHelper.openDisk();

		FileHelper.openDownload();

		DownloadFileHelper.doRightClick();




	}













	}





