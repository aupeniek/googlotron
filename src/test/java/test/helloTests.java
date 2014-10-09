package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import util.SauceAuthentication;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.timeout;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class helloTests {
	
	@Test
	public void hello() {
		System.out.println("----> Hello!");
		final String BASE_URL = System.getProperty("endpoint");
		final int BASE_TIMEOUT = Integer.parseInt(System
				.getProperty("globaltimeout", "15000"));
		final int CHANGE_STATUS_TIMEOUT = Integer.parseInt(System
				.getProperty("statustimeout", "240000"));

		SauceAuthentication sa = new SauceAuthentication();
		WebDriver driver = getWebDriver();
		
		System.out.println("----> Hello!" + baseUrl);
		
		timeout = BASE_TIMEOUT;
		baseUrl = BASE_URL;
		open(baseUrl);
	}
	
}
