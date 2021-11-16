package padeWrappers_Yandex_by.disk;

import common.elements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DiskPage {
	private static final By CONTEXT_MENU_BUTTON_LOCATOR = By.xpath("//div[contains(@class, \"listing-item listing-item_theme_tile listing-item_size_m listing-item_type_file js-prevent-deselect\")]");
	public static final By DOWNLOAD_BUTTON_LOCATOR = By.xpath("//span[contains(text(), \"Загрузки\")]//ancestor::a");
	public static final By RELOCATE_FILE_LOCATOR = By.id("item-16364064484887520-4");

		public static Button getRightClickButton() {
			return new Button(CONTEXT_MENU_BUTTON_LOCATOR);
		}

	public static Button getOpenDownloadButton() {
		return new Button(DOWNLOAD_BUTTON_LOCATOR);
	}

	public static Button getRelocateFileButton() {
		return new Button(DOWNLOAD_BUTTON_LOCATOR);
	}

	public static class RightClick {
		private static final By CONTEXT_MENU_BUTTON_LOCATOR = By.xpath("//div[contains(@class, \"listing-item listing-item_theme_tile listing-item_size_m listing-item_type_file js-prevent-deselect\")]");
		private static WebElement rightClick;

		public RightClick(WebElement element) {
			this.rightClick = element;
		}

		public static WebElement getRightClickButton() {
			return rightClick.findElement(CONTEXT_MENU_BUTTON_LOCATOR);
		}

	}
}


