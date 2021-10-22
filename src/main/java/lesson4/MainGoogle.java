package lesson4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MainGoogle {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		WebElement searchField = driver.findElement(By.name("q"));

		searchField.sendKeys("Banana");
		searchField.sendKeys(Keys.ENTER);

		List<WebElement> searchResults =driver.findElements(By.tagName("h3"));
		WebElement firsElement =searchResults.get(1);
		firsElement.click();

		driver.navigate().refresh();

		new WebDriverWait(driver, Duration.ofSeconds(4))
				.withMessage("Not search result")
				.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h3")));



		driver.close();
	}
}
