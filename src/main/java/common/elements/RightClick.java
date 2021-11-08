package common.elements;

import common.driver.UiDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class RightClick extends HtmlElement {
	public RightClick(By locator) {
		super(locator);
	}


	public void rightClick() {
		Actions actions = new Actions(UiDriver.getDriver());
		actions.contextClick((WebElement) locator).perform();

	}


}
