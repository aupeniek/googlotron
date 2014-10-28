package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import pageobjects.Common;
import pageobjects.ResultsPage;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ex.ElementNotFound;

import util.TestWrapper;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.timeout;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class basicTests extends TestWrapper{
	
	@BeforeClass
	public static void openDashboard() {
		timeout = BASE_TIMEOUT;
		baseUrl = BASE_URL;
		open("/");
	}

	@AfterClass
	public static void logout() {
		open(baseUrl);
	}
	
	@Test
	public void checkStartPage() {
		pageobjects.StartPage.checkElements();
	}
	
	@Test
	public void simpleSearch() {
		open("?hl=en");
		System.out.println("Logged in: " + Common.userLoggedIn());
		pageobjects.StartPage.search("test");
		final ResultsPage results = page(ResultsPage.class);
		System.out.println(results.getResultsCount());
		System.out.println("Load time: " + results.getPageLoadTime());
	}
	
	@Test 
	public void getTips() {
		String q = "How to sl";
		$("#gbqfq").setValue(q);
		ElementsCollection tips = $$("li.sbsb_c");
		
		for (SelenideElement tip : tips) {
				System.out.println("Tip: " + tip.getText());
		}
	}
	
	
}
