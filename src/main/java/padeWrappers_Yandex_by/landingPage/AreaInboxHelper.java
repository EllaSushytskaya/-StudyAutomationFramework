package padeWrappers_Yandex_by.landingPage;


import common.driver.UiDriver;
import common.driver.Waiter;


public class AreaInboxHelper {

	public static void waitUntilIconDisk() {
		Waiter.untilVisable(AreaInbox.SAVE_ON_DISK_BUTTON_LOCATOR, "Page was not opened");
	}
	public static void saveDisk(){
		AreaInbox.getSaveDiskButton().click();
	}


}
