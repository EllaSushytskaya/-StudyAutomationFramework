package padeWrappers_Yandex_by.disk;

import common.driver.UiDriver;
import common.elements.Button;
import common.elements.HtmlElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DiskPage {
	private static final By DOWNLOAD_BUTTON_LOCATOR = By.xpath("//span[contains(text(), \"Загрузки\")]//ancestor::a");
	private static final By MOVE_FILE_LOCATOR = By.xpath("//div[contains(@class, \"resources-actions-popup__action_type_move\")]");
	private static final By MOVE_FILE_IN_PACKAGE_FILE_LOCATOR = By.xpath("//button[contains(@class, \"confirmation-dialog__button_submit \")]");
	private static final By PACKAGE_FILE_LOCATOR = By.xpath("//span[contains(@class, \"Link Link_theme_normal drop-target crumbs2__item-inner\")]");
	private static final By BASKET_LOCATOR = By.xpath("//div[contains(@class, \"listing-item listing-item_theme_tile listing-item_size_m listing-item_type_dir js-prevent-drag js-prevent-deselect\")]");
	private static final By DOWNLOAD_FILE_LOCATOR = By.xpath("(//div[contains(@class, \"listing-item__icon listing-item__icon_type_icon listing-item__icon_resource_file\")])[1]");
	private static final By DOWNLOAD_FILE_IN_BASKET_LOCATOR = By.xpath("//div[contains(@class, \"listing-item listing-item_theme_tile listing-item_size_m listing-item_type_file js-prevent-deselect\")]");
	private static final By CONTEXT_FILE_LOCATOR = By.xpath("(//div[contains(@class, \"listing-item__icon listing-item__icon_type_icon listing-item__icon_resource_file\")])[1]");
	private static final By FILE_TO_MOVE_LOCATOR = By.xpath("//div[contains(@class, \"listing-item listing-item_theme_tile listing-item_size_m listing-item_type_file js-prevent-deselect\")]");


	public static Button getDownloadFile() {
		return new Button(DOWNLOAD_FILE_LOCATOR);
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

	public static Button getFileInBasket() {
		return new Button(DOWNLOAD_FILE_IN_BASKET_LOCATOR);
	}

	public static Button getBasketButton() {
		return new Button(BASKET_LOCATOR);
	}

	public static HtmlElement getContextMenu() {
		return new HtmlElement(CONTEXT_FILE_LOCATOR);

	}
	public static HtmlElement getFileToMove() {
		return new HtmlElement(FILE_TO_MOVE_LOCATOR);

	}
	public static HtmlElement getBasket() {
		return new HtmlElement(BASKET_LOCATOR);

	}
}




