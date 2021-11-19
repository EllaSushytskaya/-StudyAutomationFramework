package padeWrappers_Yandex_by.landingPage;

import common.elements.Button;
import org.openqa.selenium.By;


public class LandingPage {


	public static class AreaDownload {
		private static final By SAVE_ON_DISK_BUTTON_LOCATOR = By.xpath("(//a[contains(@class, \"mail-File-Actions-Item js-skip-click-message-item js-attachment-actions-item js-show-save-popup mail-File-Actions-Item_secondary\")])[1]");
		private static final By AREA_DOWNLOAD_DISK_LOCATOR = By.xpath("//div[contains(@class, \"_nb-popup-content\")]");

		public static Button getSaveOnDisk() {
			return new Button(SAVE_ON_DISK_BUTTON_LOCATOR);
		}
		public static Button getDownloadDisk() {
			return new Button(AREA_DOWNLOAD_DISK_LOCATOR);
		}

	}

	public static class WriteMail {
		private static final By OPEN_FORM_WRITE_MAIL_BUTTON_LOCATOR = By.xpath("//a[contains(@class, \"mail-ComposeButton\")]");

		public static Button getOpenFormWriteMailButton() {
			return new Button(OPEN_FORM_WRITE_MAIL_BUTTON_LOCATOR);
		}
	}

	public static class HeaderPanel {
		private static final By OPEN_DISK_BUTTON_LOCATOR = By.xpath("//div[contains(@class, \"PSHeaderIcon-Image_Disk\")]");

		public static Button getOpenDiskButton() {
			return new Button(OPEN_DISK_BUTTON_LOCATOR);
		}
	}

}


