package padeWrappers_Yandex_by.disk;

import common.driver.UiDriver;
import common.driver.Waiter;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class DiskPageHelper {

	@Step("Open download on disk")
	public static void openDownload() {
		DiskPage.getOpenDownloadButton().click();
	}

	@Step("Wait until download ")
	public static void waitUntilDownload() {
		Waiter.untilVisable(DiskPage.getOpenDownloadButton(), "Download not open");
	}

	@Step("Open context menu")
	public static void doRightClick() {
		WebElement element = UiDriver.getDriver().findElement(By.xpath("//div[contains(@class, \"listing-item__icon listing-item__icon_type_icon listing-item__icon_resource_file\")]"));
		Actions actions = new Actions(UiDriver.getDriver());
		actions.contextClick(element).build().perform();
	}

	@Step("Wait until download ")
	public static void waitUntilDownloadFile() {
		Waiter.untilVisable(DiskPage.getOpenDownloadButton(), "Download not open");
	}

	@Step("Move to file context menu")
	public static void moveToFile() {
		DiskPage.getClickMoveToFileContextMenu().click();
	}

	@Step("Move to file n package file")
	public static void moveToFileInPackageFile() {
		DiskPage.getMoveToFileInPackageFile().click();
	}


	@Step("Open download file and open context menu")
	public static void openDownloadFileAndRelocateByContextMenu() {
		DiskPageHelper.waitUntilDownload();
		DiskPageHelper.openDownload();
		DiskPageHelper.waitUntilDownloadFile();
		DiskPageHelper.doRightClick();
		DiskPageHelper.moveToFile();
		DiskPageHelper.moveToFileInPackageFile();

	}

	@Step("Wait until File")
	public static void waitUntilOpenFile() {
		Waiter.untilVisable(DiskPage.getFileButton(), "Package File not open");
	}

	@Step("Open package File")
	public static void openPackageFile() {
		DiskPage.getFileButton().click();

	}

	@Step("Open context menu")
	public static void relocateFileInBasket() {
		WebElement element = UiDriver.getDriver().findElement(By.xpath("(//div[contains(@class, \"listing-item__fields\")])[3]"));
		WebElement elementBasket = UiDriver.getDriver().findElement(By.xpath("//div[contains(@class, \"listing-item listing-item_theme_tile listing-item_size_m listing-item_type_dir js-prevent-drag js-prevent-deselect\")]"));
		Actions actions = new Actions(UiDriver.getDriver());
		actions.dragAndDrop(element,elementBasket).build().perform();
	}
	@Step("Open basket")
	public static void openBasket() {
		DiskPage.getBasketButton().click();


	}


	@Step("Open package file and delete file in basket")
	public static void openPackageFileAndDeleteFileInBasket() {
		DiskPageHelper.waitUntilOpenFile();
		DiskPageHelper.openPackageFile();
		DiskPageHelper.relocateFileInBasket();
		DiskPageHelper.openBasket();


	}

}
