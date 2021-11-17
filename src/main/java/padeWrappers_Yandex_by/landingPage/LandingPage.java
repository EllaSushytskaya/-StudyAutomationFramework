package padeWrappers_Yandex_by.landingPage;

import common.elements.Button;
import common.elements.Input;
import org.openqa.selenium.By;


public class LandingPage {


	public static class AreaDownload {
		private static final By SAVE_ON_DISK_BUTTON_LOCATOR = By.xpath("//div[contains(@class, \"PSHeaderIcon-Image_Disk\")]");


		public static Button getSaveOnDisk() {
			return new Button(SAVE_ON_DISK_BUTTON_LOCATOR);
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


