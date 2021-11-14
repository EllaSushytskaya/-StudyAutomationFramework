package common.elements;

import org.openqa.selenium.By;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class Attach extends HtmlElement{


	public Attach(By locator) {
		super(locator);
	}

	public void attach(String file) {

		getElement().sendKeys(file);

	}



}