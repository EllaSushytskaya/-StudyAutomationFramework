package com.stormnet.tests.functionalTest;

import com.stormnet.tests.AbstractTest;
import common.driver.UiDriver;
import common.fileManager.FileManager;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import padeWrappers_Yandex_by.disk.DiskPageHelper;
import padeWrappers_Yandex_by.formMail.FormMailHelper;
import padeWrappers_Yandex_by.landingPage.LandingPageHelper;
import padeWrappers_Yandex_by.loginPage.LoginFormHelper;

import java.io.File;


public class SendAndDeleteMailTest extends AbstractTest {
	File file;

	@BeforeMethod
	public void openPage() {
		UiDriver.getDriver().get("https://mail.yandex.by/");
	}


	@Test
	@Story("Send and delete mail")
	public void sendAndDeleteMail() {
		file=FileManager.generateFile();
		LoginFormHelper.loginWithCreds("ella.sushitskaya", "happyMood");
		LandingPageHelper.WriteMailHelper.openFormWriteMail();
		FormMailHelper.writeMail("ella.sushitskaya@yandex.by", "test", "testform", "C:\\\\\\\\Users\\\\\\\\Гена\\\\\\\\test\\\\\\\\test.txt");
		UiDriver.refDriver();
		LandingPageHelper.AreaInboxHelper.saveOnDiskAndOpenToDisk();
		DiskPageHelper.openDownloadFileAndRelocateByContextMenu();
		DiskPageHelper.openPackageFileAndDeleteFileInBasket();

	}
}





