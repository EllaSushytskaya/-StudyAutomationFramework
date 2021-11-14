package com.stormnet.tests.functionalTest;

import com.stormnet.tests.AbstractTest;
import common.driver.UiDriver;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import padeWrappers_Yandex_by.disk.DiskPageHelper;
import padeWrappers_Yandex_by.formMail.FormMailHelper;
import padeWrappers_Yandex_by.landingPage.LandingPageHelper;
import padeWrappers_Yandex_by.loginPage.LoginFormHelper;


public class SendAndDeleteMailTest extends AbstractTest {

	@BeforeMethod
	public void openPage() {
		UiDriver.getDriver().get("https://mail.yandex.by/");
	}


	@Test
	@Story("Send and delete mail")
	public void sendAndDeleteMail() {

		LoginFormHelper.loginWithCreds("ella.sushitskaya", "happyMood");
		LandingPageHelper.WriteMailHelper.openFormWriteMail();
		FormMailHelper.writeMail("ella.sushitskaya@yandex.by","test", "testform","C:\\\\Users\\\\Гена\\\\test\\\\локаторы.txt");
		UiDriver.refDriver();

		//AreaInboxHelper.waitUntilIconDisk();
		//AreaInboxHelper.saveDisk();

		LandingPageHelper.HeaderPanelHelper.openDisk();

		DiskPageHelper.TestFileHelper.openDownload();

		DiskPageHelper.DownloadFileHelper.doRightClick();




	}













	}




