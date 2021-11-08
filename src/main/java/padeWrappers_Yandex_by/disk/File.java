package padeWrappers_Yandex_by.disk;

import common.elements.Button;
import common.elements.RightClick;
import org.openqa.selenium.By;

public class File {
	public static final By DOWNLOAD_BUTTON_LOCATOR = By.xpath("//span[contains(text(), \"Загрузки\")]//ancestor::a");

	public static Button getOpenDownloadButton() {
		return new Button(DOWNLOAD_BUTTON_LOCATOR);
	}



}


