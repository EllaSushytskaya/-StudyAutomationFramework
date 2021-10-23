package lesson4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;


public class Main {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		WebElement searchField = driver.findElement(By.name("q"));
		searchField.sendKeys("Banana");
		searchField.sendKeys(Keys.ENTER);

		new WebDriverWait(driver,10)
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("q")));


		List<WebElement> searchResults = driver.findElements(By.tagName("cite"));
		WebElement thirdElement = searchResults.get(3);
		thirdElement.click();

		new WebDriverWait(driver,10)
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("h3")));

		Thread.sleep(5000);


		driver.close();
	}
}
