package common.elements;

import common.driver.UiDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import padeWrappers_Yandex_by.disk.DiskPage;

public class Button extends HtmlElement {
	public Button(By locator) {
		super(locator);
	}

	public void click() {
		getElement().click();
	}

}
