package padeWrappers_Yandex_by.disk;

import common.elements.Button;
import common.elements.RightClick;
import org.openqa.selenium.By;

public class DiskPage {
	public static class DownloadFile {
		public static final By CONTEXT_MENU_BUTTON_LOCATOR = By.id("item-16364880716545584-4");

		public static RightClick getRightClickButton() {
			return new RightClick(CONTEXT_MENU_BUTTON_LOCATOR);
		}
	}

	public static class TestFile {
		public static final By DOWNLOAD_BUTTON_LOCATOR = By.xpath("//span[contains(text(), \"Загрузки\")]//ancestor::a");
		public static final By RELOCATE_FILE_LOCATOR = By.id("item-16364064484887520-4");




		public static Button getOpenDownloadButton() {
			return new Button(DOWNLOAD_BUTTON_LOCATOR);
		}
		public static Button getRelocateFileButton() {
			return new Button(DOWNLOAD_BUTTON_LOCATOR);
		}



	}
}
