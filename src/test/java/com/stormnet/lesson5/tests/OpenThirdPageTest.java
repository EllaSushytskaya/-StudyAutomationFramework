package com.stormnet.lesson5.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class OpenThirdPageTest extends AbstractTest {

	@Test(testName = "OpenThirdPageTest")

	public void openThirdPageTest(){
	driver.get("https://www.google.com/");

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


		Assert.assertTrue(thirdElement.isDisplayed());



	}

}
