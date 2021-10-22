package lesson4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MainGoogle {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		WebElement searchField = driver.findElement(By.name("q"));

		searchField.sendKeys("youtube");
		searchField.sendKeys(Keys.ENTER);

		List<WebElement> searchResults = driver.findElements(By.tagName("mouseover-overlay"));
		WebElement firsElement = searchResults.get(0);
		firsElement.click();


		WebElement searchField2 = driver.findElement(By.name("search_query"));
		searchField2.sendKeys("banana");
		searchField2.sendKeys(Keys.ENTER);



		WebElement searchVideo = driver.findElement(By.tagName("ytd-moving-thumbnail-renderer[@class=\"style-scope ytd-thumbnail\"]"));
		searchVideo.click();


		Thread.sleep(1000);


//		driver.navigate().refresh();
//
//		new WebDriverWait(driver, Duration.ofSeconds(4))
//				.withMessage("Not search result")
//				.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h3")));


		driver.close();
	}
}
