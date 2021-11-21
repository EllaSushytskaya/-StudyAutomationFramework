package common.elements;

import org.openqa.selenium.By;


public class Attach extends HtmlElement{


	public Attach(By locator) {
		super(locator);
	}

	public void attach(String file) {
		getElement().sendKeys(file);

	}



}