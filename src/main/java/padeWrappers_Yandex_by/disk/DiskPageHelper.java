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
		Waiter.untilVisable(DiskPage.getRelocateFileButton(), "Download not open");
	}

	@Step("Open context menu")
	public static void doRightClick() {
		WebElement element = UiDriver.getDriver().findElement(By.xpath("//div[contains(@class, \"listing-item__icon listing-item__icon_type_icon listing-item__icon_resource_file\")]"));
		Actions actions = new Actions(UiDriver.getDriver());
		actions.contextClick(element).build().perform();
	}


	@Step("Open download file and open context menu")
	public static void openDownloadFiledOpenContextMenu() {
		DiskPageHelper.waitUntilDownload();
		DiskPageHelper.openDownload();
		DiskPageHelper.waitUntilDownloadFile();
		DiskPageHelper.doRightClick();

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
