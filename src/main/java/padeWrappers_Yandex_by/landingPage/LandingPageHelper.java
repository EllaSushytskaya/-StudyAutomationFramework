package padeWrappers_Yandex_by.landingPage;


import common.driver.UiDriver;
import common.driver.Waiter;
import io.qameta.allure.Step;
import logerator.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class LandingPageHelper {
	public static class AreaInboxHelper {
		@Step("Save file on disk")
		public static void saveDisk() {
			WebElement elements = UiDriver.getDriver().findElement(By.xpath("(//a[contains(@class, \"mail-File-Actions-Item js-skip-click-message-item js-attachment-actions-item js-show-save-popup mail-File-Actions-Item_secondary\")])[1]"));
			JavascriptExecutor executor = (JavascriptExecutor) UiDriver.getDriver();
			executor.executeScript("arguments[0].click();", elements);
		}


		@Step("Wait until area inbox download file")
		public static void waitUntilAreaInbox() {
			Waiter.untilVisable(LandingPage.AreaDownload.getSaveOnDisk(), "File not download");
		}


		public static class HeaderPanelHelper {
			@Step("Open yandex disk")
			public static void openDisk() {
				LandingPage.HeaderPanel.getOpenDiskButton().click();
			}
		}

		@Step("Save on disk and open to disk")
		public static void saveOnDiskAndOpenToDisk() {
			AreaInboxHelper.waitUntilAreaInbox();
			AreaInboxHelper.saveDisk();
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
