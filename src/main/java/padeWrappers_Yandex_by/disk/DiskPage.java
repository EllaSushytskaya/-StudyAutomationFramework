package padeWrappers_Yandex_by.disk;

import common.elements.Button;
import org.openqa.selenium.By;

public class DiskPage {
	private static final By CONTEXT_MENU_BUTTON_LOCATOR = By.xpath("div[contains(@class, \"listing-item__icon listing-item__icon_type_icon listing-item__icon_resource_file\")]");
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


}




