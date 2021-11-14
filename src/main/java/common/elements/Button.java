package common.elements;

import common.driver.UiDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Button extends HtmlElement {
	public Button(By locator) {
		super(locator);
	}

	public void click() {
		getElement().click();
	}

	public void rightClick() {
		Actions actions = new Actions(UiDriver.getDriver());
		actions.contextClick((WebElement) locator).perform();

	}
}
