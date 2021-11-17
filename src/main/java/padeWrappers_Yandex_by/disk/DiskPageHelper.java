package padeWrappers_Yandex_by.disk;

import common.driver.UiDriver;
import common.driver.Waiter;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
		WebElement element = UiDriver.getDriver().findElement(By.xpath("(//div[contains(@class, \"listing-item listing-item_theme_tile\")])[1]"));
		Actions actions = new Actions(UiDriver.getDriver());
		actions.contextClick(element).build().perform();
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

	@Step("Wait until download ")
	public static void waitUntilDownloadFile() {
		Waiter.untilVisable(DiskPage.getOpenDownloadButton(), "Download not open");
	}





}
