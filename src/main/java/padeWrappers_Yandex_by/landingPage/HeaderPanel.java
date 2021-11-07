package padeWrappers_Yandex_by.landingPage;

import common.elements.Button;
import org.openqa.selenium.By;

public class HeaderPanel {
	private static final By OPEN_DISK_BUTTON_LOCATOR = By.xpath("//div[contains(@class, \"PSHeaderIcon-Image_Disk\")]");

	public static Button getOpenDiskButton() {
		return new Button(OPEN_DISK_BUTTON_LOCATOR);
	}
}

