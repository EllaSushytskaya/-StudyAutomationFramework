package padeWrappers_Yandex_by.disk;

import common.elements.Button;
import org.openqa.selenium.By;

public class DiskPage {
	private static final By CONTEXT_MENU_BUTTON_LOCATOR = By.xpath("//div[contains(@class, \"listing-item__icon listing-item__icon_type_icon listing-item__icon_resource_file\")]");
	private static final By DOWNLOAD_BUTTON_LOCATOR = By.xpath("//span[contains(text(), \"Загрузки\")]//ancestor::a");
	private static final By MOVE_FILE_LOCATOR = By.xpath("//div[contains(@class, \"resources-actions-popup__action_type_move\")]");
	private static final By MOVE_FILE_IN_PACKAGE_FILE_LOCATOR = By.xpath("//span[contains(text(), \"Переместить\")]");
	private static final By PACKAGE_FILE_LOCATOR = By.xpath("//a[contains(text(), \"Файлы\")]//ancestor::a");

	public static Button getRightClickButton() {
		return new Button(CONTEXT_MENU_BUTTON_LOCATOR);
	}

	public static Button getOpenDownloadButton() {
		return new Button(DOWNLOAD_BUTTON_LOCATOR);
	}

	public static Button getClickMoveToFileContextMenu() {
		return new Button(MOVE_FILE_LOCATOR);
	}

	public static Button getMoveToFileInPackageFile() {
		return new Button(MOVE_FILE_IN_PACKAGE_FILE_LOCATOR);
	}

	public static Button getFileButton() {
		return new Button(PACKAGE_FILE_LOCATOR);
	}
}




