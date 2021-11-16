package padeWrappers_Yandex_by.disk;

import common.driver.UiDriver;
import common.driver.Waiter;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class DiskPageHelper {
	private static final By CONTEXT_MENU_BUTTON_LOCATOR = By.xpath("//div[contains(@class, \"listing-item listing-item_theme_tile listing-item_size_m listing-item_type_file js-prevent-deselect\")]");

	@Step("Open download on disk")
	public static void openDownload() {
		DiskPage.getOpenDownloadButton().click();
	}

	@Step("Wait until download ")
	public static void waitUntilDownload() {
		Waiter.untilVisable(DiskPage.getRelocateFileButton(), "Download not open");
	}

	@Step("Open context menu")
	public static void doRightClick() {
		Actions actions = new Actions((WebDriver) UiDriver.getDriver().findElement(CONTEXT_MENU_BUTTON_LOCATOR));
		actions.contextClick(DiskPage.RightClick.getRightClickButton()).perform();
	}
	@Step("Open download file and open context menu")
	public static void openDownloadFiledOpenContextMenu() {
		DiskPageHelper.waitUntilDownload();
		DiskPageHelper.openDownload();
		DiskPageHelper.waitUntilDownloadFile();
		//DiskPageHelper.doRightClick(DiskPage.RightClick.getRightClickButton());
	}


	@Step("Wait until download ")
	public static void waitUntilDownloadFile() {
		Waiter.untilVisable(DiskPage.getOpenDownloadButton(), "Download not open");
	}


	@Step("Relocate file")
	public static void relocateFile() {
		Actions action = new Actions(UiDriver.getDriver());
		DiskPage.getRelocateFileButton().click();
	}


}
