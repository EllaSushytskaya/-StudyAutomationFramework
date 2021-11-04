package padeWrappers_Yandex_by.landingPage;

import common.elements.Button;
import org.openqa.selenium.By;

public class AreaInbox {
	public static final By OPEN_DISK_BUTTON_LOCATOR = By.xpath("//a[@data-mid=\"177610710304424025\"]");
//svg[@class="svgicon svgicon-mail--Attach-Download_Disk"]

	public static Button getOpenDiskButton() {
		return new Button(OPEN_DISK_BUTTON_LOCATOR);
	}

}
