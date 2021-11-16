package padeWrappers_Yandex_by.landingPage;

import common.elements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LandingPage {


	public static class AreaInbox {
		private static final By SAVE_ON_DISK_BUTTON_LOCATOR = By.xpath("//div[contains(@class, \"listing-item__icon listing-item__icon_type_icon listing-item__icon_resource_file\")]");
		private static final By AREA_SAVE_ON_DISK_BUTTON_LOCATOR = By.xpath("//a[contains(@class, \"mail-File-Actions-Item_secondary\")][1]");
		public static WebElement saveOnDisk;

		public AreaInbox(WebElement element) {
			this.saveOnDisk = element;
		}

		public WebElement getSaveDiskButton() {
			return saveOnDisk.findElement(SAVE_ON_DISK_BUTTON_LOCATOR);
		}
	}
	public static class AreaDownload {
		private static final By AREA_SAVE_ON_DISK_BUTTON_LOCATOR = By.xpath("//span[contains(@class, \"button__text\")]");

		public static Button getAreaSaveOnDiskButton() {
			return new Button(AREA_SAVE_ON_DISK_BUTTON_LOCATOR);
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
