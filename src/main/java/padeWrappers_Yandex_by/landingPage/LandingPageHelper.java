package padeWrappers_Yandex_by.landingPage;


import common.driver.UiDriver;
import common.driver.Waiter;
import io.qameta.allure.Step;
import logerator.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static common.driver.UiDriver.getDriver;
import static padeWrappers_Yandex_by.landingPage.LandingPage.HeaderPanel.getOpenDiskButton;


public class LandingPageHelper {
	public static class AreaInboxHelper {
		@Step("Save file on disk")
		public static void saveDisk(WebElement element) {
			JavascriptExecutor executor = (JavascriptExecutor) UiDriver.getDriver();
			executor.executeScript("arguments[0].click();", element);
		}

		@Step("Wait until area download disk")
		public static void waitUntilAreaDownloadDisk() {
			Waiter.untilVisable(LandingPage.AreaDownload.getAreaSaveOnDiskButton(), "File not download");

		}
		public static class HeaderPanelHelper {
			@Step("Open yandex disk")
			public static void openDisk() {
				LandingPage.HeaderPanel.getOpenDiskButton().click();
			}
		}

		@Step("Save on disk and open to disk")
		public static void saveOnDiskAndOpenToDisk() {
			//AreaInboxHelper.saveDisk(LandingPage.AreaInbox.saveOnDisk);
			//AreaInboxHelper.waitUntilAreaDownloadDisk();
			HeaderPanelHelper.openDisk();
		}
	}

	public static class WriteMailHelper {
		@Step("Click button Write")
		public static void openMail() {
			LandingPage.WriteMail.getOpenFormWriteMailButton().click();
		}

		@Step("Wait until open form mail")
		public static void waitUntilOpenedFormMail() {
			Waiter.untilVisable(LandingPage.WriteMail.getOpenFormWriteMailButton(), "Page was not opened");
		}

		@Step("Open form write mail")
		public static void openFormWriteMail() {
			waitUntilOpenedFormMail();
			openMail();
			Logger.getLogger().info("Open form write mail");
		}

	}
}
