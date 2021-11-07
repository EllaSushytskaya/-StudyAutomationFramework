package padeWrappers_Yandex_by.landingPage;

import common.elements.Button;
import org.openqa.selenium.By;

public class AreaInbox {
	public static final By SAVE_ON_DISK_BUTTON_LOCATOR = By.xpath("(//a[contains(@class, \"mail-File-Actions-Item_secondary\")])[1]");

	//xPath for allert //div[contains(@class, "ComposeConfirmPopup-Content")]

	public static Button getSaveDiskButton() {
		return new Button(SAVE_ON_DISK_BUTTON_LOCATOR);
	}


}
