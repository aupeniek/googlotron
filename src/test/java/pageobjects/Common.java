package pageobjects;

import static com.codeborne.selenide.Condition.matchText;
import static com.codeborne.selenide.Selenide.$;
import junit.framework.Assert;

/**
 * Common interaction methods for UI elements
 * 
 */

public class Common {
	private static final int BASE_TIMEOUT = Integer.parseInt(System.getProperty("globaltimeout", "15000"));
	
	public static boolean userLoggedIn() {
		if ($(".gb_Xa").isDisplayed()) return false; else return true;
	}
	
	public static void login() {
		
	}
	
}
