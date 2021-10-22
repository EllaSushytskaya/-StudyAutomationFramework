package lesson4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MainWiki {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://ru.wikipedia.org/");
		driver.manage().window().maximize();

		WebElement searchField = driver.findElement(By.name("search"));

		searchField.sendKeys("Banana");
		searchField.sendKeys(Keys.ENTER);


		driver.close();
	}
}
