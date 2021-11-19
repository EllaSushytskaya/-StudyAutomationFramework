package common.fileManager;

import java.io.File;
import java.util.UUID;

public class FileManager {

	public static File generateFile() {
		File file = new File(generateFileName().concat(".txt"));
		return file;
	}

	public static String generateFileName() {
		String number;
		number = UUID.randomUUID().toString().substring(0, 3);
		return number;

	}

}
