package pageobjects;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

/**
 * Google start page. Holds methods to interact with
 * given pages.
 * 
 */

public class StartPage {

	public static void checkElements() {
		$("#hplogo").isDisplayed();
		$("#gbqfq").isDisplayed();
	}
	
	public static void search(String q) {
		$("#gbqfq").setValue(q);
		$("#gbqfq").sendKeys(Keys.RETURN);
	}

}
