package padeWrappers_Yandex_by.disk;

public class DiskPageHelper {
	public static class DownloadFileHelper {
		public static void doRightClick(){
			DiskPage.DownloadFile.getRightClickButton().rightClick();
		}

	}

	public static class TestFileHelper {

		public static void openDownload() {
			DiskPage.TestFile.getOpenDownloadButton().click();
		}

		public static void relocateFile() {
			DiskPage.TestFile.getRelocateFileButton().click();
		}


	}
}
