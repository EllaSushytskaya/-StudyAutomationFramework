package padeWrappers_Yandex_by.disk;

import common.elements.RightClick;
import org.openqa.selenium.By;

public class DownloadFile {
	public static final By CONTEXT_MENU_BUTTON_LOCATOR = By.xpath("(//div[contains(@class, \"listing-item__fields\")])[1]");

	public static RightClick getRightClickButton() {
		return new RightClick(CONTEXT_MENU_BUTTON_LOCATOR);
	}
}
