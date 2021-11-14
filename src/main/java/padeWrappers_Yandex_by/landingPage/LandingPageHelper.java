package padeWrappers_Yandex_by.landingPage;

import common.driver.Waiter;
import io.qameta.allure.Step;
import logerator.Logger;

public class LandingPageHelper {
	public static class AreaInboxHelper {
		public static void waitUntilIconDisk() {
			Waiter.untilVisable(LandingPage.AreaInbox.SAVE_ON_DISK_BUTTON_LOCATOR, "Page was not opened");
		}

		public static void saveDisk() {
			LandingPage.AreaInbox.getSaveDiskButton().click();
		}
	}

	public static class HeaderPanelHelper {
		public static void openDisk() {
			LandingPage.HeaderPanel.getOpenDiskButton().click();
		}
	}

	public static class WriteMailHelper {
		@Step("Click button Write")
		public static void openMail() {
			LandingPage.WriteMail.getOpenFormWriteMailButton().click();
		}
		@Step("Wait until open form mail")
		public static void waitUntilOpenedFormMail() {
			Waiter.untilVisable(LandingPage.WriteMail.OPEN_FORM_WRITE_MAIL_BUTTON_LOCATOR, "Page was not opened");
		}
		@Step("Open form write mail")
		public static void openFormWriteMail(){
			waitUntilOpenedFormMail();
			openMail();
			Logger.getLogger().info("Open form write mail");
		}


	}
}
